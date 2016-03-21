package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.db.PcBuildDefDao;
import com.aic.paas.dev.provider.db.PcBuildTaskDao;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.aic.paas.dev.provider.db.PcImageDefDao;
import com.aic.paas.dev.provider.svc.PcBuildTaskSvc;
import com.aic.paas.dev.provider.util.HttpClientUtil;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskCallBack;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskRequest;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskResponse;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.json.JSON;


public class PcBuildTaskSvcImpl implements PcBuildTaskSvc{
	static final Logger logger = LoggerFactory.getLogger(PcBuildTaskSvcImpl.class);
	@Autowired
	PcBuildDefDao buildDefDao;
	
	@Autowired
	PcBuildTaskDao buildTaskDao;
	
	@Autowired
	PcImageDefDao imageDefDao;
	
	@Autowired
	PcImageDao imageDao;
	
	private String paasTaskUrl;
	
	public void setPaasTaskUrl(String paasTaskUrl) {
		if(paasTaskUrl != null) {
			this.paasTaskUrl = paasTaskUrl.trim();
		}
	}
	private String paasDevUrl;
	public void setPaasDevUrl(String paasDevUrl) {
		if(paasDevUrl != null) {
			this.paasDevUrl = paasDevUrl.trim();
		}
	}
	
	@Override
	public Long saveBuildTask(PcBuildTask record,String namespace,String buildName,String imageFullName) {
		
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(namespace, "namespace");
		
		CPcBuildTask cbt = new CPcBuildTask();
		cbt.setBuildDefId(record.getBuildDefId());
		cbt.setDataStatus(1);
		cbt.setStatus(2);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
		List<PcBuildTask> pbtlist =buildTaskDao.selectList(cbt, "ID");
		if(pbtlist!=null && pbtlist.size()>0){
			 throw new ServiceException("正在构建中，请稍后再试！ ");
		}
		
		record.setDataStatus(1);
		
		PcBuildTaskRequest pbtr = new PcBuildTaskRequest();
		pbtr.setNamespace(namespace);
		pbtr.setRepo_name(buildName.substring(1).trim());
		pbtr.setImage_name(imageFullName.substring(1).trim());
		pbtr.setTag(record.getDepTag());
		pbtr.setCallback_url(paasDevUrl+"/dev/buildTaskMvc/updateBuildTaskByCallBack");
		
//		【构建】触发构建API接口开发post（消费方）---------------------------
		
		String jsonpbtr = JSON.toString(pbtr);
		String result = HttpClientUtil.sendPostRequest(paasTaskUrl+"/dev/buildTaskMvc/saveBuildTask", jsonpbtr);
		if("".equals(result)){
			throw new ServiceException("构建失败，请稍后再试！ ");
		}
		PcBuildTaskResponse pbtre = new PcBuildTaskResponse();
		pbtre = JSON.toObject(result, PcBuildTaskResponse.class);
		Long build_id = 0l;;
		String created_at = "";

		if(pbtre.getCreated_at()!=null) created_at=pbtre.getCreated_at();
		String status=pbtre.getStatus();
		
		//根据 所属构建定义[BUILD_DEF_ID]，查询构建定义记录
		if("error".equals(status)&&(pbtre.getBuild_id()==null||"".equals(pbtre.getBuild_id()))){
			record.setStatus(5);
			throw new ServiceException("构建失败，请稍后再试！ ");
		}
		if("started".equals(status)){
			record.setStatus(2);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
			record.setBackBuildId(pbtre.getBuild_id());
			build_id = Long.parseLong(pbtre.getBuild_id());
		}
		if("queue".equals(status)){
			record.setStatus(5);
			throw new ServiceException("构建资源已满，请稍后再试！ ");
		}
		
		String taskStartTime = created_at.replace("-", "").replace(":", "").replace(".", "").replace(" ", "");
		String subTaskStartTime = "";
		if(!"".equals(taskStartTime)){
			if(taskStartTime.length()>16){
				subTaskStartTime = taskStartTime.substring(0, 16);
			}else{
				subTaskStartTime = taskStartTime;
			}
			record.setTaskStartTime(Long.parseLong(subTaskStartTime));
		}
		
		
		
		buildTaskDao.save(record);
		return build_id ;
				
	}
	
	
	
	
	
	
	@Override
	public List<PcBuildTask> queryPcBuildTaskListForPage(Integer pageNum, Integer pageSize, CPcBuildTask cdt ,String orders) {
		List<PcBuildTask> buPcBuildTasks=buildTaskDao.selectList(pageNum, pageSize, cdt, orders);
		return buPcBuildTasks;
	}

	
	/**
	 * aic.tsd_hyh  2016.03.11
	 * 根据状态 buildId 去查 数据状态为2，3的List
	 * @param buildDefId
	 * * @param statuss
	 * @return
	 */
	@Override
	public List<PcBuildTask> selectTaskListByStatueId(Long buildDefId ,Integer[] statuss) {
		if(BinaryUtils.isEmpty(buildDefId)) {
			return new ArrayList<PcBuildTask>();
		}
		//Integer[] statuss = {2};  // 1=就绪    2=构建运行中   3=构建已中断     4=成功   5=失败
		CPcBuildTask cdt = new CPcBuildTask();
		cdt.setBuildDefId(buildDefId);
		cdt.setStatuss(statuss);
		return buildTaskDao.selectList(cdt,null);
	}

	@Override
	public int updatePcBuildTaskCdt(PcBuildTask record, CPcBuildTask cdt) {
		if(BinaryUtils.isEmpty(record) || BinaryUtils.isEmpty(cdt)) {
			return 0;
		}else{
			return buildTaskDao.updateByCdt(record, cdt);
		}
	}

public String updateBuildTaskByCallBack(PcBuildTaskCallBack pbtc,String imgRespId) {
		
		String mntId = pbtc.getMnt_id();
		String buildName = pbtc.getRepo_name();
		String depTag =pbtc.getTag();
		String backBuildId = pbtc.getBuild_id();
		String runStartTime = pbtc.getDuration();
		String taskEndTime =pbtc.getTime();
		String status =pbtc.getStatus();
		
		//2.根据租户id [MNT_ID]和repo_name[BUILD_NAME]和tag[DEP_TAG]获取一条 部署定义记录
		CPcBuildDef cbd = new CPcBuildDef();
		cbd.setMntId(Long.parseLong(mntId));
		cbd.setBuildName(buildName);
		
		cbd.setDepTagEqual(depTag);
		cbd.setDataStatus(1);
		List<PcBuildDef> cbdlist = buildDefDao.selectList(cbd, null);
		logger.info("paas-provider-dev:PcBuildTaskSvcImpl:updateBuildTaskByCallBack:cbdlist.size()="+ cbdlist.size());
		PcBuildDef pbd = new PcBuildDef();
		if(cbdlist!=null && cbdlist.size()>0){
			pbd =cbdlist.get(0);
		}
		//3.根据部署定义的id[BUILD_DEF_ID] 和tag[DEP_TAG]和 返回的buildId[BACK_BUILD_ID]，获取部署任务记录
		
		CPcBuildTask cbt = new CPcBuildTask();		
		CPcBuildTask cbtl = new CPcBuildTask();		
		if(pbd.getDepTag() != null)cbt.setDepTag(pbd.getDepTag());
		if(backBuildId!=null)cbt.setBackBuildIdEqual(backBuildId);
		if(pbd.getId()!=null)cbt.setBuildDefId(pbd.getId());
		cbt.setStatus(2);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
		
		PcBuildTask record = new PcBuildTask();
		record.setRunStartTime(Long.parseLong(runStartTime));//实际运行时间

		
		String ltaskEndTime = taskEndTime.replace("-", "").replace(":", "").replace(".", "").replace(" ", "").substring(0, 16);
		String subTaskEndTime = "";
		if(!"".equals(ltaskEndTime)){
			if(taskEndTime.length()>16){
				subTaskEndTime = ltaskEndTime.substring(0, 16);
			}else{
				subTaskEndTime = ltaskEndTime;
			}
			record.setTaskEndTime(Long.parseLong(subTaskEndTime));//任务结束时间
		}
		
		if("success".equals(status)){
			record.setStatus(4);    //1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
			record.setFinishType(1);//1=正常结束    2=人为中断
			cbtl.setStatus(4);
		}
		if("error".equals(status)){
			record.setStatus(5);
			record.setFinishType(1);
			cbtl.setStatus(5);
		}
		//4.更新构建任务表PC_BUILD_TASK
		Integer uppdateBuildTaskResult =buildTaskDao.updateByCdt(record, cbt);
		logger.info("paas-provider-dev:PcBuildTaskSvcImpl:updateBuildTaskByCallBack:uppdateBuildTaskResult="+ uppdateBuildTaskResult);
		if("error".equals(status)){
			return  "success";
		}
		if(pbd.getDepTag() != null)cbtl.setDepTag(pbd.getDepTag());
		if(backBuildId!=null)cbtl.setBackBuildIdEqual(backBuildId);
		if(pbd.getId()!=null)cbtl.setBuildDefId(pbd.getId());

		List<PcBuildTask> pbtlist = buildTaskDao.selectList(cbtl, "ID");
		logger.info("paas-provider-dev:PcBuildTaskSvcImpl:updateBuildTaskByCallBack:pbtlist.size() ="+ pbtlist.size() );
		if(pbtlist == null || pbtlist.size() <= 0){
			 throw new ServiceException("未查询到该构建任务！ ");
		}
		//根据构建任务表PC_BUILD_TASK的[所属镜像定义id  IMAGE_DEF_ID]，查询唯一一条镜像定义表[PC_IMAGE_DEF]记录
		Long imageDefId = pbd.getImageDefId();//获取镜像定义Id
		PcImageDef pid = imageDefDao.selectById(imageDefId);
		logger.info("paas-provider-dev:PcBuildTaskSvcImpl:updateBuildTaskByCallBack:pid ="+ pid );
		//5.插入一条镜像表[PC_IMAGE]记录
		PcImage pi = new PcImage();
		if(pbd.getId()!=null)pi.setDefId(pbd.getId());//所属定义
		if(pbd.getMntId()!=null)pi.setMntId(pbd.getMntId());//所属租户
		if(imgRespId!="")pi.setImgRespId(Long.parseLong(imgRespId));//所属镜像库,调用 资源管理模块中镜像库表[PC_IMAGE_REPOSITORY]中ID---------------------
		if(pid.getDirName()!=null)pi.setDirName(pid.getDirName());//目录名
		if(pid.getImageName()!=null)pi.setImageName(pid.getImageName());//镜像名
		if(pid.getImageFullName()!=null)pi.setImageFullName(pid.getImageFullName());//镜像全名
		if(pbd.getIsExternal()!=null)pi.setIsExternal(pbd.getIsExternal());//是否外部镜像
		if(pbd.getProductId()!=null)pi.setProductId(pbd.getProductId());
		if(pbd.getProjectId()!=null)pi.setProjectId(pbd.getProjectId());
		if(pbtlist.get(0).getId()!=null)pi.setBuildNo(pbtlist.get(0).getId().toString());//build号
		if(pbtlist.get(0).getRunStartTime()!=null)pi.setBuildTime(pbtlist.get(0).getRunStartTime());//构建时间
		if(pbtlist.get(0).getTaskUserId()!=null)pi.setBuildUser(pbtlist.get(0).getTaskUserId().toString());
		pi.setStatus(1);//1=快照  2=开发  3=测试  4=生产------------------------------
		pi.setDataStatus(1);//数据状态：1-正常 0-删除
		if(pbtlist.get(0).getDepTag()!=null)pi.setDepTag(pbtlist.get(0).getDepTag());
		if(pbtlist.get(0).getBackBuildId()!=null)pi.setBackBuildId(pbtlist.get(0).getBackBuildId());
		Long insertImageResult = Long.parseLong("0");
		String flag ="error";
		insertImageResult = imageDao.insert(pi);
		logger.info("paas-provider-dev:PcBuildTaskSvcImpl:updateBuildTaskByCallBack:insertImageResult ="+ insertImageResult );
		if(insertImageResult >=1){
			flag = "success";
		}
		return flag;
	}
	
	
	
	
	@Override
	public List<PcBuildTask> selectTaskListByCdt(CPcBuildTask cdt,String orders) {
		return buildTaskDao.selectList(cdt, orders);
	}

}

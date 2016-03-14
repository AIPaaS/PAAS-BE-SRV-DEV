package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.db.PcBuildDefDao;
import com.aic.paas.dev.provider.db.PcBuildTaskDao;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.aic.paas.dev.provider.db.PcImageDefDao;
import com.aic.paas.dev.provider.svc.PcBuildTaskSvc;
import com.aic.paas.dev.provider.util.HttpClientUtil;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskRequest;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskResponse;
import com.binary.core.util.BinaryUtils;
import com.binary.json.JSON;


public class PcBuildTaskSvcImpl implements PcBuildTaskSvc{

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
	
	
	@Override
	public Long saveBuildTask(PcBuildTask record,String mntCode) {
		
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(mntCode, "mntCode");
		
		//根据构建定义id，查询构建定义对象
		PcBuildDef pbd = buildDefDao.selectById(record.getBuildDefId());
		//根据镜像定义id，查询构建定义对象
		PcImageDef pid = imageDefDao.selectById(pbd.getImageDefId());
		
		if(pbd.getDepTag()!=null) record.setDepTag(pbd.getDepTag());
		if(pbd.getImageDefId()!=null) record.setImageDefId(pbd.getImageDefId());
		String depTag = "";
		if(pbd.getDepTag()!=null) depTag = pbd.getDepTag();
		record.setDepTag(depTag);
		record.setDataStatus(1);
		String buildName = pbd.getBuildName();
		String repo_name = buildName;
		
		String image_name =pid.getDirName()+"/"+pid.getImageName()+"/"+pid.getVersionNo();
		
		PcBuildTaskRequest pbtr = new PcBuildTaskRequest();
		pbtr.setNamespace(mntCode);
		pbtr.setRepo_name(repo_name);
		pbtr.setImage_name(image_name);
		pbtr.setTag(depTag);
		pbtr.setCallback_url("");
		
//		【构建】触发构建API接口开发post（消费方）---------------------------
		
		String jsonpbtr = JSON.toString(pbtr);
		String result = HttpClientUtil.sendPostRequest(paasTaskUrl+"/dev/buildTaskMvc/saveBuildTask", jsonpbtr);
		
		PcBuildTaskResponse pbtre = new PcBuildTaskResponse();
		pbtre = JSON.toObject(result, PcBuildTaskResponse.class);
		
		String namespace=pbtre.getNamespace();	
		String repo_name1 = pbtre.getRepo_name();
		String build_id=pbtre.getBuild_id();
		String created_at=pbtre.getCreated_at();
		String status=pbtre.getStatus();
		
		//此处调用task接口，获取 task中返回的参数result，后转化为map类型
		
		String taskStartTime = created_at.replace("-", "").replace(":", "").replace(".", "").replace(" ", "");
		record.setTaskStartTime(Long.parseLong(taskStartTime));
		record.setBackBuildId(build_id);
		
		//根据 所属构建定义[BUILD_DEF_ID]，查询构建定义记录
		
		if("started".equals(status)){
			record.setStatus(2);//1=就绪    2=构建运行中   3=构建中断中     4=成功   5=失败
		}
		if("queue".equals(status)){
			record.setStatus(3);
		}
		if("error".equals(status)){
			record.setStatus(5);
		}
		buildTaskDao.save(record);
		
		return Long.parseLong(build_id) ;
				
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
	

}

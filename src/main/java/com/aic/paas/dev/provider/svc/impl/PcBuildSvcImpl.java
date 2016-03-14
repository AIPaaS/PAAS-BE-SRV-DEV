package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.db.PcBuildDefDao;
import com.aic.paas.dev.provider.db.PcBuildTaskDao;
import com.aic.paas.dev.provider.db.PcImageDefDao;
import com.aic.paas.dev.provider.db.PcProductDao;
import com.aic.paas.dev.provider.db.PcProjectDao;
import com.aic.paas.dev.provider.svc.PcBuildSvc;
import com.aic.paas.dev.provider.svc.bean.PcBuildDefInfo;
import com.aic.paas.dev.provider.util.HttpClientUtil;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;
import com.binary.json.JSON;

public class PcBuildSvcImpl implements PcBuildSvc {
	
	
	@Autowired
	PcBuildDefDao buildDefDao;
	
	
	@Autowired
	PcProductDao productDao;
	
	
	@Autowired
	PcProjectDao projectDao;
	
	
	@Autowired
	PcImageDefDao imageDefDao;
	
	@Autowired
	PcBuildTaskDao buildTaskDao;
	
	private String paasTaskUrl;

	
	
	public void setPaasTaskUrl(String paasTaskUrl) {
		if(paasTaskUrl != null) {
			this.paasTaskUrl = paasTaskUrl.trim();
		}
	}
	
	@Override
	public Page<PcBuildDef> queryDefPage(Integer pageNum, Integer pageSize, CPcBuildDef cdt, String orders) {
		return buildDefDao.selectPage(pageNum, pageSize, cdt, orders);
	}

	
	
	@Override
	public List<PcBuildDef> queryDefList(CPcBuildDef cdt, String orders) {
		return buildDefDao.selectList(cdt, orders);
	}
	
	

	@Override
	public PcBuildDef queryDefById(Long id) {
		return buildDefDao.selectById(id);
	}
	
	
	
	private List<PcBuildDefInfo> fillDefInfo(List<PcBuildDef> ls) {
		List<PcBuildDefInfo> infos = new ArrayList<PcBuildDefInfo>();
		if(ls!=null && ls.size()>0) {
			Long[] defIds = new Long[ls.size()];
			Set<Long> productIds = new HashSet<Long>();
			Set<Long> projectIds = new HashSet<Long>();
			Set<Long> imageDefIds = new HashSet<Long>();
			
			//key=defIds
			Map<Long, PcBuildDefInfo> infomap = new HashMap<Long, PcBuildDefInfo>();
			
			for(int i=0; i<ls.size(); i++) {
				PcBuildDef def = ls.get(i);
				PcBuildDefInfo info = new PcBuildDefInfo();
				info.setDef(def);
				infos.add(info);
				defIds[i] = def.getId();
				infomap.put(defIds[i], info);
				
				Long productId = def.getProductId();
				Long projectId = def.getProjectId();
				Long imageDefId = def.getImageDefId();
				
				if(productId != null) productIds.add(productId);
				if(projectId != null) projectIds.add(projectId);
				if(imageDefId != null) imageDefIds.add(imageDefId);
			}
			
			if(productIds.size() > 0) {
				CPcProduct cdt = new CPcProduct();
				cdt.setIds(productIds.toArray(new Long[0]));
				List<PcProduct> pls = productDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProduct> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcBuildDefInfo info = infos.get(i);
						Long productId = info.getDef().getProductId();
						if(productId != null) {
							info.setProduct(map.get(productId));
						}
					}
				}
			}
			
			if(projectIds.size() > 0) {
				CPcProject cdt = new CPcProject();
				cdt.setIds(projectIds.toArray(new Long[0]));
				List<PcProject> pls = projectDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcProject> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcBuildDefInfo info = infos.get(i);
						Long projectId = info.getDef().getProjectId();
						if(projectId != null) {
							info.setProject(map.get(projectId));
						}
					}
				}
			}
			
			if(imageDefIds.size() > 0) {
				CPcImageDef cdt = new CPcImageDef();
				cdt.setIds(imageDefIds.toArray(new Long[0]));
				List<PcImageDef> pls = imageDefDao.selectList(cdt, null);
				if(pls.size() > 0) {
					Map<Long, PcImageDef> map = BinaryUtils.toObjectMap(pls, "ID");
					for(int i=0; i<infos.size(); i++) {
						PcBuildDefInfo info = infos.get(i);
						Long imageDefId = info.getDef().getImageDefId();
						if(imageDefId != null) {
							info.setImageDef(map.get(imageDefId));
						}
					}
				}
			}
			
			
			List<PcBuildTask> taskls = buildTaskDao.selectLastList(defIds);
			for(int i=0; i<taskls.size(); i++) {
				PcBuildTask task = taskls.get(i);
				infomap.get(task.getBuildDefId()).setLastBuildTask(task);
			}
		}
		
		return infos;		
	}
	
	
	
	@Override
	public Page<PcBuildDefInfo> queryDefInfoPage(Integer pageNum, Integer pageSize, CPcBuildDef cdt, String orders) {
		Page<PcBuildDef> page = queryDefPage(pageNum, pageSize, cdt, orders);
		List<PcBuildDef> ls = page.getData();
		List<PcBuildDefInfo> infols = fillDefInfo(ls);
		return new Page<PcBuildDefInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}


	

	@Override
	public List<PcBuildDefInfo> queryDefInfoList(CPcBuildDef cdt, String orders) {
		List<PcBuildDef> ls = queryDefList(cdt, orders);
		return fillDefInfo(ls);
	}



	@Override
	public PcBuildDefInfo queryByDefInfoId(Long id) {
		PcBuildDef def = queryDefById(id);
		if(def == null) return null;
		
		List<PcBuildDef> ls = new ArrayList<PcBuildDef>();
		ls.add(def);
		return fillDefInfo(ls).get(0);
	}

	
	
	
	
	@Override
	public Long saveOrUpdateDef(PcBuildDef record) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getMntId(), "record.mntId");
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getBuildName(), "record.buildName");
			BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getIsExternal().intValue() == 0) {
				BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
				BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
			}
			BinaryUtils.checkEmpty(record.getRespType(), "record.respType");
			BinaryUtils.checkEmpty(record.getRespUrl(), "record.respUrl");
			BinaryUtils.checkEmpty(record.getRespUser(), "record.respUser");
			BinaryUtils.checkEmpty(record.getRespPwd(), "record.respPwd");
			
			BinaryUtils.checkEmpty(record.getRespBranch(), "record.respBranch");
			BinaryUtils.checkEmpty(record.getDepTag(), "record.depTag");
			BinaryUtils.checkEmpty(record.getImageDefId(), "record.imageDefId");
			BinaryUtils.checkEmpty(record.getDockerFilePath(), "record.dockerFilePath");
		}else {
			if(record.getBuildName() != null) BinaryUtils.checkEmpty(record.getBuildName(), "record.buildName");
			if(record.getIsExternal() != null) BinaryUtils.checkEmpty(record.getIsExternal(), "record.isExternal");
			if(record.getProductId() != null) BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
			if(record.getProjectId() != null) BinaryUtils.checkEmpty(record.getProjectId(), "record.projectId");
			if(record.getRespType() != null) BinaryUtils.checkEmpty(record.getRespType(), "record.respType");
			if(record.getRespUrl() != null) BinaryUtils.checkEmpty(record.getRespUrl(), "record.respUrl");
			if(record.getRespUser() != null) BinaryUtils.checkEmpty(record.getRespUser(), "record.respUser");
			if(record.getRespPwd() != null) BinaryUtils.checkEmpty(record.getRespPwd(), "record.respPwd");
			if(record.getImageDefId() != null) BinaryUtils.checkEmpty(record.getImageDefId(), "record.imageDefId");
			if(record.getDockerFilePath() != null) BinaryUtils.checkEmpty(record.getDockerFilePath(), "record.dockerFilePath");
		}
		
//		Long id = record.getId();
		if(record.getBuildName() != null) {
			String name = record.getBuildName().trim();
			record.setBuildName(name);
		}
		String param = JSON.toString(record);
		String result = HttpClientUtil.sendPostRequest(paasTaskUrl+"/dev/buildDefMvc/buildDefApi", param);
		
		if(result!=null &&!"".equals(result)&&"000000".equals(result)){
			return buildDefDao.save(record);
		}else{
			 throw new ServiceException("调用接口失败! ");
		}
		
	}
	
	
	
	

	@Override
	public int removeDefById(Long id) {
		return buildDefDao.deleteById(id);
	}



	@Override
	public int checkBuildFullName(PcBuildDef record) {
		Long id = record.getId();
		if(record.getBuildName() != null) {
			String name = record.getBuildName().trim();
			record.setBuildName(name);
			
			CPcBuildDef cdt = new CPcBuildDef();
			cdt.setMntId(record.getMntId());
			List<PcBuildDef> ls = buildDefDao.selectListByFullBuildName(name, cdt, null);
			if(ls.size()>0 && (id==null || ls.size()>1 || ls.get(0).getId().longValue()!=id.longValue())) {
				return 0;
			}else{
				return 1;
			}
		}	
		return 0;
	}
	
	


	
	
	
	
	
	
	
	
}







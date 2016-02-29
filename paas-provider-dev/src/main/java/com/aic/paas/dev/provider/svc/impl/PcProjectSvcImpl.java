package com.aic.paas.dev.provider.svc.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.CPcProjectMgr;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.bean.PcProjectMgr;
import com.aic.paas.dev.provider.db.PcProductDao;
import com.aic.paas.dev.provider.db.PcProjectDao;
import com.aic.paas.dev.provider.db.PcProjectMgrDao;
import com.aic.paas.dev.provider.svc.PcProjectSvc;
import com.aic.paas.dev.provider.svc.bean.ProjectInfo;
import com.aic.paas.dev.provider.svc.bean.WsMerchent;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;

public class PcProjectSvcImpl implements PcProjectSvc {

	
	
	@Autowired
	PcProjectDao projectDao;
	
	@Autowired
	PcProjectMgrDao projectMgrDao;
	
	
	@Autowired
	PcProductDao productDao;
	
		
	
	
	@Override
	public Page<PcProject> queryPage(Integer pageNum, Integer pageSize, CPcProject cdt, String orders) {
		return projectDao.selectPage(pageNum, pageSize, cdt, orders);
	}
	
	

	@Override
	public List<PcProject> queryList(CPcProject cdt, String orders) {
		return projectDao.selectList(cdt, orders);
	}
	
	

	@Override
	public PcProject queryById(Long id) {
		return projectDao.selectById(id);
	}
	
	
	
	private List<ProjectInfo> fillOpInfo(List<PcProject> ls) {
		List<ProjectInfo> infos = new ArrayList<ProjectInfo>();
		if(ls!=null && ls.size()>0) {
			Map<Long, ProjectInfo> infomap = new HashMap<Long, ProjectInfo>();
			Long[] pIds = new Long[ls.size()];
			
			for(int i=0; i<ls.size(); i++) {
				PcProject p = ls.get(i);
				ProjectInfo info = new ProjectInfo();
				info.setProject(p);
				infos.add(info);
				
				pIds[i] = p.getId();
				infomap.put(pIds[i], info);
			}
			
			
			CPcProjectMgr cdt = new CPcProjectMgr();
			cdt.setProjectIds(pIds);
			List<PcProjectMgr> pmgrs = projectMgrDao.selectList(cdt, null);
			
			//key=opId, value=roleIds
			Map<Long, List<Long>> map = new HashMap<Long, List<Long>>();
			
			for(int i=0; i<pmgrs.size(); i++) {
				PcProjectMgr pm = pmgrs.get(i);
				Long pId = pm.getProjectId();
				Long mgrId = pm.getUserId();
				
				List<Long> os = map.get(pId);
				if(os == null) {
					os = new ArrayList<Long>();
					map.put(pId, os);
				}
				os.add(mgrId);
			}
			
			Iterator<Entry<Long, List<Long>>> itor = map.entrySet().iterator();
			while(itor.hasNext()) {
				Entry<Long, List<Long>> e = itor.next();
				Long pId = e.getKey();
				List<Long> mgrIds = e.getValue();
				
				ProjectInfo info = infomap.get(pId);
				info.setMgrIds(mgrIds.toArray(new Long[0]));
			}
		}
		return infos;
	}
	
	

	@Override
	public Page<ProjectInfo> queryInfoPage(Integer pageNum, Integer pageSize, CPcProject cdt, String orders) {
		Page<PcProject> page = queryPage(pageNum, pageSize, cdt, orders);
		List<PcProject> ls = page.getData();
		List<ProjectInfo> infols = fillOpInfo(ls);
		return new Page<ProjectInfo>(page.getPageNum(), page.getPageSize(), page.getTotalRows(), page.getTotalPages(), infols);
	}

	
	@Override
	public List<ProjectInfo> queryInfoList(CPcProject cdt, String orders) {
		List<PcProject> ls = queryList(cdt, orders);
		return fillOpInfo(ls);
	}
	
	

	@Override
	public ProjectInfo queryInfoById(Long id) {
		PcProject p = queryById(id);
		if(p != null) {
			List<PcProject> ls = new ArrayList<PcProject>();
			ls.add(p);
			return fillOpInfo(ls).get(0);
		}
		return null;
	}

	
	
	
	@Override
	public Page<PcProject> queryMgrPage(Integer pageNum, Integer pageSize, Long mgrId, CPcProject cdt, String orders) {
		return projectDao.selectMgrPage(pageNum, pageSize, mgrId, cdt, orders);
	}

	
	@Override
	public List<PcProject> queryMgrList(Long mgrId, CPcProject cdt, String orders) {
		return projectDao.selectMgrList(mgrId, cdt, orders);
	}

	
	
	@Override
	public Long saveOrUpdate(PcProject record, WsMerchent mnt) {
		BinaryUtils.checkEmpty(record, "record");
		BinaryUtils.checkEmpty(record.getProductId(), "record.productId");
		if(record.getCode()!=null && record.getCode().trim().equalsIgnoreCase("doc")) {
			throw new ServiceException(" The project name is not allowed to 'doc'! ");
		}
		
		boolean isadd = record.getId() == null;
		if(isadd) {
			BinaryUtils.checkEmpty(record.getCompRoomId(), "record.compRoomId");
			BinaryUtils.checkEmpty(record.getCode(), "record.code");
			BinaryUtils.checkEmpty(record.getName(), "record.name");
			BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			record.setRespDocStatus(1);	//1=未开通    2=待开通    3=已开通
			record.setRespCodeStatus(1);	//1=未开通    2=待开通    3=已开通
		}else {
			if(record.getCompRoomId() != null) BinaryUtils.checkEmpty(record.getCompRoomId(), "record.compRoomId");
			if(record.getCode() != null) BinaryUtils.checkEmpty(record.getCode(), "record.code");
			if(record.getName() != null) BinaryUtils.checkEmpty(record.getName(), "record.name");
			if(record.getStatus() != null) BinaryUtils.checkEmpty(record.getStatus(), "record.status");
			if(record.getImageRegUrl() != null) BinaryUtils.checkEmpty(record.getImageRegUrl(), "record.imageRegUrl");
			record.setRespDocStatus(null);
			record.setRespCodeStatus(null);
		}
		
		record.setRespDocType(null);
		record.setRespDocUrl(null);
		record.setRespDocApplyId(null);
		record.setRespCodeType(null);
		record.setRespCodeUrl(null);
		record.setRespCodeApplyId(null);
		
		Long id = record.getId();
		if(record.getCode() != null) {
			String code = record.getCode().trim();
			record.setCode(code);
			
			CPcProject cdt = new CPcProject();
			cdt.setProductId(record.getProductId());
			cdt.setCodeEqual(code);
			List<PcProject> ls = projectDao.selectList(cdt, null);
			if(ls.size()>0 && (id==null || ls.size()>1 || ls.get(0).getId().longValue()!=id.longValue())) {
				throw new ServiceException(" is exists code '"+code+"'! ");
			}
		}
		
		if(isadd) {
			//如果镜像库名为空, 则默认生成  租户代码/产品代码/工程代码
			if(BinaryUtils.isEmpty(record.getImageRegUrl())) {
				PcProduct product = productDao.selectById(record.getProductId());
				if(product == null) {
					throw new ServiceException(" not found product by id '"+record.getProductId()+"'! ");
				}
				
				BinaryUtils.checkEmpty(mnt, "parameter-mnt");
				record.setImageRegUrl("/"+mnt.getMntCode()+"/"+product.getCode()+"/"+record.getCode());
			}
		}
		
		return projectDao.save(record);
	}

	
	
	
	@Override
	public int removeById(Long id) {
		CPcProjectMgr cdt = new CPcProjectMgr();
		cdt.setProjectId(id);
		projectMgrDao.deleteByCdt(cdt);
		return projectDao.deleteById(id);
	}
	
	
	

	@Override
	public void setProjectMgrs(Long projectId, Long[] mgrIds) {
		BinaryUtils.checkEmpty(projectId, "projectId");
		
		//删除工程对应管理员
		CPcProjectMgr oprolecdt = new CPcProjectMgr();
		oprolecdt.setProjectId(projectId);
		projectMgrDao.deleteByCdt(oprolecdt);
		
		if(mgrIds!=null && mgrIds.length>0) {
			List<PcProjectMgr> records = new ArrayList<PcProjectMgr>();
			for(int i=0; i<mgrIds.length; i++) {
				PcProjectMgr r = new PcProjectMgr();
				r.setProjectId(projectId);
				r.setUserId(mgrIds[i]);
				records.add(r);
			}
			
			projectMgrDao.insertBatch(records);
		}
	}
	
	
	
	
	
	
	

}

package com.aic.paas.dev.provider.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aic.paas.comm.util.CommUtil;
import com.aic.paas.comm.util.SystemUtil;
import com.aic.paas.dev.provider.bean.CVcMntRepositoryApply;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.bean.VcMntRepositoryApply;
import com.aic.paas.dev.provider.db.PcProductDao;
import com.aic.paas.dev.provider.db.PcProjectDao;
import com.aic.paas.dev.provider.db.VcMntRepositoryApplyDao;
import com.aic.paas.dev.provider.svc.VcMntRepositoryApplySvc;
import com.aic.paas.dev.provider.svc.bean.ContType;
import com.aic.paas.dev.provider.svc.bean.RespType;
import com.aic.paas.dev.provider.svc.bean.SourceType;
import com.binary.core.bean.BMProxy;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.bean.User;
import com.binary.framework.exception.ServiceException;
import com.binary.jdbc.Page;

public class VcMntRepositoryApplySvcImpl implements VcMntRepositoryApplySvc {
	
	
	@Autowired
	VcMntRepositoryApplyDao mntRespApplyDao;
	
	@Autowired
	PcProductDao productDao;
	
	@Autowired
	PcProjectDao projectDao;
	
	

	@Override
	public Page<VcMntRepositoryApply> queryPage(Integer pageNum, Integer pageSize, CVcMntRepositoryApply cdt, String orders) {
		return mntRespApplyDao.selectPage(pageNum, pageSize, cdt, orders);
	}

	
	

	@Override
	public List<VcMntRepositoryApply> queryList(CVcMntRepositoryApply cdt, String orders) {
		return mntRespApplyDao.selectList(cdt, orders);
	}

	

	@Override
	public VcMntRepositoryApply queryById(Long id) {
		return mntRespApplyDao.selectById(id);
	}
	
	

	@Override
	public Long createApply(Long mntId, RespType respType, ContType contType, SourceType sourceType, Long sourceId, String remark) {
		BinaryUtils.checkEmpty(mntId, "mntId");
		BinaryUtils.checkEmpty(respType, "respType");
		BinaryUtils.checkEmpty(contType, "contType");
		BinaryUtils.checkEmpty(sourceType, "sourceType");
		BinaryUtils.checkEmpty(sourceId, "sourceId");

		VcMntRepositoryApply record = new VcMntRepositoryApply();
		record.setMntId(mntId);
		record.setRespType(respType.getValue());
		record.setContType(contType.getValue());
		record.setSourceType(sourceType.getValue());
		record.setSourceId(sourceId);
		record.setRemark(remark);
		record.setStatus(0); 		//0=待开通    1=已开通
		record.setApplyTime(BinaryUtils.getNumberDateTime());
		
		User user = SystemUtil.getLoginUser();
		record.setAppliorId(user.getId());
		record.setAppliorName(user.getUserName());
		
		fillSourceFields(record, respType, contType, sourceType, sourceId);
		Long applyId = mntRespApplyDao.insert(record);
		record.setId(applyId);
		
		VcMntRepositoryApply up = new VcMntRepositoryApply();
		String strid = CommUtil.fillPrefixZero(applyId, 8);
		if(strid.length() > 8) strid = strid.substring(0, 8);
		String code = BinaryUtils.getNumberDate() + strid;
		up.setCode(Long.valueOf(code));
		mntRespApplyDao.updateById(up, applyId);
		
		//更新来源表信息
		updateSourceRecord(record, 0);
		
		return applyId;
	}
	
	
	
	
	/**
	 * 补充来源信息字段
	 */
	private void fillSourceFields(VcMntRepositoryApply record, RespType respType, ContType contType, SourceType sourceType, Long sourceId) {
		String suburl = "";
		if(sourceType == SourceType.PRODUCT) {
			PcProduct product = productDao.selectById(sourceId);
			if(product == null) {
				throw new ServiceException(" not found product by id '"+sourceId+"'! ");
			}
			BinaryUtils.checkEmpty(product, "product["+sourceId+"].compRoomId");
			record.setCompRoomId(product.getCompRoomId());
			suburl = product.getCode()+"/"+contType.name().toLowerCase();
		}else if(sourceType == SourceType.PROJECT) {
			PcProject project = projectDao.selectById(sourceId);
			if(project == null) {
				throw new ServiceException(" not found project by id '"+sourceId+"'! ");
			}
			BinaryUtils.checkEmpty(project, "project["+sourceId+"].compRoomId");
			record.setCompRoomId(project.getCompRoomId());
			
			PcProduct product = productDao.selectById(project.getProductId());
			if(product == null) {
				throw new ServiceException(" not found product by id '"+project.getProductId()+"'! ");
			}
			
			suburl = product.getCode()+"/"+project.getCode()+"/"+contType.name().toLowerCase();
		}
		
		record.setRespUrl(suburl);
	}
	
	
	
	/**
	 * 更新来源表信息, 以后可改为消息
	 * @param record
	 * @param status 0=待开通    1=已开通
	 */
	private void updateSourceRecord(VcMntRepositoryApply record, int status) {
		SourceType sourceType = SourceType.valueOf(record.getSourceType());
		ContType contType = ContType.valueOf(record.getContType());
		if(sourceType == SourceType.PRODUCT) {
			PcProduct up = new PcProduct();
			if(contType == ContType.DOC) {
				up.setRespDocStatus(status==0 ? 2 : 3);		//1=未开通    2=待开通    3=已开通
				if(status == 0) {
					up.setRespDocType(record.getRespType());
					up.setRespDocApplyId(record.getId());
				}else if(status == 1) {
					up.setRespDocUrl(record.getRespUrl());
				}
			}
			int count = productDao.updateById(up, record.getSourceId());
			if(count == 0) {
				throw new ServiceException(" not found product by id '"+record.getSourceId()+"'! ");
			}
		}else if(sourceType == SourceType.PROJECT) {
			PcProject up = new PcProject();
			if(contType == ContType.DOC) {
				up.setRespDocStatus(status==0 ? 2 : 3);		//1=未开通    2=待开通    3=已开通
				if(status == 0) {
					up.setRespDocType(record.getRespType());
					up.setRespDocApplyId(record.getId());
				}else if(status == 1) {
					up.setRespDocUrl(record.getRespUrl());
				}
			}else if(contType == ContType.CODE) {
				up.setRespCodeStatus(status==0 ? 2 : 3);		//1=未开通    2=待开通    3=已开通
				if(status == 0) {
					up.setRespCodeType(record.getRespType());
					up.setRespCodeApplyId(record.getId());
				}else if(status == 1) {
					up.setRespCodeUrl(record.getRespUrl());
				}
			}
			int count = projectDao.updateById(up, record.getSourceId());
			if(count == 0) {
				throw new ServiceException(" not found project by id '"+record.getSourceId()+"'! ");
			}
		}
	}
	

	
	@Override
	public void openUpSvn(Long applyId, String remark) {
		BinaryUtils.checkEmpty(applyId, "applyId");
		openUp(applyId, null, remark);
	}




	@Override
	public void openUpGit(Long applyId, String respUrl, String remark) {
		BinaryUtils.checkEmpty(applyId, "applyId");
		BinaryUtils.checkEmpty(respUrl, "respUrl");
		openUp(applyId, respUrl, remark);
	}
	

	
	private void openUp(Long applyId, String respUrl, String remark) {
		VcMntRepositoryApply record = mntRespApplyDao.selectById(applyId);
		if(record == null) {
			throw new ServiceException(" not found MntRepositoryApply by id '"+applyId+"'! ");
		}
		
		VcMntRepositoryApply up = new VcMntRepositoryApply();
		up.setStatus(1); 	//0=待开通    1=已开通
		up.setCheckTime(BinaryUtils.getNumberDateTime());
		
		User user = SystemUtil.getLoginUser();
		up.setCheckerId(user.getId());
		up.setCheckerName(user.getUserName());
		up.setCheckDesc(remark);
		if(!BinaryUtils.isEmpty(respUrl)) {
			up.setRespUrl(respUrl);
		}
		
		mntRespApplyDao.updateById(up, applyId);
		
		//更新来源表信息
		BMProxy<VcMntRepositoryApply> proxy = BMProxy.getInstance(record);
		proxy.copyFrom(up, true);
		updateSourceRecord(record, 1);
	}




	

}

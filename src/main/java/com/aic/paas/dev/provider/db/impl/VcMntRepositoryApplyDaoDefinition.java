package com.aic.paas.dev.provider.db.impl;


import com.aic.paas.dev.provider.bean.CVcMntRepositoryApply;
import com.aic.paas.dev.provider.bean.VcMntRepositoryApply;
import com.binary.framework.dao.DaoDefinition;


/**
 * 版本库申请表[VC_MNT_REPOSITORY_APPLY]数据访问对象定义实现
 */
public class VcMntRepositoryApplyDaoDefinition implements DaoDefinition<VcMntRepositoryApply, CVcMntRepositoryApply> {


	@Override
	public Class<VcMntRepositoryApply> getEntityClass() {
		return VcMntRepositoryApply.class;
	}


	@Override
	public Class<CVcMntRepositoryApply> getConditionClass() {
		return CVcMntRepositoryApply.class;
	}


	@Override
	public String getTableName() {
		return "VC_MNT_REPOSITORY_APPLY";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(VcMntRepositoryApply record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CVcMntRepositoryApply cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(VcMntRepositoryApply record, String creator) {
	}


	@Override
	public void setModifierValue(VcMntRepositoryApply record, String modifier) {
	}


}



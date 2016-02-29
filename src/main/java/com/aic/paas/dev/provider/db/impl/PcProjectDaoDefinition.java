package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcProject;


/**
 * 产品工程表[PC_PROJECT]数据访问对象定义实现
 */
public class PcProjectDaoDefinition implements DaoDefinition<PcProject, CPcProject> {


	@Override
	public Class<PcProject> getEntityClass() {
		return PcProject.class;
	}


	@Override
	public Class<CPcProject> getConditionClass() {
		return CPcProject.class;
	}


	@Override
	public String getTableName() {
		return "PC_PROJECT";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcProject record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcProject cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcProject record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(PcProject record, String modifier) {
		record.setModifier(modifier);
	}


}



package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildDef;


/**
 * 构建定义表[PC_BUILD_DEF]数据访问对象定义实现
 */
public class PcBuildDefDaoDefinition implements DaoDefinition<PcBuildDef, CPcBuildDef> {


	@Override
	public Class<PcBuildDef> getEntityClass() {
		return PcBuildDef.class;
	}


	@Override
	public Class<CPcBuildDef> getConditionClass() {
		return CPcBuildDef.class;
	}


	@Override
	public String getTableName() {
		return "PC_BUILD_DEF";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcBuildDef record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcBuildDef cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcBuildDef record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(PcBuildDef record, String modifier) {
		record.setModifier(modifier);
	}


}



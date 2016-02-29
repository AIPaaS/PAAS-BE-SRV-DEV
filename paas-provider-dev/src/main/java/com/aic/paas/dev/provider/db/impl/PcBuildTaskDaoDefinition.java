package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;


/**
 * 构建任务表[PC_BUILD_TASK]数据访问对象定义实现
 */
public class PcBuildTaskDaoDefinition implements DaoDefinition<PcBuildTask, CPcBuildTask> {


	@Override
	public Class<PcBuildTask> getEntityClass() {
		return PcBuildTask.class;
	}


	@Override
	public Class<CPcBuildTask> getConditionClass() {
		return CPcBuildTask.class;
	}


	@Override
	public String getTableName() {
		return "PC_BUILD_TASK";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcBuildTask record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcBuildTask cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcBuildTask record, String creator) {
	}


	@Override
	public void setModifierValue(PcBuildTask record, String modifier) {
	}


}



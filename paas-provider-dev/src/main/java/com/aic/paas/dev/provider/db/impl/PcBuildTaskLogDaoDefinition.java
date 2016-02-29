package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcBuildTaskLog;
import com.aic.paas.dev.provider.bean.PcBuildTaskLog;


/**
 * 任务日志表[PC_BUILD_TASK_LOG]数据访问对象定义实现
 */
public class PcBuildTaskLogDaoDefinition implements DaoDefinition<PcBuildTaskLog, CPcBuildTaskLog> {


	@Override
	public Class<PcBuildTaskLog> getEntityClass() {
		return PcBuildTaskLog.class;
	}


	@Override
	public Class<CPcBuildTaskLog> getConditionClass() {
		return CPcBuildTaskLog.class;
	}


	@Override
	public String getTableName() {
		return "PC_BUILD_TASK_LOG";
	}


	@Override
	public boolean hasDataStatusField() {
		return false;
	}


	@Override
	public void setDataStatusValue(PcBuildTaskLog record, int status) {
	}


	@Override
	public void setDataStatusValue(CPcBuildTaskLog cdt, int status) {
	}


	@Override
	public void setCreatorValue(PcBuildTaskLog record, String creator) {
	}


	@Override
	public void setModifierValue(PcBuildTaskLog record, String modifier) {
	}


}



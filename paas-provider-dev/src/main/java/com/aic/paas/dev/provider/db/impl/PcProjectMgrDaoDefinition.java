package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcProjectMgr;
import com.aic.paas.dev.provider.bean.PcProjectMgr;


/**
 * 工程管理员表[PC_PROJECT_MGR]数据访问对象定义实现
 */
public class PcProjectMgrDaoDefinition implements DaoDefinition<PcProjectMgr, CPcProjectMgr> {


	@Override
	public Class<PcProjectMgr> getEntityClass() {
		return PcProjectMgr.class;
	}


	@Override
	public Class<CPcProjectMgr> getConditionClass() {
		return CPcProjectMgr.class;
	}


	@Override
	public String getTableName() {
		return "PC_PROJECT_MGR";
	}


	@Override
	public boolean hasDataStatusField() {
		return false;
	}


	@Override
	public void setDataStatusValue(PcProjectMgr record, int status) {
	}


	@Override
	public void setDataStatusValue(CPcProjectMgr cdt, int status) {
	}


	@Override
	public void setCreatorValue(PcProjectMgr record, String creator) {
	}


	@Override
	public void setModifierValue(PcProjectMgr record, String modifier) {
	}


}



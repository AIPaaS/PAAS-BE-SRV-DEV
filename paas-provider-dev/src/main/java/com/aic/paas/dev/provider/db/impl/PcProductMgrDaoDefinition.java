package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcProductMgr;
import com.aic.paas.dev.provider.bean.PcProductMgr;


/**
 * 产品管理员表[PC_PRODUCT_MGR]数据访问对象定义实现
 */
public class PcProductMgrDaoDefinition implements DaoDefinition<PcProductMgr, CPcProductMgr> {


	@Override
	public Class<PcProductMgr> getEntityClass() {
		return PcProductMgr.class;
	}


	@Override
	public Class<CPcProductMgr> getConditionClass() {
		return CPcProductMgr.class;
	}


	@Override
	public String getTableName() {
		return "PC_PRODUCT_MGR";
	}


	@Override
	public boolean hasDataStatusField() {
		return false;
	}


	@Override
	public void setDataStatusValue(PcProductMgr record, int status) {
	}


	@Override
	public void setDataStatusValue(CPcProductMgr cdt, int status) {
	}


	@Override
	public void setCreatorValue(PcProductMgr record, String creator) {
	}


	@Override
	public void setModifierValue(PcProductMgr record, String modifier) {
	}


}



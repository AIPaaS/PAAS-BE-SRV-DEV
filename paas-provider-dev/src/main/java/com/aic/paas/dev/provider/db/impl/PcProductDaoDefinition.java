package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.PcProduct;


/**
 * 产品表[PC_PRODUCT]数据访问对象定义实现
 */
public class PcProductDaoDefinition implements DaoDefinition<PcProduct, CPcProduct> {


	@Override
	public Class<PcProduct> getEntityClass() {
		return PcProduct.class;
	}


	@Override
	public Class<CPcProduct> getConditionClass() {
		return CPcProduct.class;
	}


	@Override
	public String getTableName() {
		return "PC_PRODUCT";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcProduct record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcProduct cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcProduct record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(PcProduct record, String modifier) {
		record.setModifier(modifier);
	}


}



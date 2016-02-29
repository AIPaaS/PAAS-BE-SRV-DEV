package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDef;


/**
 * 镜像定义表[PC_IMAGE_DEF]数据访问对象定义实现
 */
public class PcImageDefDaoDefinition implements DaoDefinition<PcImageDef, CPcImageDef> {


	@Override
	public Class<PcImageDef> getEntityClass() {
		return PcImageDef.class;
	}


	@Override
	public Class<CPcImageDef> getConditionClass() {
		return CPcImageDef.class;
	}


	@Override
	public String getTableName() {
		return "PC_IMAGE_DEF";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcImageDef record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcImageDef cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcImageDef record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(PcImageDef record, String modifier) {
		record.setModifier(modifier);
	}


}



package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.PcImage;


/**
 * 镜像表[PC_IMAGE]数据访问对象定义实现
 */
public class PcImageDaoDefinition implements DaoDefinition<PcImage, CPcImage> {


	@Override
	public Class<PcImage> getEntityClass() {
		return PcImage.class;
	}


	@Override
	public Class<CPcImage> getConditionClass() {
		return CPcImage.class;
	}


	@Override
	public String getTableName() {
		return "PC_IMAGE";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcImage record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcImage cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcImage record, String creator) {
		record.setCreator(creator);
	}


	@Override
	public void setModifierValue(PcImage record, String modifier) {
		record.setModifier(modifier);
	}


}



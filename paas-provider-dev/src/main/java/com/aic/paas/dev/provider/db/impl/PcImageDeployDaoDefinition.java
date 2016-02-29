package com.aic.paas.dev.provider.db.impl;


import com.binary.framework.dao.DaoDefinition;

import com.aic.paas.dev.provider.bean.CPcImageDeploy;
import com.aic.paas.dev.provider.bean.PcImageDeploy;


/**
 * 镜像发布流水表[PC_IMAGE_DEPLOY]数据访问对象定义实现
 */
public class PcImageDeployDaoDefinition implements DaoDefinition<PcImageDeploy, CPcImageDeploy> {


	@Override
	public Class<PcImageDeploy> getEntityClass() {
		return PcImageDeploy.class;
	}


	@Override
	public Class<CPcImageDeploy> getConditionClass() {
		return CPcImageDeploy.class;
	}


	@Override
	public String getTableName() {
		return "PC_IMAGE_DEPLOY";
	}


	@Override
	public boolean hasDataStatusField() {
		return true;
	}


	@Override
	public void setDataStatusValue(PcImageDeploy record, int status) {
		record.setDataStatus(status);
	}


	@Override
	public void setDataStatusValue(CPcImageDeploy cdt, int status) {
		cdt.setDataStatus(status);
	}


	@Override
	public void setCreatorValue(PcImageDeploy record, String creator) {
	}


	@Override
	public void setModifierValue(PcImageDeploy record, String modifier) {
	}


}



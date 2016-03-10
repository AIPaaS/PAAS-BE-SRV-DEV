package com.aic.paas.dev.provider.db;


import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.binary.framework.dao.Dao;


/**
 * 构建定义表[PC_BUILD_DEF]数据访问对象
 */
public interface PcBuildDefDao extends Dao<PcBuildDef, CPcBuildDef> {
	
	
	/**
	 * 跟据构建全名查询镜像
	 * @param fullBuildName
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<PcBuildDef> selectListByFullBuildName(String fullBuildName, CPcBuildDef cdt, String orders);


}



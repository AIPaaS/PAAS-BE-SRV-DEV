package com.aic.paas.dev.provider.db;


import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.binary.framework.dao.Dao;


/**
 * 构建任务表[PC_BUILD_TASK]数据访问对象
 */
public interface PcBuildTaskDao extends Dao<PcBuildTask, CPcBuildTask> {

	
	
	
	/**
	 * 查询最近构建任务
	 * @param buildDefIds
	 * @return
	 */
	public List<PcBuildTask> selectLastList(Long[] buildDefIds);

	
	
	
	
}



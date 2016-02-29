package com.aic.paas.dev.provider.db;


import java.util.List;

import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcProject;
import com.binary.framework.dao.Dao;
import com.binary.jdbc.Page;


/**
 * 产品工程表[PC_PROJECT]数据访问对象
 */
public interface PcProjectDao extends Dao<PcProject, CPcProject> {
	
	
	
	/**
	 * 查询管理员所管理的工程
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProject> selectMgrPage(long pageNum, long pageSize, Long mgrId, CPcProject cdt, String orders);


	
	
	
	/**
	 * 查询管理员所管理的工程
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProject> selectMgrList(Long mgrId, CPcProject cdt, String orders);
	


}



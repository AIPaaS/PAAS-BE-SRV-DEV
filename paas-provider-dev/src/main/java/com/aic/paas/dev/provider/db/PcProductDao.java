package com.aic.paas.dev.provider.db;


import java.util.List;

import com.binary.framework.dao.Dao;
import com.binary.jdbc.Page;
import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.PcProduct;


/**
 * 产品表[PC_PRODUCT]数据访问对象
 */
public interface PcProductDao extends Dao<PcProduct, CPcProduct> {


	
	
	/**
	 * 查询管理员所管理的产品
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProduct> selectMgrPage(long pageNum, long pageSize, Long mgrId, CPcProduct cdt, String orders);


	
	
	
	/**
	 * 查询管理员所管理的产品
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProduct> selectMgrList(Long mgrId, CPcProduct cdt, String orders);
	
	
}



package com.aic.paas.dev.provider.db.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;
import com.binary.framework.ibatis.IBatisUtils;
import com.binary.jdbc.Page;
import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.db.PcProductDao;


/**
 * 产品表[PC_PRODUCT]数据访问对象实现
 */
public class PcProductDaoImpl extends IBatisDaoTemplate<PcProduct, CPcProduct> implements PcProductDao {

	
	@Override
	public Page<PcProduct> selectMgrPage(long pageNum, long pageSize, Long mgrId, CPcProduct cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("mgrId", mgrId);
		
		Page<PcProduct> page = IBatisUtils.selectPage(getSqlMapClientTemplate(), getTableName()+".selectMgrList", map, pageNum, pageSize, true);
		return page;
	}
	
	
	

	@SuppressWarnings("unchecked")
	@Override
	public List<PcProduct> selectMgrList(Long mgrId, CPcProduct cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("mgrId", mgrId);
		
		List<PcProduct> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectMgrList", map);
		return list;
	}


}



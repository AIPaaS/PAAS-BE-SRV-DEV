package com.aic.paas.dev.provider.db.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.db.PcProjectDao;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;
import com.binary.framework.ibatis.IBatisUtils;
import com.binary.jdbc.Page;


/**
 * 产品工程表[PC_PROJECT]数据访问对象实现
 */
public class PcProjectDaoImpl extends IBatisDaoTemplate<PcProject, CPcProject> implements PcProjectDao {

	
	
	@Override
	public Page<PcProject> selectMgrPage(long pageNum, long pageSize, Long mgrId, CPcProject cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("mgrId", mgrId);
		
		Page<PcProject> page = IBatisUtils.selectPage(getSqlMapClientTemplate(), getTableName()+".selectMgrList", map, pageNum, pageSize, true);
		return page;
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PcProject> selectMgrList(Long mgrId, CPcProject cdt, String orders) {
		BinaryUtils.checkEmpty(mgrId, "mgrId");
		
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("mgrId", mgrId);
		
		List<PcProject> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectMgrList", map);
		return list;
	}


}



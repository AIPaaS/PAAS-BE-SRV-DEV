package com.aic.paas.dev.provider.db.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.db.PcBuildDefDao;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;


/**
 * 构建定义表[PC_BUILD_DEF]数据访问对象实现
 */
public class PcBuildDefDaoImpl extends IBatisDaoTemplate<PcBuildDef, CPcBuildDef> implements PcBuildDefDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<PcBuildDef> selectListByFullBuildName(String fullBuildName,
			CPcBuildDef cdt, String orders) {
		BinaryUtils.checkEmpty(fullBuildName, "fullBuildName");
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("fullBuildName", fullBuildName);
		List<PcBuildDef> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectListByFullBuildName", map);
		return list;
	}


}



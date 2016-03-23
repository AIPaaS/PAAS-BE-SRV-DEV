package com.aic.paas.dev.provider.db.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.db.PcImageDao;
import com.binary.core.lang.Conver;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;


/**
 * 镜像表[PC_IMAGE]数据访问对象实现
 */
public class PcImageDaoImpl extends IBatisDaoTemplate<PcImage, CPcImage> implements PcImageDao {

	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PcImage> selectLastList(Long[] defIds) {
		if(BinaryUtils.isEmpty(defIds)) {
			return new ArrayList<PcImage>();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("defIds", Conver.toString(defIds));
		List<PcImage> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectLastList", map);
		return list;
	}
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PcImage> selectListByFullName(String fullName, CPcImage cdt, String orders) {
		BinaryUtils.checkEmpty(fullName, "fullName");
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		map.put("fullName", fullName);
		List<PcImage> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectListByFullName", map);
		return list;
	}



	@Override
	public List<String> selectTagListByDefId(CPcImage cdt, String orders) {
		if(cdt == null) cdt = newCondition();
		setDataStatusValue(cdt, 1);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cdt", cdt);
		fillCondition(cdt, map);
		map.put("orders", orders);
		List<String> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectTagListByDefId", map);
		return list;
	}
	
	
	
	

}






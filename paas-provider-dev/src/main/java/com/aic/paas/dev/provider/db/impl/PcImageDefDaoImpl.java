package com.aic.paas.dev.provider.db.impl;


import java.util.HashMap;
import java.util.Map;

import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.db.PcImageDefDao;


/**
 * 镜像定义表[PC_IMAGE_DEF]数据访问对象实现
 */
public class PcImageDefDaoImpl extends IBatisDaoTemplate<PcImageDef, CPcImageDef> implements PcImageDefDao {

	
	
	
	@Override
	public PcImageDef selectDefByFullName(Long mntId, String imageFullName) {
		BinaryUtils.checkEmpty(mntId, "mntId");
		BinaryUtils.checkEmpty(imageFullName, "imageFullName");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mntId", mntId);
		map.put("imageFullName", imageFullName);
		PcImageDef record = (PcImageDef)getSqlMapClientTemplate().queryForObject(getTableName()+".selectDefByFullName", map);
		return record;
	}

	
	
	
	

}



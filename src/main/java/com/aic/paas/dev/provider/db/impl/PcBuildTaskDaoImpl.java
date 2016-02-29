package com.aic.paas.dev.provider.db.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.db.PcBuildTaskDao;
import com.binary.core.lang.Conver;
import com.binary.core.util.BinaryUtils;
import com.binary.framework.dao.support.tpl.IBatisDaoTemplate;


/**
 * 构建任务表[PC_BUILD_TASK]数据访问对象实现
 */
public class PcBuildTaskDaoImpl extends IBatisDaoTemplate<PcBuildTask, CPcBuildTask> implements PcBuildTaskDao {


	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PcBuildTask> selectLastList(Long[] buildDefIds) {
		if(BinaryUtils.isEmpty(buildDefIds)) {
			return new ArrayList<PcBuildTask>();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("buildDefIds", Conver.toString(buildDefIds));
		List<PcBuildTask> list = getSqlMapClientTemplate().queryForList(getTableName()+".selectLastList", map);
		return list;
	}
	
	
	
	
}



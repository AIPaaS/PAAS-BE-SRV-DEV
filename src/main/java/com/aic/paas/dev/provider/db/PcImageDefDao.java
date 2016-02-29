package com.aic.paas.dev.provider.db;


import com.binary.framework.dao.Dao;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDef;


/**
 * 镜像定义表[PC_IMAGE_DEF]数据访问对象
 */
public interface PcImageDefDao extends Dao<PcImageDef, CPcImageDef> {
	
	
	
	
	/**
	 * 跟据镜像目录名+镜像名查询镜像定义
	 * @param mntId 租户ID
	 * @param imageFullName 镜像全名
	 * @return
	 */
	public PcImageDef selectDefByFullName(Long mntId, String imageFullName);


	
	
}



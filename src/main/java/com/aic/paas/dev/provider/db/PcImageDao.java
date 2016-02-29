package com.aic.paas.dev.provider.db;


import java.util.List;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.PcImage;
import com.binary.framework.dao.Dao;


/**
 * 镜像表[PC_IMAGE]数据访问对象
 */
public interface PcImageDao extends Dao<PcImage, CPcImage> {


	
	/**
	 * 查询最近构建任务
	 * @param buildDefIds
	 * @return
	 */
	public List<PcImage> selectLastList(Long[] defIds);
	
	
	
	
	/**
	 * 跟据镜像全名查询镜像
	 * @param fullName
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<PcImage> selectListByFullName(String fullName, CPcImage cdt, String orders);
	
	
	
}



package com.aic.paas.dev.provider.svc;

import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;


public interface PcBuildTaskSvc {

	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcBuildDef数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdateBuildTask(PcBuildTask pbt) ;
	

	/**
	 * 查询历史构建记录 只查询最近的10个
	 * @param pageNum
	 * @param pageSize
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<PcBuildTask> queryPcBuildTaskListForPage(Integer pageNum,Integer pageSize,CPcBuildTask cdt,String orders);
}
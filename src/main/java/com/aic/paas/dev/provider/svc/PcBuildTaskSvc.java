package com.aic.paas.dev.provider.svc;

import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.svc.bean.PcBuildTaskInfo;

public interface PcBuildTaskSvc {
	/**
	 * 查询历史构建记录 只查询最近的10个
	 * @param pageNum
	 * @param pageSize
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<PcBuildTaskInfo> queryPcBuildTaskListForPage(Integer pageNum,Integer pageSize,CPcBuildDef cdt,String orders);
}

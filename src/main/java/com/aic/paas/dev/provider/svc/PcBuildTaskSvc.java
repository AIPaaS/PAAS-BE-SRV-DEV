package com.aic.paas.dev.provider.svc;

import java.text.ParseException;
import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildTask;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.util.bean.PcBuildTaskCallBack;


public interface PcBuildTaskSvc {


	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcBuildDef数据记录
	 * @param namespace :  租户code+"+"+用户code
	 * @param buildName : 构建名称
	 * @param imageFullName :  镜像全名
	 * @return backBuildId 回调的构建Id
	 */
	public Long saveBuildTask(PcBuildTask record,String namespace,String buildName,String imageFullName) throws ParseException;
	

	/**
	 * 查询历史构建记录 只查询最近的10个
	 * @param pageNum
	 * @param pageSize
	 * @param cdt
	 * @param orders
	 * @return
	 */
	public List<PcBuildTask> queryPcBuildTaskListForPage(Integer pageNum,Integer pageSize,CPcBuildTask cdt,String orders);
	
	
	/**
	 * aic.tsd_hyh  2016.03.11
	 * 根据状态 buildId 去查 数据状态为2，3的List
	 * @param buildDefId
	 * * @param statuss
	 * @return
	 */
	public List<PcBuildTask> selectTaskListByStatueId(Long buildDefId , Integer[] statuss);
	

	/**
	 * aic.tsd_hyh  2016.03.11
	 * 根据条件去修改表
	 * @param  PcBuildTask record ;//更新的映射对象
	 * @param CPcBuildTask cdt ;//条件对象
	 * @return
	 */
	public int updatePcBuildTaskCdt(PcBuildTask record ,CPcBuildTask cdt);
	
	/**
	 * 不分页查询
	 * @param pbtc : 构建任务回调对象
	 * @param imgRespId : 所属镜像库Id
	 * @return 
	 */
	public String updateBuildTaskByCallBack(PcBuildTaskCallBack pbtc,String imgRespId) throws ParseException;
	
	/**
	 * aic.tsd_hyh  2016.03.18
	 * 根据状态 buildId 去查 数据状态为2，3的List
	 * @param CPcBuildTask
	 * * @param orders
	 * @return
	 */
	public List<PcBuildTask> selectTaskListByCdt(CPcBuildTask cdt,String orders);
}
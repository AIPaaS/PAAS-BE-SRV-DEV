package com.aic.paas.dev.provider.svc;

import java.util.List;

import com.aic.paas.dev.provider.bean.CPcProject;
import com.aic.paas.dev.provider.bean.PcProject;
import com.aic.paas.dev.provider.svc.bean.ProjectInfo;
import com.aic.paas.dev.provider.svc.bean.WsMerchent;
import com.binary.jdbc.Page;

public interface PcProjectSvc {
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProject> queryPage(Integer pageNum, Integer pageSize, CPcProject cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProject> queryList(CPcProject cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcProject queryById(Long id);
	
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<ProjectInfo> queryInfoPage(Integer pageNum, Integer pageSize, CPcProject cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<ProjectInfo> queryInfoList(CPcProject cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public ProjectInfo queryInfoById(Long id);
	
	
	
	
	
	/**
	 * 查询管理员所管理的工程
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProject> queryMgrPage(Integer pageNum, Integer pageSize, Long mgrId, CPcProject cdt, String orders);


	
	
	
	/**
	 * 查询管理员所管理的工程
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProject> queryMgrList(Long mgrId, CPcProject cdt, String orders);

	
	
		
	
	
	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcProject数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdate(PcProject record, WsMerchent mnt);
	
	
	
	
	
	/**
	 * 跟据分类ID删除
	 * @param id
	 * @return
	 */
	public int removeById(Long id);
	
	
	
	
	
	/**
	 * 设置产品管理员
	 * @param projectId
	 * @param mgrIds
	 */
	public void setProjectMgrs(Long projectId, Long[] mgrIds);

	
	
	
	
	
}

package com.aic.paas.dev.provider.svc;

import java.util.List;

import com.aic.paas.dev.provider.bean.CPcBuildDef;
import com.aic.paas.dev.provider.bean.PcBuildDef;
import com.aic.paas.dev.provider.svc.bean.PcBuildDefInfo;
import com.binary.jdbc.Page;

public interface PcBuildSvc {
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcBuildDef> queryDefPage(Integer pageNum, Integer pageSize, CPcBuildDef cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcBuildDef> queryDefList(CPcBuildDef cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcBuildDef queryDefById(Long id);
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcBuildDefInfo> queryDefInfoPage(Integer pageNum, Integer pageSize, CPcBuildDef cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcBuildDefInfo> queryDefInfoList(CPcBuildDef cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcBuildDefInfo queryByDefInfoId(Long id);
	
	
	
	
	

	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcBuildDef数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdateDef(PcBuildDef record);
	
	
	
	
	
	/**
	 * 跟据分类ID删除
	 * @param id
	 * @return
	 */
	public int removeDefById(Long id);
	/**
	 * 校验构建名是否已存在
	 * @param record
	 * @return
	 */
	public int checkBuildFullName(PcBuildDef record);
	

}

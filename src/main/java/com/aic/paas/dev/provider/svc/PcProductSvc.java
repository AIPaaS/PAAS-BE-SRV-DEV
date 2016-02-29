package com.aic.paas.dev.provider.svc;

import java.util.List;

import com.aic.paas.dev.provider.bean.CPcProduct;
import com.aic.paas.dev.provider.bean.PcProduct;
import com.aic.paas.dev.provider.svc.bean.ProductInfo;
import com.binary.jdbc.Page;

public interface PcProductSvc {
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProduct> queryPage(Integer pageNum, Integer pageSize, CPcProduct cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProduct> queryList(CPcProduct cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcProduct queryById(Long id);
	
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<ProductInfo> queryInfoPage(Integer pageNum, Integer pageSize, CPcProduct cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<ProductInfo> queryInfoList(CPcProduct cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public ProductInfo queryInfoById(Long id);
	
	
	
	
	
	/**
	 * 查询管理员所管理的产品
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcProduct> queryMgrPage(Integer pageNum, Integer pageSize, Long mgrId, CPcProduct cdt, String orders);


	
	
	
	/**
	 * 查询管理员所管理的产品
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcProduct> queryMgrList(Long mgrId, CPcProduct cdt, String orders);

	
	
		
	
	
	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcProduct数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdate(PcProduct record);
	
	
	
	
	
	/**
	 * 跟据分类ID删除
	 * @param id
	 * @return
	 */
	public int removeById(Long id);
	
	
	
	
	
	/**
	 * 设置产品管理员
	 * @param productId
	 * @param mgrIds
	 */
	public void setProductMgrs(Long productId, Long[] mgrIds);
	
	
	
	
	

}

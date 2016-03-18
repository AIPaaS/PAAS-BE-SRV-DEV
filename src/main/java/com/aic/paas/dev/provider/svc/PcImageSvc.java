package com.aic.paas.dev.provider.svc;

import java.util.List;
import java.util.Map;

import com.aic.paas.dev.provider.bean.CPcImage;
import com.aic.paas.dev.provider.bean.CPcImageDef;
import com.aic.paas.dev.provider.bean.CPcImageDeploy;
import com.aic.paas.dev.provider.bean.PcBuildTask;
import com.aic.paas.dev.provider.bean.PcImage;
import com.aic.paas.dev.provider.bean.PcImageDef;
import com.aic.paas.dev.provider.bean.PcImageDeploy;
import com.aic.paas.dev.provider.svc.bean.ImageStatus;
import com.aic.paas.dev.provider.svc.bean.PcImageDefInfo;
import com.aic.paas.dev.provider.svc.bean.PcImageInfo;
import com.binary.jdbc.Page;

public interface PcImageSvc {
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcImageDef> queryDefPage(Integer pageNum, Integer pageSize, CPcImageDef cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImageDef> queryDefList(CPcImageDef cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcImageDef queryDefById(Long id);
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcImageDefInfo> queryDefInfoPage(Integer pageNum, Integer pageSize, CPcImageDef cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImageDefInfo> queryDefInfoList(CPcImageDef cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcImageDefInfo queryDefInfoById(Long id);
	
	
	

	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcImageDef数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdateDef(PcImageDef record);
	
	
	
	
	
	/**
	 * 跟据分类ID删除
	 * @param id
	 * @return
	 */
	public int removeDefById(Long id);
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcImage> queryImagePage(Integer pageNum, Integer pageSize, CPcImage cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImage> queryImageList(CPcImage cdt, String orders);

	
	
	/**
	 * 跟据镜像全名查询
	 * @param fullName 全名
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImage> queryImageListByFullName(String fullName, CPcImage cdt, String orders);
	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcImage queryImageById(Long id);
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcImageInfo> queryImageInfoPage(Integer pageNum, Integer pageSize, CPcImage cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImageInfo> queryImageInfoList(CPcImage cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcImageInfo queryImageInfoById(Long id);
	
	
	

	/**
	 * 保存获更新，判断主键ID[id]是否存在, 存在则更新, 不存在则插入
	 * @param record : PcImage数据记录
	 * @return 当前记录主键[id]值
	 */
	public Long saveOrUpdateImage(PcImage record);
	
	
	
	
	
	/**
	 * 跟据分类ID删除
	 * @param id
	 * @return
	 */
	public int removeImageById(Long id);
	
	
	
	
	/**
	 * 发布镜像
	 * @param id 镜像ID
	 * @param beforeStatus 发布之前状态
	 * @param afterStatus 发布之后状态 
	 * @param dataCenterId 数据中心
	 * @param resCenterId 资源中心
	 * @param remark 备注
	 * @return 返回发布ID  [PC_IMAGE_DEPLOY.id]
	 */
	public Long deployImage(Long id, ImageStatus beforeStatus, ImageStatus afterStatus, Long dataCenterId, Long resCenterId, String remark);
	
	
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum : 指定页码
	 * @param pageSize : 指定页行数
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public Page<PcImageDeploy> queryDeployPage(Integer pageNum, Integer pageSize, CPcImageDeploy cdt, String orders);


	
	
	
	/**
	 * 不分页查询
	 * @param cdt : 条件对象
	 * @param orders : 排序字段, 多字段以逗号分隔
	 * @return 
	 */
	public List<PcImageDeploy> queryDeployList(CPcImageDeploy cdt, String orders);

	
	
	
	
	/**
	 * 跟据主键查询
	 * @param id : 主键ID
	 * @return 操作员表[SYS_OP]映射对象
	 */
	public PcImageDeploy queryDeployById(Long id);
	/**
	 * 根据镜像Id，上传镜像
	 * @param image_name 镜像名（对应目录 + 镜像名+ 版本号）
	 * @param tag 版本号
	 * @param export_file_url 用户上传的文件所在web服务器的http路径
	 * @return "success/error"  成功/失败
	 */
	public String uploadImage(PcBuildTask buildTask,Map<String,String> uploadMap) ;
	/**
	 * 镜像发布回调接口
	 * @param param
	 * @return
	 */
	public String imageSyncCallback(String param);
}

package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 镜像定义表[PC_IMAGE_DEF]
 */
public class CPcImageDef implements Condition {
	private static final long serialVersionUID = 1L;


	/**
	 * condition-field: ID[ID] operate-Equal[=]
	 */
	private Long id;


	/**
	 * condition-field: ID[ID] operate-In[in]
	 */
	private Long[] ids;


	/**
	 * condition-field: ID[ID] operate-GTEqual[>=]
	 */
	private Long startId;

	/**
	 * condition-field: ID[ID] operate-LTEqual[<=]
	 */
	private Long endId;


	/**
	 * condition-field: 所属租户[MNT_ID] operate-Equal[=]
	 */
	private Long mntId;


	/**
	 * condition-field: 所属租户[MNT_ID] operate-In[in]
	 */
	private Long[] mntIds;


	/**
	 * condition-field: 所属租户[MNT_ID] operate-GTEqual[>=]
	 */
	private Long startMntId;

	/**
	 * condition-field: 所属租户[MNT_ID] operate-LTEqual[<=]
	 */
	private Long endMntId;


	/**
	 * condition-field: 目录名[DIR_NAME] operate-Like[like]
	 */
	private String dirName;


	/**
	 * condition-field: 镜像名[IMAGE_NAME] operate-Like[like]
	 */
	private String imageName;


	/**
	 * condition-field: 版本号[VERSION_NO] operate-Like[like]
	 * 字母、数字、点
	 */
	private String versionNo;


	/**
	 * condition-field: 版本号[VERSION_NO] operate-Equal[=]
	 * 字母、数字、点
	 */
	private String versionNoEqual;


	/**
	 * condition-field: 版本号[VERSION_NO] operate-In[in]
	 * 字母、数字、点
	 */
	private String[] versionNos;


	/**
	 * condition-field: 镜像全名[IMAGE_FULL_NAME] operate-Like[like]
	 * 目录名/镜像名
	 */
	private String imageFullName;


	/**
	 * condition-field: 是否外部镜像[IS_EXTERNAL] operate-Equal[=]
	 * 1=是 0=否
	 */
	private Integer isExternal;


	/**
	 * condition-field: 是否外部镜像[IS_EXTERNAL] operate-In[in]
	 * 1=是 0=否
	 */
	private Integer[] isExternals;


	/**
	 * condition-field: 是否外部镜像[IS_EXTERNAL] operate-GTEqual[>=]
	 * 1=是 0=否
	 */
	private Integer startIsExternal;

	/**
	 * condition-field: 是否外部镜像[IS_EXTERNAL] operate-LTEqual[<=]
	 * 1=是 0=否
	 */
	private Integer endIsExternal;


	/**
	 * condition-field: 所属产品[PRODUCT_ID] operate-Equal[=]
	 */
	private Long productId;


	/**
	 * condition-field: 所属产品[PRODUCT_ID] operate-In[in]
	 */
	private Long[] productIds;


	/**
	 * condition-field: 所属产品[PRODUCT_ID] operate-GTEqual[>=]
	 */
	private Long startProductId;

	/**
	 * condition-field: 所属产品[PRODUCT_ID] operate-LTEqual[<=]
	 */
	private Long endProductId;


	/**
	 * condition-field: 所属工程[PROJECT_ID] operate-Equal[=]
	 */
	private Long projectId;


	/**
	 * condition-field: 所属工程[PROJECT_ID] operate-In[in]
	 */
	private Long[] projectIds;


	/**
	 * condition-field: 所属工程[PROJECT_ID] operate-GTEqual[>=]
	 */
	private Long startProjectId;

	/**
	 * condition-field: 所属工程[PROJECT_ID] operate-LTEqual[<=]
	 */
	private Long endProjectId;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-Equal[=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer dataStatus;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-In[in]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer[] dataStatuss;


	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-GTEqual[>=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer startDataStatus;

	/**
	 * condition-field: 数据状态[DATA_STATUS] operate-LTEqual[<=]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer endDataStatus;


	/**
	 * condition-field: 创建人[CREATOR] operate-Like[like]
	 */
	private String creator;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-Equal[=]
	 * yyyyMMddHHmmss
	 */
	private Long createTime;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-In[in]
	 * yyyyMMddHHmmss
	 */
	private Long[] createTimes;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-GTEqual[>=]
	 * yyyyMMddHHmmss
	 */
	private Long startCreateTime;

	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-LTEqual[<=]
	 * yyyyMMddHHmmss
	 */
	private Long endCreateTime;


	/**
	 * condition-field: 修改人[MODIFIER] operate-Like[like]
	 */
	private String modifier;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-Equal[=]
	 * yyyyMMddHHmmss
	 */
	private Long modifyTime;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-In[in]
	 * yyyyMMddHHmmss
	 */
	private Long[] modifyTimes;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-GTEqual[>=]
	 * yyyyMMddHHmmss
	 */
	private Long startModifyTime;

	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-LTEqual[<=]
	 * yyyyMMddHHmmss
	 */
	private Long endModifyTime;




	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Long[] getIds() {
		return this.ids;
	}
	public void setIds(Long[] ids) {
		this.ids = ids;
	}


	public Long getStartId() {
		return this.startId;
	}
	public void setStartId(Long startId) {
		this.startId = startId;
	}


	public Long getEndId() {
		return this.endId;
	}
	public void setEndId(Long endId) {
		this.endId = endId;
	}


	public Long getMntId() {
		return this.mntId;
	}
	public void setMntId(Long mntId) {
		this.mntId = mntId;
	}


	public Long[] getMntIds() {
		return this.mntIds;
	}
	public void setMntIds(Long[] mntIds) {
		this.mntIds = mntIds;
	}


	public Long getStartMntId() {
		return this.startMntId;
	}
	public void setStartMntId(Long startMntId) {
		this.startMntId = startMntId;
	}


	public Long getEndMntId() {
		return this.endMntId;
	}
	public void setEndMntId(Long endMntId) {
		this.endMntId = endMntId;
	}


	public String getDirName() {
		return this.dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}


	public String getImageName() {
		return this.imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}


	public String getVersionNoEqual() {
		return this.versionNoEqual;
	}
	public void setVersionNoEqual(String versionNoEqual) {
		this.versionNoEqual = versionNoEqual;
	}


	public String[] getVersionNos() {
		return this.versionNos;
	}
	public void setVersionNos(String[] versionNos) {
		this.versionNos = versionNos;
	}


	public String getImageFullName() {
		return this.imageFullName;
	}
	public void setImageFullName(String imageFullName) {
		this.imageFullName = imageFullName;
	}


	public Integer getIsExternal() {
		return this.isExternal;
	}
	public void setIsExternal(Integer isExternal) {
		this.isExternal = isExternal;
	}


	public Integer[] getIsExternals() {
		return this.isExternals;
	}
	public void setIsExternals(Integer[] isExternals) {
		this.isExternals = isExternals;
	}


	public Integer getStartIsExternal() {
		return this.startIsExternal;
	}
	public void setStartIsExternal(Integer startIsExternal) {
		this.startIsExternal = startIsExternal;
	}


	public Integer getEndIsExternal() {
		return this.endIsExternal;
	}
	public void setEndIsExternal(Integer endIsExternal) {
		this.endIsExternal = endIsExternal;
	}


	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Long[] getProductIds() {
		return this.productIds;
	}
	public void setProductIds(Long[] productIds) {
		this.productIds = productIds;
	}


	public Long getStartProductId() {
		return this.startProductId;
	}
	public void setStartProductId(Long startProductId) {
		this.startProductId = startProductId;
	}


	public Long getEndProductId() {
		return this.endProductId;
	}
	public void setEndProductId(Long endProductId) {
		this.endProductId = endProductId;
	}


	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}


	public Long[] getProjectIds() {
		return this.projectIds;
	}
	public void setProjectIds(Long[] projectIds) {
		this.projectIds = projectIds;
	}


	public Long getStartProjectId() {
		return this.startProjectId;
	}
	public void setStartProjectId(Long startProjectId) {
		this.startProjectId = startProjectId;
	}


	public Long getEndProjectId() {
		return this.endProjectId;
	}
	public void setEndProjectId(Long endProjectId) {
		this.endProjectId = endProjectId;
	}


	public Integer getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(Integer dataStatus) {
		this.dataStatus = dataStatus;
	}


	public Integer[] getDataStatuss() {
		return this.dataStatuss;
	}
	public void setDataStatuss(Integer[] dataStatuss) {
		this.dataStatuss = dataStatuss;
	}


	public Integer getStartDataStatus() {
		return this.startDataStatus;
	}
	public void setStartDataStatus(Integer startDataStatus) {
		this.startDataStatus = startDataStatus;
	}


	public Integer getEndDataStatus() {
		return this.endDataStatus;
	}
	public void setEndDataStatus(Integer endDataStatus) {
		this.endDataStatus = endDataStatus;
	}


	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}


	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}


	public Long[] getCreateTimes() {
		return this.createTimes;
	}
	public void setCreateTimes(Long[] createTimes) {
		this.createTimes = createTimes;
	}


	public Long getStartCreateTime() {
		return this.startCreateTime;
	}
	public void setStartCreateTime(Long startCreateTime) {
		this.startCreateTime = startCreateTime;
	}


	public Long getEndCreateTime() {
		return this.endCreateTime;
	}
	public void setEndCreateTime(Long endCreateTime) {
		this.endCreateTime = endCreateTime;
	}


	public String getModifier() {
		return this.modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}


	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}


	public Long[] getModifyTimes() {
		return this.modifyTimes;
	}
	public void setModifyTimes(Long[] modifyTimes) {
		this.modifyTimes = modifyTimes;
	}


	public Long getStartModifyTime() {
		return this.startModifyTime;
	}
	public void setStartModifyTime(Long startModifyTime) {
		this.startModifyTime = startModifyTime;
	}


	public Long getEndModifyTime() {
		return this.endModifyTime;
	}
	public void setEndModifyTime(Long endModifyTime) {
		this.endModifyTime = endModifyTime;
	}


}



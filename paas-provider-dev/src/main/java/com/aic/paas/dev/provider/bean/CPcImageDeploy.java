package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 镜像发布流水表[PC_IMAGE_DEPLOY]
 */
public class CPcImageDeploy implements Condition {
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
	 * condition-field: 所属镜像[IMAGE_ID] operate-Equal[=]
	 */
	private Long imageId;


	/**
	 * condition-field: 所属镜像[IMAGE_ID] operate-In[in]
	 */
	private Long[] imageIds;


	/**
	 * condition-field: 所属镜像[IMAGE_ID] operate-GTEqual[>=]
	 */
	private Long startImageId;

	/**
	 * condition-field: 所属镜像[IMAGE_ID] operate-LTEqual[<=]
	 */
	private Long endImageId;


	/**
	 * condition-field: 发布之前状态[IMAGE_BEF_STATUS] operate-Equal[=]
	 */
	private Integer imageBefStatus;


	/**
	 * condition-field: 发布之前状态[IMAGE_BEF_STATUS] operate-In[in]
	 */
	private Integer[] imageBefStatuss;


	/**
	 * condition-field: 发布之前状态[IMAGE_BEF_STATUS] operate-GTEqual[>=]
	 */
	private Integer startImageBefStatus;

	/**
	 * condition-field: 发布之前状态[IMAGE_BEF_STATUS] operate-LTEqual[<=]
	 */
	private Integer endImageBefStatus;


	/**
	 * condition-field: 发布之后状态[IMAGE_AFT_STATUS] operate-Equal[=]
	 */
	private Integer imageAftStatus;


	/**
	 * condition-field: 发布之后状态[IMAGE_AFT_STATUS] operate-In[in]
	 */
	private Integer[] imageAftStatuss;


	/**
	 * condition-field: 发布之后状态[IMAGE_AFT_STATUS] operate-GTEqual[>=]
	 */
	private Integer startImageAftStatus;

	/**
	 * condition-field: 发布之后状态[IMAGE_AFT_STATUS] operate-LTEqual[<=]
	 */
	private Integer endImageAftStatus;


	/**
	 * condition-field: 发布数据中心[DATA_CENTER_ID] operate-Equal[=]
	 */
	private Long dataCenterId;


	/**
	 * condition-field: 发布数据中心[DATA_CENTER_ID] operate-In[in]
	 */
	private Long[] dataCenterIds;


	/**
	 * condition-field: 发布数据中心[DATA_CENTER_ID] operate-GTEqual[>=]
	 */
	private Long startDataCenterId;

	/**
	 * condition-field: 发布数据中心[DATA_CENTER_ID] operate-LTEqual[<=]
	 */
	private Long endDataCenterId;


	/**
	 * condition-field: 发布资源中心[RES_CENTER_ID] operate-Equal[=]
	 */
	private Long resCenterId;


	/**
	 * condition-field: 发布资源中心[RES_CENTER_ID] operate-In[in]
	 */
	private Long[] resCenterIds;


	/**
	 * condition-field: 发布资源中心[RES_CENTER_ID] operate-GTEqual[>=]
	 */
	private Long startResCenterId;

	/**
	 * condition-field: 发布资源中心[RES_CENTER_ID] operate-LTEqual[<=]
	 */
	private Long endResCenterId;


	/**
	 * condition-field: BUILD号[BUILD_NO] operate-Like[like]
	 */
	private String buildNo;


	/**
	 * condition-field: BUILD号[BUILD_NO] operate-Equal[=]
	 */
	private String buildNoEqual;


	/**
	 * condition-field: BUILD号[BUILD_NO] operate-In[in]
	 */
	private String[] buildNos;


	/**
	 * condition-field: 构建时间[BUILD_TIME] operate-Equal[=]
	 */
	private Long buildTime;


	/**
	 * condition-field: 构建时间[BUILD_TIME] operate-In[in]
	 */
	private Long[] buildTimes;


	/**
	 * condition-field: 构建时间[BUILD_TIME] operate-GTEqual[>=]
	 */
	private Long startBuildTime;

	/**
	 * condition-field: 构建时间[BUILD_TIME] operate-LTEqual[<=]
	 */
	private Long endBuildTime;


	/**
	 * condition-field: 发布开始时间[DEP_START_TIME] operate-Equal[=]
	 */
	private Long depStartTime;


	/**
	 * condition-field: 发布开始时间[DEP_START_TIME] operate-In[in]
	 */
	private Long[] depStartTimes;


	/**
	 * condition-field: 发布开始时间[DEP_START_TIME] operate-GTEqual[>=]
	 */
	private Long startDepStartTime;

	/**
	 * condition-field: 发布开始时间[DEP_START_TIME] operate-LTEqual[<=]
	 */
	private Long endDepStartTime;


	/**
	 * condition-field: 发布结束时间[DEP_END_TIME] operate-Equal[=]
	 */
	private Long depEndTime;


	/**
	 * condition-field: 发布结束时间[DEP_END_TIME] operate-In[in]
	 */
	private Long[] depEndTimes;


	/**
	 * condition-field: 发布结束时间[DEP_END_TIME] operate-GTEqual[>=]
	 */
	private Long startDepEndTime;

	/**
	 * condition-field: 发布结束时间[DEP_END_TIME] operate-LTEqual[<=]
	 */
	private Long endDepEndTime;


	/**
	 * condition-field: 发布状态[DEP_STATUS] operate-Equal[=]
	 * 1=就绪 2=发布中 3=成功 4=失败
	 */
	private Integer depStatus;


	/**
	 * condition-field: 发布状态[DEP_STATUS] operate-In[in]
	 * 1=就绪 2=发布中 3=成功 4=失败
	 */
	private Integer[] depStatuss;


	/**
	 * condition-field: 发布状态[DEP_STATUS] operate-GTEqual[>=]
	 * 1=就绪 2=发布中 3=成功 4=失败
	 */
	private Integer startDepStatus;

	/**
	 * condition-field: 发布状态[DEP_STATUS] operate-LTEqual[<=]
	 * 1=就绪 2=发布中 3=成功 4=失败
	 */
	private Integer endDepStatus;


	/**
	 * condition-field: 发布人[DEPOR] operate-Like[like]
	 */
	private String depor;


	/**
	 * condition-field: 备注[REMARK] operate-Like[like]
	 */
	private String remark;


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


	public Long getImageId() {
		return this.imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}


	public Long[] getImageIds() {
		return this.imageIds;
	}
	public void setImageIds(Long[] imageIds) {
		this.imageIds = imageIds;
	}


	public Long getStartImageId() {
		return this.startImageId;
	}
	public void setStartImageId(Long startImageId) {
		this.startImageId = startImageId;
	}


	public Long getEndImageId() {
		return this.endImageId;
	}
	public void setEndImageId(Long endImageId) {
		this.endImageId = endImageId;
	}


	public Integer getImageBefStatus() {
		return this.imageBefStatus;
	}
	public void setImageBefStatus(Integer imageBefStatus) {
		this.imageBefStatus = imageBefStatus;
	}


	public Integer[] getImageBefStatuss() {
		return this.imageBefStatuss;
	}
	public void setImageBefStatuss(Integer[] imageBefStatuss) {
		this.imageBefStatuss = imageBefStatuss;
	}


	public Integer getStartImageBefStatus() {
		return this.startImageBefStatus;
	}
	public void setStartImageBefStatus(Integer startImageBefStatus) {
		this.startImageBefStatus = startImageBefStatus;
	}


	public Integer getEndImageBefStatus() {
		return this.endImageBefStatus;
	}
	public void setEndImageBefStatus(Integer endImageBefStatus) {
		this.endImageBefStatus = endImageBefStatus;
	}


	public Integer getImageAftStatus() {
		return this.imageAftStatus;
	}
	public void setImageAftStatus(Integer imageAftStatus) {
		this.imageAftStatus = imageAftStatus;
	}


	public Integer[] getImageAftStatuss() {
		return this.imageAftStatuss;
	}
	public void setImageAftStatuss(Integer[] imageAftStatuss) {
		this.imageAftStatuss = imageAftStatuss;
	}


	public Integer getStartImageAftStatus() {
		return this.startImageAftStatus;
	}
	public void setStartImageAftStatus(Integer startImageAftStatus) {
		this.startImageAftStatus = startImageAftStatus;
	}


	public Integer getEndImageAftStatus() {
		return this.endImageAftStatus;
	}
	public void setEndImageAftStatus(Integer endImageAftStatus) {
		this.endImageAftStatus = endImageAftStatus;
	}


	public Long getDataCenterId() {
		return this.dataCenterId;
	}
	public void setDataCenterId(Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}


	public Long[] getDataCenterIds() {
		return this.dataCenterIds;
	}
	public void setDataCenterIds(Long[] dataCenterIds) {
		this.dataCenterIds = dataCenterIds;
	}


	public Long getStartDataCenterId() {
		return this.startDataCenterId;
	}
	public void setStartDataCenterId(Long startDataCenterId) {
		this.startDataCenterId = startDataCenterId;
	}


	public Long getEndDataCenterId() {
		return this.endDataCenterId;
	}
	public void setEndDataCenterId(Long endDataCenterId) {
		this.endDataCenterId = endDataCenterId;
	}


	public Long getResCenterId() {
		return this.resCenterId;
	}
	public void setResCenterId(Long resCenterId) {
		this.resCenterId = resCenterId;
	}


	public Long[] getResCenterIds() {
		return this.resCenterIds;
	}
	public void setResCenterIds(Long[] resCenterIds) {
		this.resCenterIds = resCenterIds;
	}


	public Long getStartResCenterId() {
		return this.startResCenterId;
	}
	public void setStartResCenterId(Long startResCenterId) {
		this.startResCenterId = startResCenterId;
	}


	public Long getEndResCenterId() {
		return this.endResCenterId;
	}
	public void setEndResCenterId(Long endResCenterId) {
		this.endResCenterId = endResCenterId;
	}


	public String getBuildNo() {
		return this.buildNo;
	}
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}


	public String getBuildNoEqual() {
		return this.buildNoEqual;
	}
	public void setBuildNoEqual(String buildNoEqual) {
		this.buildNoEqual = buildNoEqual;
	}


	public String[] getBuildNos() {
		return this.buildNos;
	}
	public void setBuildNos(String[] buildNos) {
		this.buildNos = buildNos;
	}


	public Long getBuildTime() {
		return this.buildTime;
	}
	public void setBuildTime(Long buildTime) {
		this.buildTime = buildTime;
	}


	public Long[] getBuildTimes() {
		return this.buildTimes;
	}
	public void setBuildTimes(Long[] buildTimes) {
		this.buildTimes = buildTimes;
	}


	public Long getStartBuildTime() {
		return this.startBuildTime;
	}
	public void setStartBuildTime(Long startBuildTime) {
		this.startBuildTime = startBuildTime;
	}


	public Long getEndBuildTime() {
		return this.endBuildTime;
	}
	public void setEndBuildTime(Long endBuildTime) {
		this.endBuildTime = endBuildTime;
	}


	public Long getDepStartTime() {
		return this.depStartTime;
	}
	public void setDepStartTime(Long depStartTime) {
		this.depStartTime = depStartTime;
	}


	public Long[] getDepStartTimes() {
		return this.depStartTimes;
	}
	public void setDepStartTimes(Long[] depStartTimes) {
		this.depStartTimes = depStartTimes;
	}


	public Long getStartDepStartTime() {
		return this.startDepStartTime;
	}
	public void setStartDepStartTime(Long startDepStartTime) {
		this.startDepStartTime = startDepStartTime;
	}


	public Long getEndDepStartTime() {
		return this.endDepStartTime;
	}
	public void setEndDepStartTime(Long endDepStartTime) {
		this.endDepStartTime = endDepStartTime;
	}


	public Long getDepEndTime() {
		return this.depEndTime;
	}
	public void setDepEndTime(Long depEndTime) {
		this.depEndTime = depEndTime;
	}


	public Long[] getDepEndTimes() {
		return this.depEndTimes;
	}
	public void setDepEndTimes(Long[] depEndTimes) {
		this.depEndTimes = depEndTimes;
	}


	public Long getStartDepEndTime() {
		return this.startDepEndTime;
	}
	public void setStartDepEndTime(Long startDepEndTime) {
		this.startDepEndTime = startDepEndTime;
	}


	public Long getEndDepEndTime() {
		return this.endDepEndTime;
	}
	public void setEndDepEndTime(Long endDepEndTime) {
		this.endDepEndTime = endDepEndTime;
	}


	public Integer getDepStatus() {
		return this.depStatus;
	}
	public void setDepStatus(Integer depStatus) {
		this.depStatus = depStatus;
	}


	public Integer[] getDepStatuss() {
		return this.depStatuss;
	}
	public void setDepStatuss(Integer[] depStatuss) {
		this.depStatuss = depStatuss;
	}


	public Integer getStartDepStatus() {
		return this.startDepStatus;
	}
	public void setStartDepStatus(Integer startDepStatus) {
		this.startDepStatus = startDepStatus;
	}


	public Integer getEndDepStatus() {
		return this.endDepStatus;
	}
	public void setEndDepStatus(Integer endDepStatus) {
		this.endDepStatus = endDepStatus;
	}


	public String getDepor() {
		return this.depor;
	}
	public void setDepor(String depor) {
		this.depor = depor;
	}


	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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



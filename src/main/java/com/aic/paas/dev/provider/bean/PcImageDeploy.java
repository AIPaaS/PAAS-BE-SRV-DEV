package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 镜像发布流水表[PC_IMAGE_DEPLOY]
 */
public class PcImageDeploy implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 所属镜像[IMAGE_ID]
	 */
	private Long imageId;


	/**
	 * mapping-field: 发布之前状态[IMAGE_BEF_STATUS]
	 */
	private Integer imageBefStatus;


	/**
	 * mapping-field: 发布之后状态[IMAGE_AFT_STATUS]
	 */
	private Integer imageAftStatus;


	/**
	 * mapping-field: 发布数据中心[DATA_CENTER_ID]
	 */
	private Long dataCenterId;


	/**
	 * mapping-field: 发布资源中心[RES_CENTER_ID]
	 */
	private Long resCenterId;


	/**
	 * mapping-field: BUILD号[BUILD_NO]
	 */
	private String buildNo;


	/**
	 * mapping-field: 构建时间[BUILD_TIME]
	 */
	private Long buildTime;


	/**
	 * mapping-field: 发布开始时间[DEP_START_TIME]
	 */
	private Long depStartTime;


	/**
	 * mapping-field: 发布结束时间[DEP_END_TIME]
	 */
	private Long depEndTime;


	/**
	 * mapping-field: 发布状态[DEP_STATUS]
	 * 1=就绪 2=发布中 3=成功 4=失败
	 */
	private Integer depStatus;


	/**
	 * mapping-field: 发布人[DEPOR]
	 */
	private String depor;


	/**
	 * mapping-field: 备注[REMARK]
	 */
	private String remark;


	/**
	 * mapping-field: 数据状态[DATA_STATUS]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer dataStatus;


	/**
	 * mapping-field: 创建时间[CREATE_TIME]
	 * yyyyMMddHHmmss
	 */
	private Long createTime;


	/**
	 * mapping-field: 修改时间[MODIFY_TIME]
	 * yyyyMMddHHmmss
	 */
	private Long modifyTime;




	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public Long getImageId() {
		return this.imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}


	public Integer getImageBefStatus() {
		return this.imageBefStatus;
	}
	public void setImageBefStatus(Integer imageBefStatus) {
		this.imageBefStatus = imageBefStatus;
	}


	public Integer getImageAftStatus() {
		return this.imageAftStatus;
	}
	public void setImageAftStatus(Integer imageAftStatus) {
		this.imageAftStatus = imageAftStatus;
	}


	public Long getDataCenterId() {
		return this.dataCenterId;
	}
	public void setDataCenterId(Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}


	public Long getResCenterId() {
		return this.resCenterId;
	}
	public void setResCenterId(Long resCenterId) {
		this.resCenterId = resCenterId;
	}


	public String getBuildNo() {
		return this.buildNo;
	}
	public void setBuildNo(String buildNo) {
		this.buildNo = buildNo;
	}


	public Long getBuildTime() {
		return this.buildTime;
	}
	public void setBuildTime(Long buildTime) {
		this.buildTime = buildTime;
	}


	public Long getDepStartTime() {
		return this.depStartTime;
	}
	public void setDepStartTime(Long depStartTime) {
		this.depStartTime = depStartTime;
	}


	public Long getDepEndTime() {
		return this.depEndTime;
	}
	public void setDepEndTime(Long depEndTime) {
		this.depEndTime = depEndTime;
	}


	public Integer getDepStatus() {
		return this.depStatus;
	}
	public void setDepStatus(Integer depStatus) {
		this.depStatus = depStatus;
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


	public Long getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}


	public Long getModifyTime() {
		return this.modifyTime;
	}
	public void setModifyTime(Long modifyTime) {
		this.modifyTime = modifyTime;
	}


}



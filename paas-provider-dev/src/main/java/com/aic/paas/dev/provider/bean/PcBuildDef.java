package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 构建定义表[PC_BUILD_DEF]
 */
public class PcBuildDef implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 所属租户[MNT_ID]
	 */
	private Long mntId;


	/**
	 * mapping-field: 构建名[BUILD_NAME]
	 */
	private String buildName;


	/**
	 * mapping-field: 所属产品[PRODUCT_ID]
	 */
	private Long productId;


	/**
	 * mapping-field: 所属工程[PROJECT_ID]
	 */
	private Long projectId;


	/**
	 * mapping-field: 是否外部工程[IS_EXTERNAL]
	 * 1=是 0=否
	 */
	private Integer isExternal;


	/**
	 * mapping-field: 代码库类型[RESP_TYPE]
	 * 1=SVN 2=GIT
	 */
	private Integer respType;


	/**
	 * mapping-field: 代码库URL[RESP_URL]
	 * 如果是外部库则为全路径，内部库为相对地址
	 */
	private String respUrl;


	/**
	 * mapping-field: 代码库账号[RESP_USER]
	 */
	private String respUser;


	/**
	 * mapping-field: 代码库密码[RESP_PWD]
	 */
	private String respPwd;


	/**
	 * mapping-field: 构建命令[BUILD_CMD]
	 * 1=有效 0=无效
	 */
	private String buildCmd;


	/**
	 * mapping-field: 是否支持HOOK[IS_SUPPORT_HOOK]
	 */
	private Integer isSupportHook;


	/**
	 * mapping-field: 是否生成镜像[IS_BUILD_IMAGE]
	 */
	private Integer isBuildImage;


	/**
	 * mapping-field: 镜像定义ID[IMAGE_DEF_ID]
	 */
	private Long imageDefId;


	/**
	 * mapping-field: DOCKER_FILE路径[DOCKER_FILE_PATH]
	 */
	private String dockerFilePath;


	/**
	 * mapping-field: 是否自动推送至开发环境[IS_AUTO_PUSH_1]
	 */
	private Integer isAutoPush1;


	/**
	 * mapping-field: 开发环境数据中心[DATA_CENTER_ID]
	 */
	private Long dataCenterId;


	/**
	 * mapping-field: 开发环境资源中心[RES_CENTER_ID]
	 */
	private Long resCenterId;


	/**
	 * mapping-field: 数据状态[DATA_STATUS]
	 * 数据状态：1-正常 0-删除
	 */
	private Integer dataStatus;


	/**
	 * mapping-field: 创建人[CREATOR]
	 */
	private String creator;


	/**
	 * mapping-field: 创建时间[CREATE_TIME]
	 * yyyyMMddHHmmss
	 */
	private Long createTime;


	/**
	 * mapping-field: 修改人[MODIFIER]
	 */
	private String modifier;


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


	public Long getMntId() {
		return this.mntId;
	}
	public void setMntId(Long mntId) {
		this.mntId = mntId;
	}


	public String getBuildName() {
		return this.buildName;
	}
	public void setBuildName(String buildName) {
		this.buildName = buildName;
	}


	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Long getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}


	public Integer getIsExternal() {
		return this.isExternal;
	}
	public void setIsExternal(Integer isExternal) {
		this.isExternal = isExternal;
	}


	public Integer getRespType() {
		return this.respType;
	}
	public void setRespType(Integer respType) {
		this.respType = respType;
	}


	public String getRespUrl() {
		return this.respUrl;
	}
	public void setRespUrl(String respUrl) {
		this.respUrl = respUrl;
	}


	public String getRespUser() {
		return this.respUser;
	}
	public void setRespUser(String respUser) {
		this.respUser = respUser;
	}


	public String getRespPwd() {
		return this.respPwd;
	}
	public void setRespPwd(String respPwd) {
		this.respPwd = respPwd;
	}


	public String getBuildCmd() {
		return this.buildCmd;
	}
	public void setBuildCmd(String buildCmd) {
		this.buildCmd = buildCmd;
	}


	public Integer getIsSupportHook() {
		return this.isSupportHook;
	}
	public void setIsSupportHook(Integer isSupportHook) {
		this.isSupportHook = isSupportHook;
	}


	public Integer getIsBuildImage() {
		return this.isBuildImage;
	}
	public void setIsBuildImage(Integer isBuildImage) {
		this.isBuildImage = isBuildImage;
	}


	public Long getImageDefId() {
		return this.imageDefId;
	}
	public void setImageDefId(Long imageDefId) {
		this.imageDefId = imageDefId;
	}


	public String getDockerFilePath() {
		return this.dockerFilePath;
	}
	public void setDockerFilePath(String dockerFilePath) {
		this.dockerFilePath = dockerFilePath;
	}


	public Integer getIsAutoPush1() {
		return this.isAutoPush1;
	}
	public void setIsAutoPush1(Integer isAutoPush1) {
		this.isAutoPush1 = isAutoPush1;
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


	public Integer getDataStatus() {
		return this.dataStatus;
	}
	public void setDataStatus(Integer dataStatus) {
		this.dataStatus = dataStatus;
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


}



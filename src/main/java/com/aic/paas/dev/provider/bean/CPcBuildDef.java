package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 构建定义表[PC_BUILD_DEF]
 */
public class CPcBuildDef implements Condition {
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
	 * condition-field: 镜像定义ID[IMAGE_DEF_ID] operate-Equal[=]
	 */
	private Long imageDefId;


	/**
	 * condition-field: 镜像定义ID[IMAGE_DEF_ID] operate-In[in]
	 */
	private Long[] imageDefIds;


	/**
	 * condition-field: 镜像定义ID[IMAGE_DEF_ID] operate-GTEqual[>=]
	 */
	private Long startImageDefId;

	/**
	 * condition-field: 镜像定义ID[IMAGE_DEF_ID] operate-LTEqual[<=]
	 */
	private Long endImageDefId;


	/**
	 * condition-field: 构建名[BUILD_NAME] operate-Like[like]
	 */
	private String buildName;


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
	 * condition-field: 是否外部工程[IS_EXTERNAL] operate-Equal[=]
	 * 1=是 0=否
	 */
	private Integer isExternal;


	/**
	 * condition-field: 是否外部工程[IS_EXTERNAL] operate-In[in]
	 * 1=是 0=否
	 */
	private Integer[] isExternals;


	/**
	 * condition-field: 是否外部工程[IS_EXTERNAL] operate-GTEqual[>=]
	 * 1=是 0=否
	 */
	private Integer startIsExternal;

	/**
	 * condition-field: 是否外部工程[IS_EXTERNAL] operate-LTEqual[<=]
	 * 1=是 0=否
	 */
	private Integer endIsExternal;


	/**
	 * condition-field: 代码库类型[RESP_TYPE] operate-Equal[=]
	 * 1=SVN 2=GIT
	 */
	private Integer respType;


	/**
	 * condition-field: 代码库类型[RESP_TYPE] operate-In[in]
	 * 1=SVN 2=GIT
	 */
	private Integer[] respTypes;


	/**
	 * condition-field: 代码库类型[RESP_TYPE] operate-GTEqual[>=]
	 * 1=SVN 2=GIT
	 */
	private Integer startRespType;

	/**
	 * condition-field: 代码库类型[RESP_TYPE] operate-LTEqual[<=]
	 * 1=SVN 2=GIT
	 */
	private Integer endRespType;


	/**
	 * condition-field: 代码库URL[RESP_URL] operate-Like[like]
	 * 如果是外部库则为全路径，内部库为相对地址
	 */
	private String respUrl;


	/**
	 * condition-field: 分支[RESP_BRANCH] operate-Like[like]
	 */
	private String respBranch;


	/**
	 * condition-field: 代码库账号[RESP_USER] operate-Like[like]
	 */
	private String respUser;


	/**
	 * condition-field: 代码库账号[RESP_USER] operate-Equal[=]
	 */
	private String respUserEqual;


	/**
	 * condition-field: 代码库账号[RESP_USER] operate-In[in]
	 */
	private String[] respUsers;


	/**
	 * condition-field: 代码库密码[RESP_PWD] operate-Like[like]
	 */
	private String respPwd;


	/**
	 * condition-field: 代码库密码[RESP_PWD] operate-Equal[=]
	 */
	private String respPwdEqual;


	/**
	 * condition-field: 代码库密码[RESP_PWD] operate-In[in]
	 */
	private String[] respPwds;


	/**
	 * condition-field: 构建命令[BUILD_CMD] operate-Like[like]
	 * 1=有效 0=无效
	 */
	private String buildCmd;


	/**
	 * condition-field: 是否支持HOOK[IS_SUPPORT_HOOK] operate-Equal[=]
	 */
	private Integer isSupportHook;


	/**
	 * condition-field: 是否支持HOOK[IS_SUPPORT_HOOK] operate-In[in]
	 */
	private Integer[] isSupportHooks;


	/**
	 * condition-field: 是否支持HOOK[IS_SUPPORT_HOOK] operate-GTEqual[>=]
	 */
	private Integer startIsSupportHook;

	/**
	 * condition-field: 是否支持HOOK[IS_SUPPORT_HOOK] operate-LTEqual[<=]
	 */
	private Integer endIsSupportHook;


	/**
	 * condition-field: 是否生成镜像[IS_BUILD_IMAGE] operate-Equal[=]
	 */
	private Integer isBuildImage;


	/**
	 * condition-field: 是否生成镜像[IS_BUILD_IMAGE] operate-In[in]
	 */
	private Integer[] isBuildImages;


	/**
	 * condition-field: 是否生成镜像[IS_BUILD_IMAGE] operate-GTEqual[>=]
	 */
	private Integer startIsBuildImage;

	/**
	 * condition-field: 是否生成镜像[IS_BUILD_IMAGE] operate-LTEqual[<=]
	 */
	private Integer endIsBuildImage;


	/**
	 * condition-field: DOCKER_FILE路径[DOCKER_FILE_PATH] operate-Like[like]
	 */
	private String dockerFilePath;


	/**
	 * condition-field: 是否自动推送至开发环境[IS_AUTO_PUSH_1] operate-Equal[=]
	 */
	private Integer isAutoPush1;


	/**
	 * condition-field: 是否自动推送至开发环境[IS_AUTO_PUSH_1] operate-In[in]
	 */
	private Integer[] isAutoPush1s;


	/**
	 * condition-field: 是否自动推送至开发环境[IS_AUTO_PUSH_1] operate-GTEqual[>=]
	 */
	private Integer startIsAutoPush1;

	/**
	 * condition-field: 是否自动推送至开发环境[IS_AUTO_PUSH_1] operate-LTEqual[<=]
	 */
	private Integer endIsAutoPush1;


	/**
	 * condition-field: 开发环境数据中心[DATA_CENTER_ID] operate-Equal[=]
	 */
	private Long dataCenterId;


	/**
	 * condition-field: 开发环境数据中心[DATA_CENTER_ID] operate-In[in]
	 */
	private Long[] dataCenterIds;


	/**
	 * condition-field: 开发环境数据中心[DATA_CENTER_ID] operate-GTEqual[>=]
	 */
	private Long startDataCenterId;

	/**
	 * condition-field: 开发环境数据中心[DATA_CENTER_ID] operate-LTEqual[<=]
	 */
	private Long endDataCenterId;


	/**
	 * condition-field: 开发环境资源中心[RES_CENTER_ID] operate-Equal[=]
	 */
	private Long resCenterId;


	/**
	 * condition-field: 开发环境资源中心[RES_CENTER_ID] operate-In[in]
	 */
	private Long[] resCenterIds;


	/**
	 * condition-field: 开发环境资源中心[RES_CENTER_ID] operate-GTEqual[>=]
	 */
	private Long startResCenterId;

	/**
	 * condition-field: 开发环境资源中心[RES_CENTER_ID] operate-LTEqual[<=]
	 */
	private Long endResCenterId;


	/**
	 * condition-field: 开启构建缓存[OPEN_CACHE] operate-Equal[=]
	 * 1-开启 0-不开启
	 */
	private Integer openCache;


	/**
	 * condition-field: 开启构建缓存[OPEN_CACHE] operate-In[in]
	 * 1-开启 0-不开启
	 */
	private Integer[] openCaches;


	/**
	 * condition-field: 开启构建缓存[OPEN_CACHE] operate-GTEqual[>=]
	 * 1-开启 0-不开启
	 */
	private Integer startOpenCache;

	/**
	 * condition-field: 开启构建缓存[OPEN_CACHE] operate-LTEqual[<=]
	 * 1-开启 0-不开启
	 */
	private Integer endOpenCache;


	/**
	 * condition-field: 开启构建通知邮件[OPEN_EMAIL] operate-Equal[=]
	 * 1-通知 0-不通知
	 */
	private Integer openEmail;


	/**
	 * condition-field: 开启构建通知邮件[OPEN_EMAIL] operate-In[in]
	 * 1-通知 0-不通知
	 */
	private Integer[] openEmails;


	/**
	 * condition-field: 开启构建通知邮件[OPEN_EMAIL] operate-GTEqual[>=]
	 * 1-通知 0-不通知
	 */
	private Integer startOpenEmail;

	/**
	 * condition-field: 开启构建通知邮件[OPEN_EMAIL] operate-LTEqual[<=]
	 * 1-通知 0-不通知
	 */
	private Integer endOpenEmail;


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


	/**
	 * condition-field: 构建TAG[DEP_TAG] operate-Like[like]
	 */
	private String depTag;


	/**
	 * condition-field: 构建TAG[DEP_TAG] operate-Equal[=]
	 */
	private String depTagEqual;


	/**
	 * condition-field: 构建TAG[DEP_TAG] operate-In[in]
	 */
	private String[] depTags;




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


	public Long getImageDefId() {
		return this.imageDefId;
	}
	public void setImageDefId(Long imageDefId) {
		this.imageDefId = imageDefId;
	}


	public Long[] getImageDefIds() {
		return this.imageDefIds;
	}
	public void setImageDefIds(Long[] imageDefIds) {
		this.imageDefIds = imageDefIds;
	}


	public Long getStartImageDefId() {
		return this.startImageDefId;
	}
	public void setStartImageDefId(Long startImageDefId) {
		this.startImageDefId = startImageDefId;
	}


	public Long getEndImageDefId() {
		return this.endImageDefId;
	}
	public void setEndImageDefId(Long endImageDefId) {
		this.endImageDefId = endImageDefId;
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


	public Integer getRespType() {
		return this.respType;
	}
	public void setRespType(Integer respType) {
		this.respType = respType;
	}


	public Integer[] getRespTypes() {
		return this.respTypes;
	}
	public void setRespTypes(Integer[] respTypes) {
		this.respTypes = respTypes;
	}


	public Integer getStartRespType() {
		return this.startRespType;
	}
	public void setStartRespType(Integer startRespType) {
		this.startRespType = startRespType;
	}


	public Integer getEndRespType() {
		return this.endRespType;
	}
	public void setEndRespType(Integer endRespType) {
		this.endRespType = endRespType;
	}


	public String getRespUrl() {
		return this.respUrl;
	}
	public void setRespUrl(String respUrl) {
		this.respUrl = respUrl;
	}


	public String getRespBranch() {
		return this.respBranch;
	}
	public void setRespBranch(String respBranch) {
		this.respBranch = respBranch;
	}


	public String getRespUser() {
		return this.respUser;
	}
	public void setRespUser(String respUser) {
		this.respUser = respUser;
	}


	public String getRespUserEqual() {
		return this.respUserEqual;
	}
	public void setRespUserEqual(String respUserEqual) {
		this.respUserEqual = respUserEqual;
	}


	public String[] getRespUsers() {
		return this.respUsers;
	}
	public void setRespUsers(String[] respUsers) {
		this.respUsers = respUsers;
	}


	public String getRespPwd() {
		return this.respPwd;
	}
	public void setRespPwd(String respPwd) {
		this.respPwd = respPwd;
	}


	public String getRespPwdEqual() {
		return this.respPwdEqual;
	}
	public void setRespPwdEqual(String respPwdEqual) {
		this.respPwdEqual = respPwdEqual;
	}


	public String[] getRespPwds() {
		return this.respPwds;
	}
	public void setRespPwds(String[] respPwds) {
		this.respPwds = respPwds;
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


	public Integer[] getIsSupportHooks() {
		return this.isSupportHooks;
	}
	public void setIsSupportHooks(Integer[] isSupportHooks) {
		this.isSupportHooks = isSupportHooks;
	}


	public Integer getStartIsSupportHook() {
		return this.startIsSupportHook;
	}
	public void setStartIsSupportHook(Integer startIsSupportHook) {
		this.startIsSupportHook = startIsSupportHook;
	}


	public Integer getEndIsSupportHook() {
		return this.endIsSupportHook;
	}
	public void setEndIsSupportHook(Integer endIsSupportHook) {
		this.endIsSupportHook = endIsSupportHook;
	}


	public Integer getIsBuildImage() {
		return this.isBuildImage;
	}
	public void setIsBuildImage(Integer isBuildImage) {
		this.isBuildImage = isBuildImage;
	}


	public Integer[] getIsBuildImages() {
		return this.isBuildImages;
	}
	public void setIsBuildImages(Integer[] isBuildImages) {
		this.isBuildImages = isBuildImages;
	}


	public Integer getStartIsBuildImage() {
		return this.startIsBuildImage;
	}
	public void setStartIsBuildImage(Integer startIsBuildImage) {
		this.startIsBuildImage = startIsBuildImage;
	}


	public Integer getEndIsBuildImage() {
		return this.endIsBuildImage;
	}
	public void setEndIsBuildImage(Integer endIsBuildImage) {
		this.endIsBuildImage = endIsBuildImage;
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


	public Integer[] getIsAutoPush1s() {
		return this.isAutoPush1s;
	}
	public void setIsAutoPush1s(Integer[] isAutoPush1s) {
		this.isAutoPush1s = isAutoPush1s;
	}


	public Integer getStartIsAutoPush1() {
		return this.startIsAutoPush1;
	}
	public void setStartIsAutoPush1(Integer startIsAutoPush1) {
		this.startIsAutoPush1 = startIsAutoPush1;
	}


	public Integer getEndIsAutoPush1() {
		return this.endIsAutoPush1;
	}
	public void setEndIsAutoPush1(Integer endIsAutoPush1) {
		this.endIsAutoPush1 = endIsAutoPush1;
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


	public Integer getOpenCache() {
		return this.openCache;
	}
	public void setOpenCache(Integer openCache) {
		this.openCache = openCache;
	}


	public Integer[] getOpenCaches() {
		return this.openCaches;
	}
	public void setOpenCaches(Integer[] openCaches) {
		this.openCaches = openCaches;
	}


	public Integer getStartOpenCache() {
		return this.startOpenCache;
	}
	public void setStartOpenCache(Integer startOpenCache) {
		this.startOpenCache = startOpenCache;
	}


	public Integer getEndOpenCache() {
		return this.endOpenCache;
	}
	public void setEndOpenCache(Integer endOpenCache) {
		this.endOpenCache = endOpenCache;
	}


	public Integer getOpenEmail() {
		return this.openEmail;
	}
	public void setOpenEmail(Integer openEmail) {
		this.openEmail = openEmail;
	}


	public Integer[] getOpenEmails() {
		return this.openEmails;
	}
	public void setOpenEmails(Integer[] openEmails) {
		this.openEmails = openEmails;
	}


	public Integer getStartOpenEmail() {
		return this.startOpenEmail;
	}
	public void setStartOpenEmail(Integer startOpenEmail) {
		this.startOpenEmail = startOpenEmail;
	}


	public Integer getEndOpenEmail() {
		return this.endOpenEmail;
	}
	public void setEndOpenEmail(Integer endOpenEmail) {
		this.endOpenEmail = endOpenEmail;
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


	public String getDepTag() {
		return this.depTag;
	}
	public void setDepTag(String depTag) {
		this.depTag = depTag;
	}


	public String getDepTagEqual() {
		return this.depTagEqual;
	}
	public void setDepTagEqual(String depTagEqual) {
		this.depTagEqual = depTagEqual;
	}


	public String[] getDepTags() {
		return this.depTags;
	}
	public void setDepTags(String[] depTags) {
		this.depTags = depTags;
	}


}



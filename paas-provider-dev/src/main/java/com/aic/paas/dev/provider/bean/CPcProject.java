package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 产品工程表[PC_PROJECT]
 */
public class CPcProject implements Condition {
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
	 * condition-field: 所属机房[COMP_ROOM_ID] operate-Equal[=]
	 */
	private Long compRoomId;


	/**
	 * condition-field: 所属机房[COMP_ROOM_ID] operate-In[in]
	 */
	private Long[] compRoomIds;


	/**
	 * condition-field: 所属机房[COMP_ROOM_ID] operate-GTEqual[>=]
	 */
	private Long startCompRoomId;

	/**
	 * condition-field: 所属机房[COMP_ROOM_ID] operate-LTEqual[<=]
	 */
	private Long endCompRoomId;


	/**
	 * condition-field: 工程代码[CODE] operate-Like[like]
	 * 不可以为doc
	 */
	private String code;


	/**
	 * condition-field: 工程代码[CODE] operate-Equal[=]
	 * 不可以为doc
	 */
	private String codeEqual;


	/**
	 * condition-field: 工程代码[CODE] operate-In[in]
	 * 不可以为doc
	 */
	private String[] codes;


	/**
	 * condition-field: 工程名称[NAME] operate-Like[like]
	 */
	private String name;


	/**
	 * condition-field: 工程名称[NAME] operate-Equal[=]
	 */
	private String nameEqual;


	/**
	 * condition-field: 工程名称[NAME] operate-In[in]
	 */
	private String[] names;


	/**
	 * condition-field: 工程描述[REMARK] operate-Like[like]
	 */
	private String remark;


	/**
	 * condition-field: 工程状态[STATUS] operate-Equal[=]
	 * 1=有效 0=无效
	 */
	private Integer status;


	/**
	 * condition-field: 工程状态[STATUS] operate-In[in]
	 * 1=有效 0=无效
	 */
	private Integer[] statuss;


	/**
	 * condition-field: 工程状态[STATUS] operate-GTEqual[>=]
	 * 1=有效 0=无效
	 */
	private Integer startStatus;

	/**
	 * condition-field: 工程状态[STATUS] operate-LTEqual[<=]
	 * 1=有效 0=无效
	 */
	private Integer endStatus;


	/**
	 * condition-field: 文档库类型[RESP_DOC_TYPE] operate-Equal[=]
	 * 1=SVN 2=GIT
	 */
	private Integer respDocType;


	/**
	 * condition-field: 文档库类型[RESP_DOC_TYPE] operate-In[in]
	 * 1=SVN 2=GIT
	 */
	private Integer[] respDocTypes;


	/**
	 * condition-field: 文档库类型[RESP_DOC_TYPE] operate-GTEqual[>=]
	 * 1=SVN 2=GIT
	 */
	private Integer startRespDocType;

	/**
	 * condition-field: 文档库类型[RESP_DOC_TYPE] operate-LTEqual[<=]
	 * 1=SVN 2=GIT
	 */
	private Integer endRespDocType;


	/**
	 * condition-field: 文档库URL[RESP_DOC_URL] operate-Like[like]
	 * 相对地址
	 */
	private String respDocUrl;


	/**
	 * condition-field: 文档库状态[RESP_DOC_STATUS] operate-Equal[=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer respDocStatus;


	/**
	 * condition-field: 文档库状态[RESP_DOC_STATUS] operate-In[in]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer[] respDocStatuss;


	/**
	 * condition-field: 文档库状态[RESP_DOC_STATUS] operate-GTEqual[>=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer startRespDocStatus;

	/**
	 * condition-field: 文档库状态[RESP_DOC_STATUS] operate-LTEqual[<=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer endRespDocStatus;


	/**
	 * condition-field: 文档库申请ID[RESP_DOC_APPLY_ID] operate-Equal[=]
	 */
	private Long respDocApplyId;


	/**
	 * condition-field: 文档库申请ID[RESP_DOC_APPLY_ID] operate-In[in]
	 */
	private Long[] respDocApplyIds;


	/**
	 * condition-field: 文档库申请ID[RESP_DOC_APPLY_ID] operate-GTEqual[>=]
	 */
	private Long startRespDocApplyId;

	/**
	 * condition-field: 文档库申请ID[RESP_DOC_APPLY_ID] operate-LTEqual[<=]
	 */
	private Long endRespDocApplyId;


	/**
	 * condition-field: 代码库类型[RESP_CODE_TYPE] operate-Equal[=]
	 * 1=SVN 2=GIT
	 */
	private Integer respCodeType;


	/**
	 * condition-field: 代码库类型[RESP_CODE_TYPE] operate-In[in]
	 * 1=SVN 2=GIT
	 */
	private Integer[] respCodeTypes;


	/**
	 * condition-field: 代码库类型[RESP_CODE_TYPE] operate-GTEqual[>=]
	 * 1=SVN 2=GIT
	 */
	private Integer startRespCodeType;

	/**
	 * condition-field: 代码库类型[RESP_CODE_TYPE] operate-LTEqual[<=]
	 * 1=SVN 2=GIT
	 */
	private Integer endRespCodeType;


	/**
	 * condition-field: 代码库URL[RESP_CODE_URL] operate-Like[like]
	 * 相对地址
	 */
	private String respCodeUrl;


	/**
	 * condition-field: 代码库状态[RESP_CODE_STATUS] operate-Equal[=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer respCodeStatus;


	/**
	 * condition-field: 代码库状态[RESP_CODE_STATUS] operate-In[in]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer[] respCodeStatuss;


	/**
	 * condition-field: 代码库状态[RESP_CODE_STATUS] operate-GTEqual[>=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer startRespCodeStatus;

	/**
	 * condition-field: 代码库状态[RESP_CODE_STATUS] operate-LTEqual[<=]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer endRespCodeStatus;


	/**
	 * condition-field: 代码库申请ID[RESP_CODE_APPLY_ID] operate-Equal[=]
	 */
	private Long respCodeApplyId;


	/**
	 * condition-field: 代码库申请ID[RESP_CODE_APPLY_ID] operate-In[in]
	 */
	private Long[] respCodeApplyIds;


	/**
	 * condition-field: 代码库申请ID[RESP_CODE_APPLY_ID] operate-GTEqual[>=]
	 */
	private Long startRespCodeApplyId;

	/**
	 * condition-field: 代码库申请ID[RESP_CODE_APPLY_ID] operate-LTEqual[<=]
	 */
	private Long endRespCodeApplyId;


	/**
	 * condition-field: 镜像库URL[IMAGE_REG_URL] operate-Like[like]
	 */
	private String imageRegUrl;


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


	public Long getCompRoomId() {
		return this.compRoomId;
	}
	public void setCompRoomId(Long compRoomId) {
		this.compRoomId = compRoomId;
	}


	public Long[] getCompRoomIds() {
		return this.compRoomIds;
	}
	public void setCompRoomIds(Long[] compRoomIds) {
		this.compRoomIds = compRoomIds;
	}


	public Long getStartCompRoomId() {
		return this.startCompRoomId;
	}
	public void setStartCompRoomId(Long startCompRoomId) {
		this.startCompRoomId = startCompRoomId;
	}


	public Long getEndCompRoomId() {
		return this.endCompRoomId;
	}
	public void setEndCompRoomId(Long endCompRoomId) {
		this.endCompRoomId = endCompRoomId;
	}


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}


	public String getCodeEqual() {
		return this.codeEqual;
	}
	public void setCodeEqual(String codeEqual) {
		this.codeEqual = codeEqual;
	}


	public String[] getCodes() {
		return this.codes;
	}
	public void setCodes(String[] codes) {
		this.codes = codes;
	}


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String getNameEqual() {
		return this.nameEqual;
	}
	public void setNameEqual(String nameEqual) {
		this.nameEqual = nameEqual;
	}


	public String[] getNames() {
		return this.names;
	}
	public void setNames(String[] names) {
		this.names = names;
	}


	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}


	public Integer getStatus() {
		return this.status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer[] getStatuss() {
		return this.statuss;
	}
	public void setStatuss(Integer[] statuss) {
		this.statuss = statuss;
	}


	public Integer getStartStatus() {
		return this.startStatus;
	}
	public void setStartStatus(Integer startStatus) {
		this.startStatus = startStatus;
	}


	public Integer getEndStatus() {
		return this.endStatus;
	}
	public void setEndStatus(Integer endStatus) {
		this.endStatus = endStatus;
	}


	public Integer getRespDocType() {
		return this.respDocType;
	}
	public void setRespDocType(Integer respDocType) {
		this.respDocType = respDocType;
	}


	public Integer[] getRespDocTypes() {
		return this.respDocTypes;
	}
	public void setRespDocTypes(Integer[] respDocTypes) {
		this.respDocTypes = respDocTypes;
	}


	public Integer getStartRespDocType() {
		return this.startRespDocType;
	}
	public void setStartRespDocType(Integer startRespDocType) {
		this.startRespDocType = startRespDocType;
	}


	public Integer getEndRespDocType() {
		return this.endRespDocType;
	}
	public void setEndRespDocType(Integer endRespDocType) {
		this.endRespDocType = endRespDocType;
	}


	public String getRespDocUrl() {
		return this.respDocUrl;
	}
	public void setRespDocUrl(String respDocUrl) {
		this.respDocUrl = respDocUrl;
	}


	public Integer getRespDocStatus() {
		return this.respDocStatus;
	}
	public void setRespDocStatus(Integer respDocStatus) {
		this.respDocStatus = respDocStatus;
	}


	public Integer[] getRespDocStatuss() {
		return this.respDocStatuss;
	}
	public void setRespDocStatuss(Integer[] respDocStatuss) {
		this.respDocStatuss = respDocStatuss;
	}


	public Integer getStartRespDocStatus() {
		return this.startRespDocStatus;
	}
	public void setStartRespDocStatus(Integer startRespDocStatus) {
		this.startRespDocStatus = startRespDocStatus;
	}


	public Integer getEndRespDocStatus() {
		return this.endRespDocStatus;
	}
	public void setEndRespDocStatus(Integer endRespDocStatus) {
		this.endRespDocStatus = endRespDocStatus;
	}


	public Long getRespDocApplyId() {
		return this.respDocApplyId;
	}
	public void setRespDocApplyId(Long respDocApplyId) {
		this.respDocApplyId = respDocApplyId;
	}


	public Long[] getRespDocApplyIds() {
		return this.respDocApplyIds;
	}
	public void setRespDocApplyIds(Long[] respDocApplyIds) {
		this.respDocApplyIds = respDocApplyIds;
	}


	public Long getStartRespDocApplyId() {
		return this.startRespDocApplyId;
	}
	public void setStartRespDocApplyId(Long startRespDocApplyId) {
		this.startRespDocApplyId = startRespDocApplyId;
	}


	public Long getEndRespDocApplyId() {
		return this.endRespDocApplyId;
	}
	public void setEndRespDocApplyId(Long endRespDocApplyId) {
		this.endRespDocApplyId = endRespDocApplyId;
	}


	public Integer getRespCodeType() {
		return this.respCodeType;
	}
	public void setRespCodeType(Integer respCodeType) {
		this.respCodeType = respCodeType;
	}


	public Integer[] getRespCodeTypes() {
		return this.respCodeTypes;
	}
	public void setRespCodeTypes(Integer[] respCodeTypes) {
		this.respCodeTypes = respCodeTypes;
	}


	public Integer getStartRespCodeType() {
		return this.startRespCodeType;
	}
	public void setStartRespCodeType(Integer startRespCodeType) {
		this.startRespCodeType = startRespCodeType;
	}


	public Integer getEndRespCodeType() {
		return this.endRespCodeType;
	}
	public void setEndRespCodeType(Integer endRespCodeType) {
		this.endRespCodeType = endRespCodeType;
	}


	public String getRespCodeUrl() {
		return this.respCodeUrl;
	}
	public void setRespCodeUrl(String respCodeUrl) {
		this.respCodeUrl = respCodeUrl;
	}


	public Integer getRespCodeStatus() {
		return this.respCodeStatus;
	}
	public void setRespCodeStatus(Integer respCodeStatus) {
		this.respCodeStatus = respCodeStatus;
	}


	public Integer[] getRespCodeStatuss() {
		return this.respCodeStatuss;
	}
	public void setRespCodeStatuss(Integer[] respCodeStatuss) {
		this.respCodeStatuss = respCodeStatuss;
	}


	public Integer getStartRespCodeStatus() {
		return this.startRespCodeStatus;
	}
	public void setStartRespCodeStatus(Integer startRespCodeStatus) {
		this.startRespCodeStatus = startRespCodeStatus;
	}


	public Integer getEndRespCodeStatus() {
		return this.endRespCodeStatus;
	}
	public void setEndRespCodeStatus(Integer endRespCodeStatus) {
		this.endRespCodeStatus = endRespCodeStatus;
	}


	public Long getRespCodeApplyId() {
		return this.respCodeApplyId;
	}
	public void setRespCodeApplyId(Long respCodeApplyId) {
		this.respCodeApplyId = respCodeApplyId;
	}


	public Long[] getRespCodeApplyIds() {
		return this.respCodeApplyIds;
	}
	public void setRespCodeApplyIds(Long[] respCodeApplyIds) {
		this.respCodeApplyIds = respCodeApplyIds;
	}


	public Long getStartRespCodeApplyId() {
		return this.startRespCodeApplyId;
	}
	public void setStartRespCodeApplyId(Long startRespCodeApplyId) {
		this.startRespCodeApplyId = startRespCodeApplyId;
	}


	public Long getEndRespCodeApplyId() {
		return this.endRespCodeApplyId;
	}
	public void setEndRespCodeApplyId(Long endRespCodeApplyId) {
		this.endRespCodeApplyId = endRespCodeApplyId;
	}


	public String getImageRegUrl() {
		return this.imageRegUrl;
	}
	public void setImageRegUrl(String imageRegUrl) {
		this.imageRegUrl = imageRegUrl;
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



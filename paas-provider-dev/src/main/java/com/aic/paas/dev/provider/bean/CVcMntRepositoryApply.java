package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 版本库申请表[VC_MNT_REPOSITORY_APPLY]
 */
public class CVcMntRepositoryApply implements Condition {
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
	 * condition-field: 申请单号[CODE] operate-Equal[=]
	 */
	private Long code;


	/**
	 * condition-field: 申请单号[CODE] operate-In[in]
	 */
	private Long[] codes;


	/**
	 * condition-field: 申请单号[CODE] operate-GTEqual[>=]
	 */
	private Long startCode;

	/**
	 * condition-field: 申请单号[CODE] operate-LTEqual[<=]
	 */
	private Long endCode;


	/**
	 * condition-field: 申请租户[MNT_ID] operate-Equal[=]
	 */
	private Long mntId;


	/**
	 * condition-field: 申请租户[MNT_ID] operate-In[in]
	 */
	private Long[] mntIds;


	/**
	 * condition-field: 申请租户[MNT_ID] operate-GTEqual[>=]
	 */
	private Long startMntId;

	/**
	 * condition-field: 申请租户[MNT_ID] operate-LTEqual[<=]
	 */
	private Long endMntId;


	/**
	 * condition-field: 所在机房[COMP_ROOM_ID] operate-Equal[=]
	 */
	private Long compRoomId;


	/**
	 * condition-field: 所在机房[COMP_ROOM_ID] operate-In[in]
	 */
	private Long[] compRoomIds;


	/**
	 * condition-field: 所在机房[COMP_ROOM_ID] operate-GTEqual[>=]
	 */
	private Long startCompRoomId;

	/**
	 * condition-field: 所在机房[COMP_ROOM_ID] operate-LTEqual[<=]
	 */
	private Long endCompRoomId;


	/**
	 * condition-field: 所属版本库[RESP_ID] operate-Equal[=]
	 */
	private Long respId;


	/**
	 * condition-field: 所属版本库[RESP_ID] operate-In[in]
	 */
	private Long[] respIds;


	/**
	 * condition-field: 所属版本库[RESP_ID] operate-GTEqual[>=]
	 */
	private Long startRespId;

	/**
	 * condition-field: 所属版本库[RESP_ID] operate-LTEqual[<=]
	 */
	private Long endRespId;


	/**
	 * condition-field: 版本库类型[RESP_TYPE] operate-Equal[=]
	 * 1=SVN 2=GIT
	 */
	private Integer respType;


	/**
	 * condition-field: 版本库类型[RESP_TYPE] operate-In[in]
	 * 1=SVN 2=GIT
	 */
	private Integer[] respTypes;


	/**
	 * condition-field: 版本库类型[RESP_TYPE] operate-GTEqual[>=]
	 * 1=SVN 2=GIT
	 */
	private Integer startRespType;

	/**
	 * condition-field: 版本库类型[RESP_TYPE] operate-LTEqual[<=]
	 * 1=SVN 2=GIT
	 */
	private Integer endRespType;


	/**
	 * condition-field: 内容类型[CONT_TYPE] operate-Equal[=]
	 * 1=DOC 2=CODE
	 */
	private Integer contType;


	/**
	 * condition-field: 内容类型[CONT_TYPE] operate-In[in]
	 * 1=DOC 2=CODE
	 */
	private Integer[] contTypes;


	/**
	 * condition-field: 内容类型[CONT_TYPE] operate-GTEqual[>=]
	 * 1=DOC 2=CODE
	 */
	private Integer startContType;

	/**
	 * condition-field: 内容类型[CONT_TYPE] operate-LTEqual[<=]
	 * 1=DOC 2=CODE
	 */
	private Integer endContType;


	/**
	 * condition-field: 来源类型[SOURCE_TYPE] operate-Equal[=]
	 * 1=产品 2=工程
	 */
	private Integer sourceType;


	/**
	 * condition-field: 来源类型[SOURCE_TYPE] operate-In[in]
	 * 1=产品 2=工程
	 */
	private Integer[] sourceTypes;


	/**
	 * condition-field: 来源类型[SOURCE_TYPE] operate-GTEqual[>=]
	 * 1=产品 2=工程
	 */
	private Integer startSourceType;

	/**
	 * condition-field: 来源类型[SOURCE_TYPE] operate-LTEqual[<=]
	 * 1=产品 2=工程
	 */
	private Integer endSourceType;


	/**
	 * condition-field: 来源ID[SOURCE_ID] operate-Equal[=]
	 */
	private Long sourceId;


	/**
	 * condition-field: 来源ID[SOURCE_ID] operate-In[in]
	 */
	private Long[] sourceIds;


	/**
	 * condition-field: 来源ID[SOURCE_ID] operate-GTEqual[>=]
	 */
	private Long startSourceId;

	/**
	 * condition-field: 来源ID[SOURCE_ID] operate-LTEqual[<=]
	 */
	private Long endSourceId;


	/**
	 * condition-field: 备注[REMARK] operate-Like[like]
	 */
	private String remark;


	/**
	 * condition-field: 状态[STATUS] operate-Equal[=]
	 * 0=待开通 1=已开通
	 */
	private Integer status;


	/**
	 * condition-field: 状态[STATUS] operate-In[in]
	 * 0=待开通 1=已开通
	 */
	private Integer[] statuss;


	/**
	 * condition-field: 状态[STATUS] operate-GTEqual[>=]
	 * 0=待开通 1=已开通
	 */
	private Integer startStatus;

	/**
	 * condition-field: 状态[STATUS] operate-LTEqual[<=]
	 * 0=待开通 1=已开通
	 */
	private Integer endStatus;


	/**
	 * condition-field: 申请时间[APPLY_TIME] operate-Equal[=]
	 */
	private Long applyTime;


	/**
	 * condition-field: 申请时间[APPLY_TIME] operate-In[in]
	 */
	private Long[] applyTimes;


	/**
	 * condition-field: 申请时间[APPLY_TIME] operate-GTEqual[>=]
	 */
	private Long startApplyTime;

	/**
	 * condition-field: 申请时间[APPLY_TIME] operate-LTEqual[<=]
	 */
	private Long endApplyTime;


	/**
	 * condition-field: 申请人ID[APPLIOR_ID] operate-Equal[=]
	 */
	private Long appliorId;


	/**
	 * condition-field: 申请人ID[APPLIOR_ID] operate-In[in]
	 */
	private Long[] appliorIds;


	/**
	 * condition-field: 申请人ID[APPLIOR_ID] operate-GTEqual[>=]
	 */
	private Long startAppliorId;

	/**
	 * condition-field: 申请人ID[APPLIOR_ID] operate-LTEqual[<=]
	 */
	private Long endAppliorId;


	/**
	 * condition-field: 申请人姓名[APPLIOR_NAME] operate-Like[like]
	 */
	private String appliorName;


	/**
	 * condition-field: 申请人姓名[APPLIOR_NAME] operate-Equal[=]
	 */
	private String appliorNameEqual;


	/**
	 * condition-field: 申请人姓名[APPLIOR_NAME] operate-In[in]
	 */
	private String[] appliorNames;


	/**
	 * condition-field: 开通时间[CHECK_TIME] operate-Equal[=]
	 */
	private Long checkTime;


	/**
	 * condition-field: 开通时间[CHECK_TIME] operate-In[in]
	 */
	private Long[] checkTimes;


	/**
	 * condition-field: 开通时间[CHECK_TIME] operate-GTEqual[>=]
	 */
	private Long startCheckTime;

	/**
	 * condition-field: 开通时间[CHECK_TIME] operate-LTEqual[<=]
	 */
	private Long endCheckTime;


	/**
	 * condition-field: 开通人ID[CHECKER_ID] operate-Equal[=]
	 */
	private Long checkerId;


	/**
	 * condition-field: 开通人ID[CHECKER_ID] operate-In[in]
	 */
	private Long[] checkerIds;


	/**
	 * condition-field: 开通人ID[CHECKER_ID] operate-GTEqual[>=]
	 */
	private Long startCheckerId;

	/**
	 * condition-field: 开通人ID[CHECKER_ID] operate-LTEqual[<=]
	 */
	private Long endCheckerId;


	/**
	 * condition-field: 开通人姓名[CHECKER_NAME] operate-Like[like]
	 */
	private String checkerName;


	/**
	 * condition-field: 开通人姓名[CHECKER_NAME] operate-Equal[=]
	 */
	private String checkerNameEqual;


	/**
	 * condition-field: 开通人姓名[CHECKER_NAME] operate-In[in]
	 */
	private String[] checkerNames;


	/**
	 * condition-field: 开通备注[CHECK_DESC] operate-Like[like]
	 */
	private String checkDesc;


	/**
	 * condition-field: 版本库URL[RESP_URL] operate-Like[like]
	 */
	private String respUrl;


	/**
	 * condition-field: 备用字段_1[CUSTOM_1] operate-Equal[=]
	 */
	private Long custom1;


	/**
	 * condition-field: 备用字段_1[CUSTOM_1] operate-In[in]
	 */
	private Long[] custom1s;


	/**
	 * condition-field: 备用字段_1[CUSTOM_1] operate-GTEqual[>=]
	 */
	private Long startCustom1;

	/**
	 * condition-field: 备用字段_1[CUSTOM_1] operate-LTEqual[<=]
	 */
	private Long endCustom1;


	/**
	 * condition-field: 备用字段_2[CUSTOM_2] operate-Equal[=]
	 */
	private Long custom2;


	/**
	 * condition-field: 备用字段_2[CUSTOM_2] operate-In[in]
	 */
	private Long[] custom2s;


	/**
	 * condition-field: 备用字段_2[CUSTOM_2] operate-GTEqual[>=]
	 */
	private Long startCustom2;

	/**
	 * condition-field: 备用字段_2[CUSTOM_2] operate-LTEqual[<=]
	 */
	private Long endCustom2;


	/**
	 * condition-field: 备用字段_3[CUSTOM_3] operate-Equal[=]
	 */
	private Long custom3;


	/**
	 * condition-field: 备用字段_3[CUSTOM_3] operate-In[in]
	 */
	private Long[] custom3s;


	/**
	 * condition-field: 备用字段_3[CUSTOM_3] operate-GTEqual[>=]
	 */
	private Long startCustom3;

	/**
	 * condition-field: 备用字段_3[CUSTOM_3] operate-LTEqual[<=]
	 */
	private Long endCustom3;


	/**
	 * condition-field: 备用字段_4[CUSTOM_4] operate-Like[like]
	 */
	private String custom4;


	/**
	 * condition-field: 备用字段_5[CUSTOM_5] operate-Like[like]
	 */
	private String custom5;


	/**
	 * condition-field: 备用字段_6[CUSTOM_6] operate-Like[like]
	 */
	private String custom6;


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


	public Long getCode() {
		return this.code;
	}
	public void setCode(Long code) {
		this.code = code;
	}


	public Long[] getCodes() {
		return this.codes;
	}
	public void setCodes(Long[] codes) {
		this.codes = codes;
	}


	public Long getStartCode() {
		return this.startCode;
	}
	public void setStartCode(Long startCode) {
		this.startCode = startCode;
	}


	public Long getEndCode() {
		return this.endCode;
	}
	public void setEndCode(Long endCode) {
		this.endCode = endCode;
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


	public Long getRespId() {
		return this.respId;
	}
	public void setRespId(Long respId) {
		this.respId = respId;
	}


	public Long[] getRespIds() {
		return this.respIds;
	}
	public void setRespIds(Long[] respIds) {
		this.respIds = respIds;
	}


	public Long getStartRespId() {
		return this.startRespId;
	}
	public void setStartRespId(Long startRespId) {
		this.startRespId = startRespId;
	}


	public Long getEndRespId() {
		return this.endRespId;
	}
	public void setEndRespId(Long endRespId) {
		this.endRespId = endRespId;
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


	public Integer getContType() {
		return this.contType;
	}
	public void setContType(Integer contType) {
		this.contType = contType;
	}


	public Integer[] getContTypes() {
		return this.contTypes;
	}
	public void setContTypes(Integer[] contTypes) {
		this.contTypes = contTypes;
	}


	public Integer getStartContType() {
		return this.startContType;
	}
	public void setStartContType(Integer startContType) {
		this.startContType = startContType;
	}


	public Integer getEndContType() {
		return this.endContType;
	}
	public void setEndContType(Integer endContType) {
		this.endContType = endContType;
	}


	public Integer getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}


	public Integer[] getSourceTypes() {
		return this.sourceTypes;
	}
	public void setSourceTypes(Integer[] sourceTypes) {
		this.sourceTypes = sourceTypes;
	}


	public Integer getStartSourceType() {
		return this.startSourceType;
	}
	public void setStartSourceType(Integer startSourceType) {
		this.startSourceType = startSourceType;
	}


	public Integer getEndSourceType() {
		return this.endSourceType;
	}
	public void setEndSourceType(Integer endSourceType) {
		this.endSourceType = endSourceType;
	}


	public Long getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}


	public Long[] getSourceIds() {
		return this.sourceIds;
	}
	public void setSourceIds(Long[] sourceIds) {
		this.sourceIds = sourceIds;
	}


	public Long getStartSourceId() {
		return this.startSourceId;
	}
	public void setStartSourceId(Long startSourceId) {
		this.startSourceId = startSourceId;
	}


	public Long getEndSourceId() {
		return this.endSourceId;
	}
	public void setEndSourceId(Long endSourceId) {
		this.endSourceId = endSourceId;
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


	public Long getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}


	public Long[] getApplyTimes() {
		return this.applyTimes;
	}
	public void setApplyTimes(Long[] applyTimes) {
		this.applyTimes = applyTimes;
	}


	public Long getStartApplyTime() {
		return this.startApplyTime;
	}
	public void setStartApplyTime(Long startApplyTime) {
		this.startApplyTime = startApplyTime;
	}


	public Long getEndApplyTime() {
		return this.endApplyTime;
	}
	public void setEndApplyTime(Long endApplyTime) {
		this.endApplyTime = endApplyTime;
	}


	public Long getAppliorId() {
		return this.appliorId;
	}
	public void setAppliorId(Long appliorId) {
		this.appliorId = appliorId;
	}


	public Long[] getAppliorIds() {
		return this.appliorIds;
	}
	public void setAppliorIds(Long[] appliorIds) {
		this.appliorIds = appliorIds;
	}


	public Long getStartAppliorId() {
		return this.startAppliorId;
	}
	public void setStartAppliorId(Long startAppliorId) {
		this.startAppliorId = startAppliorId;
	}


	public Long getEndAppliorId() {
		return this.endAppliorId;
	}
	public void setEndAppliorId(Long endAppliorId) {
		this.endAppliorId = endAppliorId;
	}


	public String getAppliorName() {
		return this.appliorName;
	}
	public void setAppliorName(String appliorName) {
		this.appliorName = appliorName;
	}


	public String getAppliorNameEqual() {
		return this.appliorNameEqual;
	}
	public void setAppliorNameEqual(String appliorNameEqual) {
		this.appliorNameEqual = appliorNameEqual;
	}


	public String[] getAppliorNames() {
		return this.appliorNames;
	}
	public void setAppliorNames(String[] appliorNames) {
		this.appliorNames = appliorNames;
	}


	public Long getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Long checkTime) {
		this.checkTime = checkTime;
	}


	public Long[] getCheckTimes() {
		return this.checkTimes;
	}
	public void setCheckTimes(Long[] checkTimes) {
		this.checkTimes = checkTimes;
	}


	public Long getStartCheckTime() {
		return this.startCheckTime;
	}
	public void setStartCheckTime(Long startCheckTime) {
		this.startCheckTime = startCheckTime;
	}


	public Long getEndCheckTime() {
		return this.endCheckTime;
	}
	public void setEndCheckTime(Long endCheckTime) {
		this.endCheckTime = endCheckTime;
	}


	public Long getCheckerId() {
		return this.checkerId;
	}
	public void setCheckerId(Long checkerId) {
		this.checkerId = checkerId;
	}


	public Long[] getCheckerIds() {
		return this.checkerIds;
	}
	public void setCheckerIds(Long[] checkerIds) {
		this.checkerIds = checkerIds;
	}


	public Long getStartCheckerId() {
		return this.startCheckerId;
	}
	public void setStartCheckerId(Long startCheckerId) {
		this.startCheckerId = startCheckerId;
	}


	public Long getEndCheckerId() {
		return this.endCheckerId;
	}
	public void setEndCheckerId(Long endCheckerId) {
		this.endCheckerId = endCheckerId;
	}


	public String getCheckerName() {
		return this.checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
	}


	public String getCheckerNameEqual() {
		return this.checkerNameEqual;
	}
	public void setCheckerNameEqual(String checkerNameEqual) {
		this.checkerNameEqual = checkerNameEqual;
	}


	public String[] getCheckerNames() {
		return this.checkerNames;
	}
	public void setCheckerNames(String[] checkerNames) {
		this.checkerNames = checkerNames;
	}


	public String getCheckDesc() {
		return this.checkDesc;
	}
	public void setCheckDesc(String checkDesc) {
		this.checkDesc = checkDesc;
	}


	public String getRespUrl() {
		return this.respUrl;
	}
	public void setRespUrl(String respUrl) {
		this.respUrl = respUrl;
	}


	public Long getCustom1() {
		return this.custom1;
	}
	public void setCustom1(Long custom1) {
		this.custom1 = custom1;
	}


	public Long[] getCustom1s() {
		return this.custom1s;
	}
	public void setCustom1s(Long[] custom1s) {
		this.custom1s = custom1s;
	}


	public Long getStartCustom1() {
		return this.startCustom1;
	}
	public void setStartCustom1(Long startCustom1) {
		this.startCustom1 = startCustom1;
	}


	public Long getEndCustom1() {
		return this.endCustom1;
	}
	public void setEndCustom1(Long endCustom1) {
		this.endCustom1 = endCustom1;
	}


	public Long getCustom2() {
		return this.custom2;
	}
	public void setCustom2(Long custom2) {
		this.custom2 = custom2;
	}


	public Long[] getCustom2s() {
		return this.custom2s;
	}
	public void setCustom2s(Long[] custom2s) {
		this.custom2s = custom2s;
	}


	public Long getStartCustom2() {
		return this.startCustom2;
	}
	public void setStartCustom2(Long startCustom2) {
		this.startCustom2 = startCustom2;
	}


	public Long getEndCustom2() {
		return this.endCustom2;
	}
	public void setEndCustom2(Long endCustom2) {
		this.endCustom2 = endCustom2;
	}


	public Long getCustom3() {
		return this.custom3;
	}
	public void setCustom3(Long custom3) {
		this.custom3 = custom3;
	}


	public Long[] getCustom3s() {
		return this.custom3s;
	}
	public void setCustom3s(Long[] custom3s) {
		this.custom3s = custom3s;
	}


	public Long getStartCustom3() {
		return this.startCustom3;
	}
	public void setStartCustom3(Long startCustom3) {
		this.startCustom3 = startCustom3;
	}


	public Long getEndCustom3() {
		return this.endCustom3;
	}
	public void setEndCustom3(Long endCustom3) {
		this.endCustom3 = endCustom3;
	}


	public String getCustom4() {
		return this.custom4;
	}
	public void setCustom4(String custom4) {
		this.custom4 = custom4;
	}


	public String getCustom5() {
		return this.custom5;
	}
	public void setCustom5(String custom5) {
		this.custom5 = custom5;
	}


	public String getCustom6() {
		return this.custom6;
	}
	public void setCustom6(String custom6) {
		this.custom6 = custom6;
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



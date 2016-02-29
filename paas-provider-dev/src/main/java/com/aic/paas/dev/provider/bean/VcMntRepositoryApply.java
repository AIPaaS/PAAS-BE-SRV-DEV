package com.aic.paas.dev.provider.bean;



import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 版本库申请表[VC_MNT_REPOSITORY_APPLY]
 */
public class VcMntRepositoryApply implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 申请单号[CODE]
	 */
	private Long code;


	/**
	 * mapping-field: 申请租户[MNT_ID]
	 */
	private Long mntId;


	/**
	 * mapping-field: 所在机房[COMP_ROOM_ID]
	 */
	private Long compRoomId;


	/**
	 * mapping-field: 所属版本库[RESP_ID]
	 */
	private Long respId;


	/**
	 * mapping-field: 版本库类型[RESP_TYPE]
	 * 1=SVN 2=GIT
	 */
	private Integer respType;


	/**
	 * mapping-field: 内容类型[CONT_TYPE]
	 * 1=DOC 2=CODE
	 */
	private Integer contType;


	/**
	 * mapping-field: 来源类型[SOURCE_TYPE]
	 * 1=产品 2=工程
	 */
	private Integer sourceType;


	/**
	 * mapping-field: 来源ID[SOURCE_ID]
	 */
	private Long sourceId;


	/**
	 * mapping-field: 备注[REMARK]
	 */
	private String remark;


	/**
	 * mapping-field: 状态[STATUS]
	 * 0=待开通 1=已开通
	 */
	private Integer status;


	/**
	 * mapping-field: 申请时间[APPLY_TIME]
	 */
	private Long applyTime;


	/**
	 * mapping-field: 申请人ID[APPLIOR_ID]
	 */
	private Long appliorId;


	/**
	 * mapping-field: 申请人姓名[APPLIOR_NAME]
	 */
	private String appliorName;


	/**
	 * mapping-field: 开通时间[CHECK_TIME]
	 */
	private Long checkTime;


	/**
	 * mapping-field: 开通人ID[CHECKER_ID]
	 */
	private Long checkerId;


	/**
	 * mapping-field: 开通人姓名[CHECKER_NAME]
	 */
	private String checkerName;


	/**
	 * mapping-field: 开通备注[CHECK_DESC]
	 */
	private String checkDesc;


	/**
	 * mapping-field: 版本库URL[RESP_URL]
	 */
	private String respUrl;


	/**
	 * mapping-field: 备用字段_1[CUSTOM_1]
	 */
	private Long custom1;


	/**
	 * mapping-field: 备用字段_2[CUSTOM_2]
	 */
	private Long custom2;


	/**
	 * mapping-field: 备用字段_3[CUSTOM_3]
	 */
	private Long custom3;


	/**
	 * mapping-field: 备用字段_4[CUSTOM_4]
	 */
	private String custom4;


	/**
	 * mapping-field: 备用字段_5[CUSTOM_5]
	 */
	private String custom5;


	/**
	 * mapping-field: 备用字段_6[CUSTOM_6]
	 */
	private String custom6;


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


	public Long getCode() {
		return this.code;
	}
	public void setCode(Long code) {
		this.code = code;
	}


	public Long getMntId() {
		return this.mntId;
	}
	public void setMntId(Long mntId) {
		this.mntId = mntId;
	}


	public Long getCompRoomId() {
		return this.compRoomId;
	}
	public void setCompRoomId(Long compRoomId) {
		this.compRoomId = compRoomId;
	}


	public Long getRespId() {
		return this.respId;
	}
	public void setRespId(Long respId) {
		this.respId = respId;
	}


	public Integer getRespType() {
		return this.respType;
	}
	public void setRespType(Integer respType) {
		this.respType = respType;
	}


	public Integer getContType() {
		return this.contType;
	}
	public void setContType(Integer contType) {
		this.contType = contType;
	}


	public Integer getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(Integer sourceType) {
		this.sourceType = sourceType;
	}


	public Long getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
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


	public Long getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}


	public Long getAppliorId() {
		return this.appliorId;
	}
	public void setAppliorId(Long appliorId) {
		this.appliorId = appliorId;
	}


	public String getAppliorName() {
		return this.appliorName;
	}
	public void setAppliorName(String appliorName) {
		this.appliorName = appliorName;
	}


	public Long getCheckTime() {
		return this.checkTime;
	}
	public void setCheckTime(Long checkTime) {
		this.checkTime = checkTime;
	}


	public Long getCheckerId() {
		return this.checkerId;
	}
	public void setCheckerId(Long checkerId) {
		this.checkerId = checkerId;
	}


	public String getCheckerName() {
		return this.checkerName;
	}
	public void setCheckerName(String checkerName) {
		this.checkerName = checkerName;
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


	public Long getCustom2() {
		return this.custom2;
	}
	public void setCustom2(Long custom2) {
		this.custom2 = custom2;
	}


	public Long getCustom3() {
		return this.custom3;
	}
	public void setCustom3(Long custom3) {
		this.custom3 = custom3;
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



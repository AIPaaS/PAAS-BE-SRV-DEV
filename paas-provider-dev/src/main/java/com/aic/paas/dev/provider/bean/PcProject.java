package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.EntityBean;


/**
 * mapping-table: 产品工程表[PC_PROJECT]
 */
public class PcProject implements EntityBean {
	private static final long serialVersionUID = 1L;


	/**
	 * mapping-field: ID[ID]
	 */
	private Long id;


	/**
	 * mapping-field: 所属产品[PRODUCT_ID]
	 */
	private Long productId;


	/**
	 * mapping-field: 所属机房[COMP_ROOM_ID]
	 */
	private Long compRoomId;


	/**
	 * mapping-field: 工程代码[CODE]
	 * 不可以为doc
	 */
	private String code;


	/**
	 * mapping-field: 工程名称[NAME]
	 */
	private String name;


	/**
	 * mapping-field: 工程描述[REMARK]
	 */
	private String remark;


	/**
	 * mapping-field: 工程状态[STATUS]
	 * 1=有效 0=无效
	 */
	private Integer status;


	/**
	 * mapping-field: 文档库类型[RESP_DOC_TYPE]
	 * 1=SVN 2=GIT
	 */
	private Integer respDocType;


	/**
	 * mapping-field: 文档库URL[RESP_DOC_URL]
	 * 相对地址
	 */
	private String respDocUrl;


	/**
	 * mapping-field: 文档库状态[RESP_DOC_STATUS]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer respDocStatus;


	/**
	 * mapping-field: 文档库申请ID[RESP_DOC_APPLY_ID]
	 */
	private Long respDocApplyId;


	/**
	 * mapping-field: 代码库类型[RESP_CODE_TYPE]
	 * 1=SVN 2=GIT
	 */
	private Integer respCodeType;


	/**
	 * mapping-field: 代码库URL[RESP_CODE_URL]
	 * 相对地址
	 */
	private String respCodeUrl;


	/**
	 * mapping-field: 代码库状态[RESP_CODE_STATUS]
	 * 1=未开通 2=待开通 3=已开通
	 */
	private Integer respCodeStatus;


	/**
	 * mapping-field: 代码库申请ID[RESP_CODE_APPLY_ID]
	 */
	private Long respCodeApplyId;


	/**
	 * mapping-field: 镜像库URL[IMAGE_REG_URL]
	 */
	private String imageRegUrl;


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


	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public Long getCompRoomId() {
		return this.compRoomId;
	}
	public void setCompRoomId(Long compRoomId) {
		this.compRoomId = compRoomId;
	}


	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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


	public Integer getRespDocType() {
		return this.respDocType;
	}
	public void setRespDocType(Integer respDocType) {
		this.respDocType = respDocType;
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


	public Long getRespDocApplyId() {
		return this.respDocApplyId;
	}
	public void setRespDocApplyId(Long respDocApplyId) {
		this.respDocApplyId = respDocApplyId;
	}


	public Integer getRespCodeType() {
		return this.respCodeType;
	}
	public void setRespCodeType(Integer respCodeType) {
		this.respCodeType = respCodeType;
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


	public Long getRespCodeApplyId() {
		return this.respCodeApplyId;
	}
	public void setRespCodeApplyId(Long respCodeApplyId) {
		this.respCodeApplyId = respCodeApplyId;
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



package com.aic.paas.dev.provider.bean;




import com.binary.framework.bean.Condition;


/**
 * condition-table: 工程管理员表[PC_PROJECT_MGR]
 */
public class CPcProjectMgr implements Condition {
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
	 * condition-field: 工程ID[PROJECT_ID] operate-Equal[=]
	 */
	private Long projectId;


	/**
	 * condition-field: 工程ID[PROJECT_ID] operate-In[in]
	 */
	private Long[] projectIds;


	/**
	 * condition-field: 工程ID[PROJECT_ID] operate-GTEqual[>=]
	 */
	private Long startProjectId;

	/**
	 * condition-field: 工程ID[PROJECT_ID] operate-LTEqual[<=]
	 */
	private Long endProjectId;


	/**
	 * condition-field: 用户ID[USER_ID] operate-Equal[=]
	 */
	private Long userId;


	/**
	 * condition-field: 用户ID[USER_ID] operate-In[in]
	 */
	private Long[] userIds;


	/**
	 * condition-field: 用户ID[USER_ID] operate-GTEqual[>=]
	 */
	private Long startUserId;

	/**
	 * condition-field: 用户ID[USER_ID] operate-LTEqual[<=]
	 */
	private Long endUserId;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-Equal[=]
	 */
	private Long createTime;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-In[in]
	 */
	private Long[] createTimes;


	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-GTEqual[>=]
	 */
	private Long startCreateTime;

	/**
	 * condition-field: 创建时间[CREATE_TIME] operate-LTEqual[<=]
	 */
	private Long endCreateTime;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-Equal[=]
	 */
	private Long modifyTime;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-In[in]
	 */
	private Long[] modifyTimes;


	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-GTEqual[>=]
	 */
	private Long startModifyTime;

	/**
	 * condition-field: 修改时间[MODIFY_TIME] operate-LTEqual[<=]
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


	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Long[] getUserIds() {
		return this.userIds;
	}
	public void setUserIds(Long[] userIds) {
		this.userIds = userIds;
	}


	public Long getStartUserId() {
		return this.startUserId;
	}
	public void setStartUserId(Long startUserId) {
		this.startUserId = startUserId;
	}


	public Long getEndUserId() {
		return this.endUserId;
	}
	public void setEndUserId(Long endUserId) {
		this.endUserId = endUserId;
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



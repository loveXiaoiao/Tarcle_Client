package com.warmwind.tarcle.entity;

import java.util.Date;

public class CircleRole {
	
	private Long id;
	private String roleName;//角色名
	private Circle circle;//所属圈(多对一)
	private Date createTime;//创建时间
	private Integer status;//状态(0启用，1停用)是否在关联
	private String avatar;//头像
	private Integer activeDegree;//活跃度（1，正常，2，活跃，3，不活跃）
	private String remark;//备注
	private Account account;//使用人(多对一)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Integer getActiveDegree() {
		return activeDegree;
	}
	public void setActiveDegree(Integer activeDegree) {
		this.activeDegree = activeDegree;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

}

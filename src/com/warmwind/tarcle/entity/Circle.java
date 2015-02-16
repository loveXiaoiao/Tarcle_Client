package com.warmwind.tarcle.entity;

import java.util.Date;
import java.util.List;

public class Circle {
	private Long id;
	private String name;//圈子名称
	private Account createAccount;//创建人
	private Date createTime;//创建时间
	private Integer status;//状态(0启用，1停用)
	private String theme;//圈子主题
	private String avatar;//头像
	private List<Account> attentionAccounts;//关注此圈子用户
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getCreateAccount() {
		return createAccount;
	}
	public void setCreateAccount(Account createAccount) {
		this.createAccount = createAccount;
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
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public List<Account> getAttentionAccounts() {
		return attentionAccounts;
	}
	public void setAttentionAccounts(List<Account> attentionAccounts) {
		this.attentionAccounts = attentionAccounts;
	}

}

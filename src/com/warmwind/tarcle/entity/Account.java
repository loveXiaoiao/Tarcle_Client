package com.warmwind.tarcle.entity;

import java.util.Date;

public class Account {
	
	private Long id;
	private String accountName;//微信号
	private String password;//密码
	private String avatar;//头像
	private String nickName;//昵称
	private String maxCard;//二维码
	private Integer gender;//性别
	private String area;//地区
	private Date createTime;//创建时间
	private String personSignature;//个性签名
	private String flag;//功能字段，用来判断关注
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMaxCard() {
		return maxCard;
	}
	public void setMaxCard(String maxCard) {
		this.maxCard = maxCard;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getPersonSignature() {
		return personSignature;
	}
	public void setPersonSignature(String personSignature) {
		this.personSignature = personSignature;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

}

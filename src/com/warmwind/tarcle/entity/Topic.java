package com.warmwind.tarcle.entity;

import java.util.Date;
import java.util.List;

public class Topic {

	private Long id;
	private String content;//发表内容
	private String images;//评论图片
	private Date createTime;//发表时间
	private Account account;//发表账号
	private Circle circle;//所属圈子
	private CircleRole circleRole;//发表角色
	private Date updateTime;//更新时间
	private List<CircleRole> praiseRoles;//点赞角色
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public CircleRole getCircleRole() {
		return circleRole;
	}
	public void setCircleRole(CircleRole circleRole) {
		this.circleRole = circleRole;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public List<CircleRole> getPraiseRoles() {
		return praiseRoles;
	}
	public void setPraiseRoles(List<CircleRole> praiseRoles) {
		this.praiseRoles = praiseRoles;
	}
	
	
}

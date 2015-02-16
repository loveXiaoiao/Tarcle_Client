package com.warmwind.tarcle.entity;

import java.util.Date;

public class Comment {

	private Long id;
	private String content;//评论内容
	private String images;//评论图片
	private Date createTime;//发表时间
	private Topic topic;//所在说说
	private Account account;//评论人
	private Comment parentComment;//父评论
	private CircleRole circleRole;//角色
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
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Comment getParentComment() {
		return parentComment;
	}
	public void setParentComment(Comment parentComment) {
		this.parentComment = parentComment;
	}
	public CircleRole getCircleRole() {
		return circleRole;
	}
	public void setCircleRole(CircleRole circleRole) {
		this.circleRole = circleRole;
	}
	
}

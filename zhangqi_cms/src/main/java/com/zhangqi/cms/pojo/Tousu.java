package com.zhangqi.cms.pojo;

import java.io.Serializable;

public class Tousu implements Serializable{

	/**
	 * @Fields serialVersionUID : TODO(这个变量表示什么) 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer articleId;
	private Integer userId;
	private String content;
	private String created;
	public Tousu(Integer id, Integer articleId, Integer userId, String content, String created) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.content = content;
		this.created = created;
	}
	public Tousu() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "TouSu [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}

	
}

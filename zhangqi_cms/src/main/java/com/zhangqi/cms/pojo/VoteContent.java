package com.zhangqi.cms.pojo;

import java.io.Serializable;

public class VoteContent implements Serializable{
	/**
	 * @Fields serialVersionUID : TODO(这个变量表示什么)  
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String title;

    private String content;

    @Override
	public String toString() {
		return "VoteContent [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}

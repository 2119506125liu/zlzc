package com.zlzc.model;
public class Notice {
	private Integer id;//ID
	private String title;//标题
	private String fmImg;//封面图
	private String noticeContent;//公告内容
	private String fbTime;//发布时间
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title == null ? null : title.trim();
	}
	public String getFmImg(){
		return fmImg;
	}
	public void setFmImg(String fmImg){
		this.fmImg = fmImg == null ? null : fmImg.trim();
	}
	public String getNoticeContent(){
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent){
		this.noticeContent = noticeContent == null ? null : noticeContent.trim();
	}
	public String getFbTime(){
		return fbTime;
	}
	public void setFbTime(String fbTime){
		this.fbTime = fbTime == null ? null : fbTime.trim();
	}
}

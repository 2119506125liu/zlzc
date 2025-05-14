package com.zlzc.model;
public class Pbzj {
	private Integer id;//ID
	private String zjName;//专家名
	private String zjCel;//专家电话
	private String zjIntro;//专家介绍
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getZjName(){
		return zjName;
	}
	public void setZjName(String zjName){
		this.zjName = zjName == null ? null : zjName.trim();
	}
	public String getZjCel(){
		return zjCel;
	}
	public void setZjCel(String zjCel){
		this.zjCel = zjCel == null ? null : zjCel.trim();
	}
	public String getZjIntro(){
		return zjIntro;
	}
	public void setZjIntro(String zjIntro){
		this.zjIntro = zjIntro == null ? null : zjIntro.trim();
	}
}

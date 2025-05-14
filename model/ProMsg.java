package com.zlzc.model;
public class ProMsg {
	private Integer id;//ID
	private String proName;//商品名
	private String proImg;//商品图
	private String proIntro;//商品介绍
	private Integer stockNum;//库存量
	private Integer gys;//供应商
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getProName(){
		return proName;
	}
	public void setProName(String proName){
		this.proName = proName == null ? null : proName.trim();
	}
	public String getProImg(){
		return proImg;
	}
	public void setProImg(String proImg){
		this.proImg = proImg == null ? null : proImg.trim();
	}
	public String getProIntro(){
		return proIntro;
	}
	public void setProIntro(String proIntro){
		this.proIntro = proIntro == null ? null : proIntro.trim();
	}
	public Integer getStockNum(){
		return stockNum;
	}
	public void setStockNum(Integer stockNum){
		this.stockNum = stockNum;
	}
	public Integer getGys(){
		return gys;
	}
	public void setGys(Integer gys){
		this.gys = gys;
	}
}

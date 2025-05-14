package com.zlzc.model;
public class YcWarning {
	private Integer id;//ID
	private String ycIntro;//异常说明
	private Integer ycType;//异常类型
	private String ycImg;//异常附图
	private String zrr;//责任人
	private String zrrCel;//责任人电话
	private String dw;//所属单位
	private String depart;//所属部门
	private String ycfxTime;//异常发现时间
	private Integer dealStatus;//处理状态
	private String dealIntro;//处理说明
	private String dealFile;//处理文件
	private String dealTime;//处理时间
	private Integer jwBook;//纪委书记
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getYcIntro(){
		return ycIntro;
	}
	public void setYcIntro(String ycIntro){
		this.ycIntro = ycIntro == null ? null : ycIntro.trim();
	}
	public Integer getYcType(){
		return ycType;
	}
	public void setYcType(Integer ycType){
		this.ycType = ycType;
	}
	public String getYcImg(){
		return ycImg;
	}
	public void setYcImg(String ycImg){
		this.ycImg = ycImg == null ? null : ycImg.trim();
	}
	public String getZrr(){
		return zrr;
	}
	public void setZrr(String zrr){
		this.zrr = zrr == null ? null : zrr.trim();
	}
	public String getZrrCel(){
		return zrrCel;
	}
	public void setZrrCel(String zrrCel){
		this.zrrCel = zrrCel == null ? null : zrrCel.trim();
	}
	public String getDw(){
		return dw;
	}
	public void setDw(String dw){
		this.dw = dw == null ? null : dw.trim();
	}
	public String getDepart(){
		return depart;
	}
	public void setDepart(String depart){
		this.depart = depart == null ? null : depart.trim();
	}
	public String getYcfxTime(){
		return ycfxTime;
	}
	public void setYcfxTime(String ycfxTime){
		this.ycfxTime = ycfxTime == null ? null : ycfxTime.trim();
	}
	public Integer getDealStatus(){
		return dealStatus;
	}
	public void setDealStatus(Integer dealStatus){
		this.dealStatus = dealStatus;
	}
	public String getDealIntro(){
		return dealIntro;
	}
	public void setDealIntro(String dealIntro){
		this.dealIntro = dealIntro == null ? null : dealIntro.trim();
	}
	public String getDealFile(){
		return dealFile;
	}
	public void setDealFile(String dealFile){
		this.dealFile = dealFile == null ? null : dealFile.trim();
	}
	public String getDealTime(){
		return dealTime;
	}
	public void setDealTime(String dealTime){
		this.dealTime = dealTime == null ? null : dealTime.trim();
	}
	public Integer getJwBook(){
		return jwBook;
	}
	public void setJwBook(Integer jwBook){
		this.jwBook = jwBook;
	}
}

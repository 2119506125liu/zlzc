package com.zlzc.model;
public class CgMsg {
	private Integer id;//ID
	private String cpName;//产品名
	private Double cgPrice;//采购价格
	private Integer cgNum;//采购数量
	private Double totalAmount;//总金额
	private String cgs;//采购商
	private String cgIntro;//采购说明
	private String appFile;//申请文件
	private String appDate;//申请日期
	private Integer cgStatus;//采购状态
	private String checkRemark;//审核备注
	private String wcIntro;//完成说明
	private String lxr;//联系人
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getCpName(){
		return cpName;
	}
	public void setCpName(String cpName){
		this.cpName = cpName == null ? null : cpName.trim();
	}
	public Double getCgPrice(){
		return cgPrice;
	}
	public void setCgPrice(Double cgPrice){
		this.cgPrice = cgPrice;
	}
	public Integer getCgNum(){
		return cgNum;
	}
	public void setCgNum(Integer cgNum){
		this.cgNum = cgNum;
	}
	public Double getTotalAmount(){
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount){
		this.totalAmount = totalAmount;
	}
	public String getCgs(){
		return cgs;
	}
	public void setCgs(String cgs){
		this.cgs = cgs == null ? null : cgs.trim();
	}
	public String getCgIntro(){
		return cgIntro;
	}
	public void setCgIntro(String cgIntro){
		this.cgIntro = cgIntro == null ? null : cgIntro.trim();
	}
	public String getAppFile(){
		return appFile;
	}
	public void setAppFile(String appFile){
		this.appFile = appFile == null ? null : appFile.trim();
	}
	public String getAppDate(){
		return appDate;
	}
	public void setAppDate(String appDate){
		this.appDate = appDate == null ? null : appDate.trim();
	}
	public Integer getCgStatus(){
		return cgStatus;
	}
	public void setCgStatus(Integer cgStatus){
		this.cgStatus = cgStatus;
	}
	public String getCheckRemark(){
		return checkRemark;
	}
	public void setCheckRemark(String checkRemark){
		this.checkRemark = checkRemark == null ? null : checkRemark.trim();
	}
	public String getWcIntro(){
		return wcIntro;
	}
	public void setWcIntro(String wcIntro){
		this.wcIntro = wcIntro == null ? null : wcIntro.trim();
	}
	public String getLxr(){
		return lxr;
	}
	public void setLxr(String lxr){
		this.lxr = lxr == null ? null : lxr.trim();
	}
}

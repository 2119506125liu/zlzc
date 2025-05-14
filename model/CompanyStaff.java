package com.zlzc.model;
public class CompanyStaff {
	private Integer id;//ID
	private String staffName;//员工名
	private String companyName;//企业名
	private String celphone;//联系电话
	private String createDate;//创建日期
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getStaffName(){
		return staffName;
	}
	public void setStaffName(String staffName){
		this.staffName = staffName == null ? null : staffName.trim();
	}
	public String getCompanyName(){
		return companyName;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName == null ? null : companyName.trim();
	}
	public String getCelphone(){
		return celphone;
	}
	public void setCelphone(String celphone){
		this.celphone = celphone == null ? null : celphone.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
}

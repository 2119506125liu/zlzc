package com.zlzc.model;
public class GysMsg {
	private Integer id;//ID
	private String gysName;//供应商名
	private String gysCel;//供应商电话
	private String gysAddress;//供应商地址
	private String remark;//备注
	private String createTime;//创建时间
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getGysName(){
		return gysName;
	}
	public void setGysName(String gysName){
		this.gysName = gysName == null ? null : gysName.trim();
	}
	public String getGysCel(){
		return gysCel;
	}
	public void setGysCel(String gysCel){
		this.gysCel = gysCel == null ? null : gysCel.trim();
	}
	public String getGysAddress(){
		return gysAddress;
	}
	public void setGysAddress(String gysAddress){
		this.gysAddress = gysAddress == null ? null : gysAddress.trim();
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime == null ? null : createTime.trim();
	}
}

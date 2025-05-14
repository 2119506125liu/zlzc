package com.zlzc.model;
public class ZbMsg {
	private Integer id;//ID
	private Integer cgid;//采购ID
	private String zbs;//中标商
	private String lxfs;//联系方式
	private String zbFile;//中标文件
	private Integer pbzj;//评标专家
	private String zbTime;//中标时间
	private String lxr;//联系人
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getCgid(){
		return cgid;
	}
	public void setCgid(Integer cgid){
		this.cgid = cgid;
	}
	public String getZbs(){
		return zbs;
	}
	public void setZbs(String zbs){
		this.zbs = zbs == null ? null : zbs.trim();
	}
	public String getLxfs(){
		return lxfs;
	}
	public void setLxfs(String lxfs){
		this.lxfs = lxfs == null ? null : lxfs.trim();
	}
	public String getZbFile(){
		return zbFile;
	}
	public void setZbFile(String zbFile){
		this.zbFile = zbFile == null ? null : zbFile.trim();
	}
	public Integer getPbzj(){
		return pbzj;
	}
	public void setPbzj(Integer pbzj){
		this.pbzj = pbzj;
	}
	public String getZbTime(){
		return zbTime;
	}
	public void setZbTime(String zbTime){
		this.zbTime = zbTime == null ? null : zbTime.trim();
	}
	public String getLxr(){
		return lxr;
	}
	public void setLxr(String lxr){
		this.lxr = lxr == null ? null : lxr.trim();
	}
}

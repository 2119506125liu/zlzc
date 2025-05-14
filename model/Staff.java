package com.zlzc.model;
public class Staff {
	private Integer id;//ID
	private String gh;//工号
	private String password;//密码
	private String name;//姓名
	private String celphone;//联系电话
	private String email;//邮箱
	private Integer sex;//性别
	private String city;//籍贯
	private String jtzz;//家庭住址
	private String depart;//所属部门
	private String jtIntro;//家庭介绍
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getGh(){
		return gh;
	}
	public void setGh(String gh){
		this.gh = gh == null ? null : gh.trim();
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password == null ? null : password.trim();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public String getCelphone(){
		return celphone;
	}
	public void setCelphone(String celphone){
		this.celphone = celphone == null ? null : celphone.trim();
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email == null ? null : email.trim();
	}
	public Integer getSex(){
		return sex;
	}
	public void setSex(Integer sex){
		this.sex = sex;
	}
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city = city == null ? null : city.trim();
	}
	public String getJtzz(){
		return jtzz;
	}
	public void setJtzz(String jtzz){
		this.jtzz = jtzz == null ? null : jtzz.trim();
	}
	public String getDepart(){
		return depart;
	}
	public void setDepart(String depart){
		this.depart = depart == null ? null : depart.trim();
	}
	public String getJtIntro(){
		return jtIntro;
	}
	public void setJtIntro(String jtIntro){
		this.jtIntro = jtIntro == null ? null : jtIntro.trim();
	}
}

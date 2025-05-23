package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface StaffService{
	/**
	分页查询员工数据总数
	*/
	public Map<String,Integer> getDataListCount(Staff queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询员工数据列表
	*/
	public Map<String,Object> getDataList(Staff queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装员工为前台展示的数据形式
	*/
	public Map<String,Object> getStaffModel(Staff model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Staff model,LoginModel login);
	/**
	修改
	*/
	public String update(Staff model,LoginModel login);
	/**
	修改
	*/
	public String update1(Staff model,LoginModel login);
}

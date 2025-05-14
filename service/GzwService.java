package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface GzwService{
	/**
	分页查询国资委数据总数
	*/
	public Map<String,Integer> getDataListCount(Gzw queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询国资委数据列表
	*/
	public Map<String,Object> getDataList(Gzw queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装国资委为前台展示的数据形式
	*/
	public Map<String,Object> getGzwModel(Gzw model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Gzw model,LoginModel login);
	/**
	修改
	*/
	public String update(Gzw model,LoginModel login);
	/**
	修改
	*/
	public String update1(Gzw model,LoginModel login);
}

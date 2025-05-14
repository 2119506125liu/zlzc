package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface JwBookService{
	/**
	分页查询纪委书记数据总数
	*/
	public Map<String,Integer> getDataListCount(JwBook queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询纪委书记数据列表
	*/
	public Map<String,Object> getDataList(JwBook queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装纪委书记为前台展示的数据形式
	*/
	public Map<String,Object> getJwBookModel(JwBook model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(JwBook model,LoginModel login);
	/**
	修改
	*/
	public String update(JwBook model,LoginModel login);
	/**
	修改
	*/
	public String update1(JwBook model,LoginModel login);
}

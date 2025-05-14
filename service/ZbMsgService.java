package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ZbMsgService{
	/**
	分页查询中标信息数据总数
	*/
	public Map<String,Integer> getDataListCount(ZbMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询中标信息数据列表
	*/
	public Map<String,Object> getDataList(ZbMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装中标信息为前台展示的数据形式
	*/
	public Map<String,Object> getZbMsgModel(ZbMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(ZbMsg model,LoginModel login);
	/**
	新增
	*/
	public String add1(ZbMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(ZbMsg model,LoginModel login);
	/**
	修改
	*/
	public String update1(ZbMsg model,LoginModel login);
}

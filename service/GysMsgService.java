package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface GysMsgService{
	/**
	分页查询供应商信息数据总数
	*/
	public Map<String,Integer> getDataListCount(String createTime1,String createTime2,GysMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询供应商信息数据列表
	*/
	public Map<String,Object> getDataList(String createTime1,String createTime2,GysMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装供应商信息为前台展示的数据形式
	*/
	public Map<String,Object> getGysMsgModel(GysMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(GysMsg model,LoginModel login);
	/**
	新增
	*/
	public String add1(GysMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(GysMsg model,LoginModel login);
	/**
	修改
	*/
	public String update1(GysMsg model,LoginModel login);
}

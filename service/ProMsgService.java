package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ProMsgService{
	/**
	分页查询商品信息数据总数
	*/
	public Map<String,Integer> getDataListCount(ProMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询商品信息数据列表
	*/
	public Map<String,Object> getDataList(ProMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装商品信息为前台展示的数据形式
	*/
	public Map<String,Object> getProMsgModel(ProMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(ProMsg model,LoginModel login);
	/**
	新增
	*/
	public String add1(ProMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(ProMsg model,LoginModel login);
	/**
	修改
	*/
	public String update1(ProMsg model,LoginModel login);
}

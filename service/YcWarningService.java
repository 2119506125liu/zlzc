package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface YcWarningService{
	/**
	分页查询异常预警数据总数
	*/
	public Map<String,Integer> getDataListCount(YcWarning queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询异常预警数据列表
	*/
	public Map<String,Object> getDataList(YcWarning queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装异常预警为前台展示的数据形式
	*/
	public Map<String,Object> getYcWarningModel(YcWarning model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(YcWarning model,LoginModel login);
	/**
	修改
	*/
	public String update(YcWarning model,LoginModel login);
	/**
	确认预警
	*/
	public String qryj(YcWarning model,LoginModel login);
	/**
	取消预警
	*/
	public String qxyj(YcWarning model,LoginModel login);
	/**
	修改
	*/
	public String update1(YcWarning model,LoginModel login);
}

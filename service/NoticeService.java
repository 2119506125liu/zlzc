package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface NoticeService{
	/**
	分页查询公告数据总数
	*/
	public Map<String,Integer> getDataListCount(String fbTime1,String fbTime2,Notice queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询公告数据列表
	*/
	public Map<String,Object> getDataList(String fbTime1,String fbTime2,Notice queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装公告为前台展示的数据形式
	*/
	public Map<String,Object> getNoticeModel(Notice model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Notice model,LoginModel login);
	/**
	修改
	*/
	public String update(Notice model,LoginModel login);
}

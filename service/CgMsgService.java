package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface CgMsgService{
	/**
	分页查询采购信息数据总数
	*/
	public Map<String,Integer> getDataListCount(CgMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询采购信息数据列表
	*/
	public Map<String,Object> getDataList(CgMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装采购信息为前台展示的数据形式
	*/
	public Map<String,Object> getCgMsgModel(CgMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(CgMsg model,LoginModel login);
	/**
	审核通过
	*/
	public String shtg(CgMsg model,LoginModel login);
	/**
	审核不通过
	*/
	public String shbtg(CgMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(CgMsg model,LoginModel login);
	/**
	完成采购
	*/
	public String wccg(CgMsg model,LoginModel login);
}

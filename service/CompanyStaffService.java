package com.zlzc.service;
import java.util.Map;
import com.zlzc.controller.LoginModel;
import com.zlzc.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface CompanyStaffService{
	/**
	分页查询企业员工数据总数
	*/
	public Map<String,Integer> getDataListCount(CompanyStaff queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询企业员工数据列表
	*/
	public Map<String,Object> getDataList(CompanyStaff queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装企业员工为前台展示的数据形式
	*/
	public Map<String,Object> getCompanyStaffModel(CompanyStaff model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(CompanyStaff model,LoginModel login);
	/**
	新增
	*/
	public String add1(CompanyStaff model,LoginModel login);
	/**
	修改
	*/
	public String update(CompanyStaff model,LoginModel login);
	/**
	修改
	*/
	public String update1(CompanyStaff model,LoginModel login);
	/**
	**导入企业员工数据，根据传入的excel，得到传入数据，然后做值的校验并导入系统
	*/
	public String importCompany(InputStream is,String fileName,LoginModel login,CompanyStaff pageModel);
	/**
	**导入企业员工数据，根据传入的excel，得到传入数据，然后做值的校验并导入系统
	*/
	public String importCompany1(InputStream is,String fileName,LoginModel login,CompanyStaff pageModel);
	/**
	导出企业员工数据
	*/
	public void exportCompany(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login);
	/**
	导出企业员工数据
	*/
	public void exportCompany1(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login);
}

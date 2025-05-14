package com.zlzc.controller.staff;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;
import com.zlzc.dao.*;
import com.zlzc.model.*;
import com.zlzc.service.impl.*;
import com.zlzc.util.*;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import com.zlzc.controller.LoginModel;
import com.zlzc.service.*;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/staff/company_staff")
public class SCompanyStaffController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	@Autowired
	CompanyStaffService companyStaffService;
	@Autowired
	CompanyStaffMapper companyStaffMapper;
	@Autowired
	StaffMapper staffMapper;
	/**
	* 根据查询条件分页查询企业员工数据总数
	*/
	@RequestMapping(value="queryCount")
	@ResponseBody
	public Object queryCount(CompanyStaff model,Integer page,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return companyStaffService.getDataListCount(model,CommonVal.pageSize,login);//分页查询数据总数
	}
	@RequestMapping(value = "queryDataDetail")
	@ResponseBody
	public Object queryDataDetail(Integer id, HttpServletRequest request) {
		CompanyStaff companyStaff = companyStaffMapper.selectByPrimaryKey(id);
		return companyStaff;
	}
	/**
	* 查询页面所需要的数据
	*/
	@RequestMapping(value="getInitData")
	@ResponseBody
	public Object getInitData(String loginToken,HttpServletRequest request){
		Map<String,Object> rs = new HashMap<String,Object>();
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		Staff staff = staffMapper.selectByPrimaryKey(login.getId());
		rs.put("user",staff);
		return rs;
	}
	/**
	* 根据查询条件分页查询企业员工数据，然后返回给前台渲染
	*/
	@RequestMapping(value="queryList")
	@ResponseBody
	public Object toList(CompanyStaff model,Integer page,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return companyStaffService.getDataList(model,page,CommonVal.pageSize,login);//分页查询数据
	}
	/**
	新增提交信息接口
	*/
	@RequestMapping("add1_submit")
	@ResponseBody
	public Object add1_submit(CompanyStaff model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = companyStaffService.add1(model,login);//执行添加操作
		if(msg.equals("")==false){
			rs.put("code",0);
			rs.put("msg",msg);
			return rs;
		}
		rs.put("code",1);
		rs.put("msg","新增成功");
		return rs;
	}
	/**
	修改提交信息接口
	*/
	@RequestMapping("update1_submit")
	@ResponseBody
	public Object update1_submit(CompanyStaff model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = companyStaffService.update1(model,login);//执行修改操作
		if(msg.equals("")==false){
			rs.put("code",0);
			rs.put("msg",msg);
			return rs;
		}
		rs.put("code",1);
		rs.put("msg","修改成功");
		return rs;
	}
	/**
	删除企业员工接口
	*/
	@RequestMapping("del1")
	@ResponseBody
	public Object del1(Integer id,ModelMap modelMap,HttpServletRequest request) {
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		companyStaffService.delete(id);
		rs.put("code",1);
		rs.put("msg","删除成功");
		return rs;
	}
	/**
	* 根据查询条件导出企业员工数据,生成excel
	*/
	@RequestMapping(value="export_company1")
	public void export_company1(CompanyStaff model,Integer page,HttpServletRequest request,HttpServletResponse response,ModelMap modelMap){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> data =  companyStaffService.getDataList(model,page,CommonVal.pageSize,login);//获取数据列表，不分页
		companyStaffService.exportCompany1( request,  response,data, login);
	}
	/**
	* 生成批量导入导入excel模板
	*/
	@RequestMapping(value="import_company1_model")
	public void import_company1_model(HttpServletResponse response,HttpServletRequest request){
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();// 空数据模板
		PoiExcelExport pee = new PoiExcelExport(response, "批量导入模板", "sheet1");
	String[] headers = {"员工名（必填）","企业名（必填）","联系电话（必填）"};
	String[] columns = {"staffName","companyName","celphone"};
	int[] titleSize = {20,20,20};
		try {
			pee.wirteExcel(columns, headers, titleSize, new ArrayList<Map<String,Object>>());//生成excel
			response.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	* 批量导入数据的接口，解析上传的excel中的数据，将数据批量插入到数据库中
	**/
	@RequestMapping(value = "import_company1", method = RequestMethod.POST)
	@ResponseBody
	public Object importCompany1(@RequestParam MultipartFile file,ModelMap modelMap,HttpServletRequest request,
	CompanyStaff model, HttpServletResponse response)throws IOException {
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String, Object> rs = new HashMap<String, Object>();
		String data = companyStaffService.importCompany1(file.getInputStream(),file.getOriginalFilename(), login,model);// 导入数据
		if (!data.equals("")) {
			rs.put("code", 0);
			rs.put("msg", data);
			return rs;
		} else {
			rs.put("code", 1);
			rs.put("msg", "批量导入成功");
			return rs;
		}
	}
}

package com.zlzc.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zlzc.dao.*;
import com.zlzc.model.*;
import com.zlzc.service.*;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import com.zlzc.util.*;
import org.springframework.ui.ModelMap;
import java.util.*;
import com.zlzc.service.*;
import com.zlzc.controller.LoginModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.io.IOException;
@Service
public class CompanyStaffServiceImpl implements CompanyStaffService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	CompanyStaffMapper companyStaffMapper;
	/**
	新增
	*/
	@Override
	public String add(CompanyStaff model,LoginModel login){
		if(model.getStaffName()==null||model.getStaffName().equals("")){
			return "员工名为必填属性";
		}
		if(model.getCompanyName()==null||model.getCompanyName().equals("")){
			return "企业名为必填属性";
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		companyStaffMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(CompanyStaff model,LoginModel login){
		if(model.getStaffName()==null||model.getStaffName().equals("")){
			return "员工名为必填属性";
		}
		if(model.getCompanyName()==null||model.getCompanyName().equals("")){
			return "企业名为必填属性";
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		companyStaffMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(CompanyStaff model,LoginModel login){
		CompanyStaff preModel = companyStaffMapper.selectByPrimaryKey(model.getId());
		if(model.getStaffName()==null||model.getStaffName().equals("")){
			return "员工名为必填属性";
		}
		if(model.getCompanyName()==null||model.getCompanyName().equals("")){
			return "企业名为必填属性";
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		preModel.setStaffName(model.getStaffName());
		preModel.setCompanyName(model.getCompanyName());
		preModel.setCelphone(model.getCelphone());
		companyStaffMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(CompanyStaff model,LoginModel login){
		CompanyStaff preModel = companyStaffMapper.selectByPrimaryKey(model.getId());
		if(model.getStaffName()==null||model.getStaffName().equals("")){
			return "员工名为必填属性";
		}
		if(model.getCompanyName()==null||model.getCompanyName().equals("")){
			return "企业名为必填属性";
		}
		if(model.getCelphone()==null||model.getCelphone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelphone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelphone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		preModel.setStaffName(model.getStaffName());
		preModel.setCompanyName(model.getCompanyName());
		preModel.setCelphone(model.getCelphone());
		companyStaffMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询企业员工列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(CompanyStaff queryModel,Integer pageSize,LoginModel login) {
		CompanyStaffExample se = new CompanyStaffExample();
		CompanyStaffExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getStaffName()!=null&&queryModel.getStaffName().equals("")==false){
			sc.andStaffNameLike("%"+queryModel.getStaffName()+"%");//模糊查询
		}
		if(queryModel.getCompanyName()!=null&&queryModel.getCompanyName().equals("")==false){
			sc.andCompanyNameLike("%"+queryModel.getCompanyName()+"%");//模糊查询
		}
		int count = (int)companyStaffMapper.countByExample(se);
		int totalPage = 0;
		if ((count > 0) && ((count % pageSize) == 0)) {
			totalPage = count / pageSize;
		} else {
			totalPage = (count / pageSize) + 1;
		}
		Map<String,Integer> rs = new HashMap<String,Integer>();
		rs.put("count",count);//数据总数
		rs.put("totalPage",totalPage);//总页数
		return rs;
	}
	/**
	*根据参数查询企业员工列表数据
	*/
	@Override
	public Map<String,Object> getDataList(CompanyStaff queryModel,Integer page,Integer pageSize,LoginModel login) {
		CompanyStaffExample se = new CompanyStaffExample();
		CompanyStaffExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getStaffName()!=null&&queryModel.getStaffName().equals("")==false){
			sc.andStaffNameLike("%"+queryModel.getStaffName()+"%");//模糊查询
		}
		if(queryModel.getCompanyName()!=null&&queryModel.getCompanyName().equals("")==false){
			sc.andCompanyNameLike("%"+queryModel.getCompanyName()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<CompanyStaff> list = companyStaffMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(CompanyStaff model:list){
			list2.add(getCompanyStaffModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装企业员工为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getCompanyStaffModel(CompanyStaff model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("companyStaff",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		companyStaffMapper.deleteByPrimaryKey(id);
	}
	/**
	**导入企业员工数据，根据传入的excel，得到传入数据，然后做值的校验并导入系统
	*/
	@Override
	public String importCompany(InputStream is,String fileName,LoginModel login,CompanyStaff pageModel){
		String result="";
		ExcelUtil eu = new ExcelUtil();
		eu.setStartReadPos(1);//定位读取excel的第一行
		List<Map<Integer,Object>> list = eu.readExcelData(is, fileName);//读取excel数据到list中
		List<CompanyStaff> addList = new ArrayList<CompanyStaff>();
		for(int i=0;i<list.size();i++){
			Map<Integer,Object> m = list.get(i);
			CompanyStaff model = new CompanyStaff();
			//默认赋值
			model.setCreateDate(sdf2.format(new Date()));//当前日期格式
			Object val1 = m.get(1);//字段:员工名
			if(val1==null||val1.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，员工名不能为空";
			}
			if(val1!=null&&val1.toString().trim().equals("")==false){
				model.setStaffName(val1.toString().trim());
			}
			Object val2 = m.get(2);//字段:企业名
			if(val2==null||val2.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，企业名不能为空";
			}
			if(val2!=null&&val2.toString().trim().equals("")==false){
				model.setCompanyName(val2.toString().trim());
			}
			Object val3 = m.get(3);//字段:联系电话
			if(val3==null||val3.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，联系电话不能为空";
			}
			if(val3!=null&&val3.toString().trim().equals("")==false){
				model.setCelphone(val3.toString().trim());
			}
			addList.add(model);
		}
		for (int k=0;k<addList.size();k++) {
			CompanyStaff model = addList.get(k);
			if(model.getStaffName()==null||model.getStaffName().equals("")){
				return "excel中第"+(k+1)+"行中员工名列不能为空";
			}
			if(model.getCompanyName()==null||model.getCompanyName().equals("")){
				return "excel中第"+(k+1)+"行中企业名列不能为空";
			}
			if(model.getCelphone()==null||model.getCelphone().equals("")){
				return "excel中第"+(k+1)+"行中联系电话列不能为空";
			}
			if(model.getCelphone()!=null){
			Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
				Matcher m = p.matcher(model.getCelphone());
				if( m.matches()==false){
					return "excel中第"+(k+1)+"行中的联系电话该值不符合手机号匹配,请修改后重新上传";
				}
			}
		}
		for (int k=0;k<addList.size();k++) {
			companyStaffMapper.insertSelective(addList.get(k));
		}
		return "";
	}
	/**
	**导入企业员工数据，根据传入的excel，得到传入数据，然后做值的校验并导入系统
	*/
	@Override
	public String importCompany1(InputStream is,String fileName,LoginModel login,CompanyStaff pageModel){
		String result="";
		ExcelUtil eu = new ExcelUtil();
		eu.setStartReadPos(1);//定位读取excel的第一行
		List<Map<Integer,Object>> list = eu.readExcelData(is, fileName);//读取excel数据到list中
		List<CompanyStaff> addList = new ArrayList<CompanyStaff>();
		for(int i=0;i<list.size();i++){
			Map<Integer,Object> m = list.get(i);
			CompanyStaff model = new CompanyStaff();
			//默认赋值
			model.setCreateDate(sdf2.format(new Date()));//当前日期格式
			Object val1 = m.get(1);//字段:员工名
			if(val1==null||val1.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，员工名不能为空";
			}
			if(val1!=null&&val1.toString().trim().equals("")==false){
				model.setStaffName(val1.toString().trim());
			}
			Object val2 = m.get(2);//字段:企业名
			if(val2==null||val2.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，企业名不能为空";
			}
			if(val2!=null&&val2.toString().trim().equals("")==false){
				model.setCompanyName(val2.toString().trim());
			}
			Object val3 = m.get(3);//字段:联系电话
			if(val3==null||val3.toString().trim().equals("")){
				return "第"+(i+1)+"行数据中，联系电话不能为空";
			}
			if(val3!=null&&val3.toString().trim().equals("")==false){
				model.setCelphone(val3.toString().trim());
			}
			addList.add(model);
		}
		for (int k=0;k<addList.size();k++) {
			CompanyStaff model = addList.get(k);
			if(model.getStaffName()==null||model.getStaffName().equals("")){
				return "excel中第"+(k+1)+"行中员工名列不能为空";
			}
			if(model.getCompanyName()==null||model.getCompanyName().equals("")){
				return "excel中第"+(k+1)+"行中企业名列不能为空";
			}
			if(model.getCelphone()==null||model.getCelphone().equals("")){
				return "excel中第"+(k+1)+"行中联系电话列不能为空";
			}
			if(model.getCelphone()!=null){
			Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
				Matcher m = p.matcher(model.getCelphone());
				if( m.matches()==false){
					return "excel中第"+(k+1)+"行中的联系电话该值不符合手机号匹配,请修改后重新上传";
				}
			}
		}
		for (int k=0;k<addList.size();k++) {
			companyStaffMapper.insertSelective(addList.get(k));
		}
		return "";
	}
	@Override
	public void exportCompany(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login){
		List<Map<String,Object>> list2 = (List<Map<String,Object>>)data.get("list");//根据查询条件获取数据
		List<Map<String,Object>> list3 = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> map:list2){
			Map<String,Object> map2 = new HashMap<String,Object>();
			CompanyStaff companyStaff = (CompanyStaff)map.get("companyStaff");
			map2.put("staffName",companyStaff.getStaffName());//解释员工名
			map2.put("companyName",companyStaff.getCompanyName());//解释企业名
			map2.put("celphone",companyStaff.getCelphone());//解释联系电话
			map2.put("createDate",companyStaff.getCreateDate());//解释创建日期
			list3.add(map2);
		}
		PoiExcelExport pee = new PoiExcelExport(response,"企业员工导出报表"+sdf2.format(new Date()),"sheet1");
	String[] headers = {"员工名","企业名","联系电话","创建日期"};
	String[] columns = {"staffName","companyName","celphone","createDate"};
	int[] titleSize = {20,20,20,20};
		try {
			pee.wirteExcel(columns, headers, titleSize, list3);//根据数据列表生成excel文件
			response.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void exportCompany1(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login){
		List<Map<String,Object>> list2 = (List<Map<String,Object>>)data.get("list");//根据查询条件获取数据
		List<Map<String,Object>> list3 = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> map:list2){
			Map<String,Object> map2 = new HashMap<String,Object>();
			CompanyStaff companyStaff = (CompanyStaff)map.get("companyStaff");
			map2.put("staffName",companyStaff.getStaffName());//解释员工名
			map2.put("companyName",companyStaff.getCompanyName());//解释企业名
			map2.put("celphone",companyStaff.getCelphone());//解释联系电话
			map2.put("createDate",companyStaff.getCreateDate());//解释创建日期
			list3.add(map2);
		}
		PoiExcelExport pee = new PoiExcelExport(response,"企业员工导出报表"+sdf2.format(new Date()),"sheet1");
	String[] headers = {"员工名","企业名","联系电话","创建日期"};
	String[] columns = {"staffName","companyName","celphone","createDate"};
	int[] titleSize = {20,20,20,20};
		try {
			pee.wirteExcel(columns, headers, titleSize, list3);//根据数据列表生成excel文件
			response.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

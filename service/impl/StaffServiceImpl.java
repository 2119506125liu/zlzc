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
public class StaffServiceImpl implements StaffService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StaffMapper staffMapper;
	/**
	新增
	*/
	@Override
	public String add(Staff model,LoginModel login){
		if(model.getGh()==null||model.getGh().equals("")){
			return "工号为必填属性";
		}
		if(model.getGh()!=null){
			StaffExample te=new StaffExample();
			StaffExample.Criteria tc=te.createCriteria();
			tc.andGhEqualTo(model.getGh());
			int count = (int)staffMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 工号 ,请重新填写";
			}
		}
		if(model.getPassword()==null||model.getPassword().equals("")){
			return "密码为必填属性";
		}
		if(model.getName()==null||model.getName().equals("")){
			return "姓名为必填属性";
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
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getSex()==null){
			return "性别为必填属性";
		}
		if(model.getCity()==null||model.getCity().equals("")){
			return "籍贯为必填属性";
		}
		if(model.getJtzz()==null||model.getJtzz().equals("")){
			return "家庭住址为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getJtIntro()==null||model.getJtIntro().equals("")){
			return "家庭介绍为必填属性";
		}
		staffMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Staff model,LoginModel login){
		Staff preModel = staffMapper.selectByPrimaryKey(model.getId());
		if(model.getGh()==null||model.getGh().equals("")){
			return "工号为必填属性";
		}
		if(model.getGh()!=null){
			StaffExample te=new StaffExample();
			StaffExample.Criteria tc=te.createCriteria();
			tc.andGhEqualTo(model.getGh());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)staffMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 工号 ,请重新填写";
			}
		}
		if(model.getPassword()==null||model.getPassword().equals("")){
			return "密码为必填属性";
		}
		if(model.getName()==null||model.getName().equals("")){
			return "姓名为必填属性";
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
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getSex()==null){
			return "性别为必填属性";
		}
		if(model.getCity()==null||model.getCity().equals("")){
			return "籍贯为必填属性";
		}
		if(model.getJtzz()==null||model.getJtzz().equals("")){
			return "家庭住址为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getJtIntro()==null||model.getJtIntro().equals("")){
			return "家庭介绍为必填属性";
		}
		preModel.setGh(model.getGh());
		preModel.setPassword(model.getPassword());
		preModel.setName(model.getName());
		preModel.setCelphone(model.getCelphone());
		preModel.setEmail(model.getEmail());
		preModel.setSex(model.getSex());
		preModel.setCity(model.getCity());
		preModel.setJtzz(model.getJtzz());
		preModel.setDepart(model.getDepart());
		preModel.setJtIntro(model.getJtIntro());
		staffMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(Staff model,LoginModel login){
		Staff preModel = staffMapper.selectByPrimaryKey(model.getId());
		if(model.getName()==null||model.getName().equals("")){
			return "姓名为必填属性";
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
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getSex()==null){
			return "性别为必填属性";
		}
		if(model.getCity()==null||model.getCity().equals("")){
			return "籍贯为必填属性";
		}
		if(model.getJtzz()==null||model.getJtzz().equals("")){
			return "家庭住址为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getJtIntro()==null||model.getJtIntro().equals("")){
			return "家庭介绍为必填属性";
		}
		preModel.setName(model.getName());
		preModel.setCelphone(model.getCelphone());
		preModel.setEmail(model.getEmail());
		preModel.setSex(model.getSex());
		preModel.setCity(model.getCity());
		preModel.setJtzz(model.getJtzz());
		preModel.setDepart(model.getDepart());
		preModel.setJtIntro(model.getJtIntro());
		staffMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询员工列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(Staff queryModel,Integer pageSize,LoginModel login) {
		StaffExample se = new StaffExample();
		StaffExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getGh()!=null&&queryModel.getGh().equals("")==false){
			sc.andGhLike("%"+queryModel.getGh()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getSex()!=null){
			sc.andSexEqualTo(queryModel.getSex());//查询性别等于指定值
		}
		if(login.getLoginType()==4){
			sc.andIdEqualTo(login.getId());//查询权限限制
		}
		int count = (int)staffMapper.countByExample(se);
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
	*根据参数查询员工列表数据
	*/
	@Override
	public Map<String,Object> getDataList(Staff queryModel,Integer page,Integer pageSize,LoginModel login) {
		StaffExample se = new StaffExample();
		StaffExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getGh()!=null&&queryModel.getGh().equals("")==false){
			sc.andGhLike("%"+queryModel.getGh()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getSex()!=null){
			sc.andSexEqualTo(queryModel.getSex());//查询性别等于指定值
		}
		if(login.getLoginType()==4){
			sc.andIdEqualTo(login.getId());//查询权限限制
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Staff> list = staffMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Staff model:list){
			list2.add(getStaffModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装员工为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getStaffModel(Staff model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("staff",model);
		map.put("sexStr",DataListUtils.getSexNameById(model.getSex()+""));//解释性别字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		staffMapper.deleteByPrimaryKey(id);
	}
}

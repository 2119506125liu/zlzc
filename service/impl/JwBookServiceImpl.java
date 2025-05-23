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
public class JwBookServiceImpl implements JwBookService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	JwBookMapper jwBookMapper;
	/**
	新增
	*/
	@Override
	public String add(JwBook model,LoginModel login){
		if(model.getLoginName()==null||model.getLoginName().equals("")){
			return "登录名为必填属性";
		}
		if(model.getLoginName()!=null){
			JwBookExample te=new JwBookExample();
			JwBookExample.Criteria tc=te.createCriteria();
			tc.andLoginNameEqualTo(model.getLoginName());
			int count = (int)jwBookMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 登录名 ,请重新填写";
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
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		jwBookMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(JwBook model,LoginModel login){
		JwBook preModel = jwBookMapper.selectByPrimaryKey(model.getId());
		if(model.getLoginName()==null||model.getLoginName().equals("")){
			return "登录名为必填属性";
		}
		if(model.getLoginName()!=null){
			JwBookExample te=new JwBookExample();
			JwBookExample.Criteria tc=te.createCriteria();
			tc.andLoginNameEqualTo(model.getLoginName());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)jwBookMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 登录名 ,请重新填写";
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
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setLoginName(model.getLoginName());
		preModel.setPassword(model.getPassword());
		preModel.setName(model.getName());
		preModel.setCelphone(model.getCelphone());
		preModel.setRemark(model.getRemark());
		jwBookMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(JwBook model,LoginModel login){
		JwBook preModel = jwBookMapper.selectByPrimaryKey(model.getId());
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
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setName(model.getName());
		preModel.setCelphone(model.getCelphone());
		preModel.setRemark(model.getRemark());
		jwBookMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询纪委书记列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(JwBook queryModel,Integer pageSize,LoginModel login) {
		JwBookExample se = new JwBookExample();
		JwBookExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getLoginName()!=null&&queryModel.getLoginName().equals("")==false){
			sc.andLoginNameLike("%"+queryModel.getLoginName()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(login.getLoginType()==3){
			sc.andIdEqualTo(login.getId());//查询权限限制
		}
		int count = (int)jwBookMapper.countByExample(se);
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
	*根据参数查询纪委书记列表数据
	*/
	@Override
	public Map<String,Object> getDataList(JwBook queryModel,Integer page,Integer pageSize,LoginModel login) {
		JwBookExample se = new JwBookExample();
		JwBookExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getLoginName()!=null&&queryModel.getLoginName().equals("")==false){
			sc.andLoginNameLike("%"+queryModel.getLoginName()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(login.getLoginType()==3){
			sc.andIdEqualTo(login.getId());//查询权限限制
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<JwBook> list = jwBookMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(JwBook model:list){
			list2.add(getJwBookModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装纪委书记为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getJwBookModel(JwBook model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("jwBook",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		jwBookMapper.deleteByPrimaryKey(id);
	}
}

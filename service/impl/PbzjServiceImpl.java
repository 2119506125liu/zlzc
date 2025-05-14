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
public class PbzjServiceImpl implements PbzjService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	PbzjMapper pbzjMapper;
	/**
	新增
	*/
	@Override
	public String add(Pbzj model,LoginModel login){
		if(model.getZjName()==null||model.getZjName().equals("")){
			return "专家名为必填属性";
		}
		if(model.getZjCel()==null||model.getZjCel().equals("")){
			return "专家电话为必填属性";
		}
		if(model.getZjIntro()==null||model.getZjIntro().equals("")){
			return "专家介绍为必填属性";
		}
		pbzjMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(Pbzj model,LoginModel login){
		if(model.getZjName()==null||model.getZjName().equals("")){
			return "专家名为必填属性";
		}
		if(model.getZjCel()==null||model.getZjCel().equals("")){
			return "专家电话为必填属性";
		}
		if(model.getZjIntro()==null||model.getZjIntro().equals("")){
			return "专家介绍为必填属性";
		}
		pbzjMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Pbzj model,LoginModel login){
		Pbzj preModel = pbzjMapper.selectByPrimaryKey(model.getId());
		if(model.getZjName()==null||model.getZjName().equals("")){
			return "专家名为必填属性";
		}
		if(model.getZjCel()==null||model.getZjCel().equals("")){
			return "专家电话为必填属性";
		}
		if(model.getZjIntro()==null||model.getZjIntro().equals("")){
			return "专家介绍为必填属性";
		}
		preModel.setZjName(model.getZjName());
		preModel.setZjCel(model.getZjCel());
		preModel.setZjIntro(model.getZjIntro());
		pbzjMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(Pbzj model,LoginModel login){
		Pbzj preModel = pbzjMapper.selectByPrimaryKey(model.getId());
		if(model.getZjName()==null||model.getZjName().equals("")){
			return "专家名为必填属性";
		}
		if(model.getZjCel()==null||model.getZjCel().equals("")){
			return "专家电话为必填属性";
		}
		if(model.getZjIntro()==null||model.getZjIntro().equals("")){
			return "专家介绍为必填属性";
		}
		preModel.setZjName(model.getZjName());
		preModel.setZjCel(model.getZjCel());
		preModel.setZjIntro(model.getZjIntro());
		pbzjMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询评标专家列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(Pbzj queryModel,Integer pageSize,LoginModel login) {
		PbzjExample se = new PbzjExample();
		PbzjExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getZjName()!=null&&queryModel.getZjName().equals("")==false){
			sc.andZjNameLike("%"+queryModel.getZjName()+"%");//模糊查询
		}
		if(queryModel.getZjCel()!=null&&queryModel.getZjCel().equals("")==false){
			sc.andZjCelLike("%"+queryModel.getZjCel()+"%");//模糊查询
		}
		if(queryModel.getZjIntro()!=null&&queryModel.getZjIntro().equals("")==false){
			sc.andZjIntroLike("%"+queryModel.getZjIntro()+"%");//模糊查询
		}
		int count = (int)pbzjMapper.countByExample(se);
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
	*根据参数查询评标专家列表数据
	*/
	@Override
	public Map<String,Object> getDataList(Pbzj queryModel,Integer page,Integer pageSize,LoginModel login) {
		PbzjExample se = new PbzjExample();
		PbzjExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getZjName()!=null&&queryModel.getZjName().equals("")==false){
			sc.andZjNameLike("%"+queryModel.getZjName()+"%");//模糊查询
		}
		if(queryModel.getZjCel()!=null&&queryModel.getZjCel().equals("")==false){
			sc.andZjCelLike("%"+queryModel.getZjCel()+"%");//模糊查询
		}
		if(queryModel.getZjIntro()!=null&&queryModel.getZjIntro().equals("")==false){
			sc.andZjIntroLike("%"+queryModel.getZjIntro()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Pbzj> list = pbzjMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Pbzj model:list){
			list2.add(getPbzjModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装评标专家为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getPbzjModel(Pbzj model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pbzj",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		pbzjMapper.deleteByPrimaryKey(id);
	}
}

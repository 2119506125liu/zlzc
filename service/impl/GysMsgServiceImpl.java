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
public class GysMsgServiceImpl implements GysMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	GysMsgMapper gysMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(GysMsg model,LoginModel login){
		if(model.getGysName()==null||model.getGysName().equals("")){
			return "供应商名为必填属性";
		}
		if(model.getGysCel()==null||model.getGysCel().equals("")){
			return "供应商电话为必填属性";
		}
		if(model.getGysAddress()==null||model.getGysAddress().equals("")){
			return "供应商地址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		model.setCreateTime(sdf1.format(new Date()));//当前时间格式
		gysMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(GysMsg model,LoginModel login){
		if(model.getGysName()==null||model.getGysName().equals("")){
			return "供应商名为必填属性";
		}
		if(model.getGysCel()==null||model.getGysCel().equals("")){
			return "供应商电话为必填属性";
		}
		if(model.getGysAddress()==null||model.getGysAddress().equals("")){
			return "供应商地址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		model.setCreateTime(sdf1.format(new Date()));//当前时间格式
		gysMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(GysMsg model,LoginModel login){
		GysMsg preModel = gysMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getGysName()==null||model.getGysName().equals("")){
			return "供应商名为必填属性";
		}
		if(model.getGysCel()==null||model.getGysCel().equals("")){
			return "供应商电话为必填属性";
		}
		if(model.getGysAddress()==null||model.getGysAddress().equals("")){
			return "供应商地址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setGysName(model.getGysName());
		preModel.setGysCel(model.getGysCel());
		preModel.setGysAddress(model.getGysAddress());
		preModel.setRemark(model.getRemark());
		gysMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(GysMsg model,LoginModel login){
		GysMsg preModel = gysMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getGysName()==null||model.getGysName().equals("")){
			return "供应商名为必填属性";
		}
		if(model.getGysCel()==null||model.getGysCel().equals("")){
			return "供应商电话为必填属性";
		}
		if(model.getGysAddress()==null||model.getGysAddress().equals("")){
			return "供应商地址为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setGysName(model.getGysName());
		preModel.setGysCel(model.getGysCel());
		preModel.setGysAddress(model.getGysAddress());
		preModel.setRemark(model.getRemark());
		gysMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询供应商信息列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(String createTime1,String createTime2,GysMsg queryModel,Integer pageSize,LoginModel login) {
		GysMsgExample se = new GysMsgExample();
		GysMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getGysName()!=null&&queryModel.getGysName().equals("")==false){
			sc.andGysNameLike("%"+queryModel.getGysName()+"%");//模糊查询
		}
		if(createTime1!=null&&createTime1.equals("")==false){
			sc.andCreateTimeGreaterThanOrEqualTo(createTime1);
		}
		if(createTime2!=null&&createTime2.equals("")==false){
			sc.andCreateTimeLessThanOrEqualTo(createTime2);
		}
		int count = (int)gysMsgMapper.countByExample(se);
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
	*根据参数查询供应商信息列表数据
	*/
	@Override
	public Map<String,Object> getDataList(String createTime1,String createTime2,GysMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		GysMsgExample se = new GysMsgExample();
		GysMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getGysName()!=null&&queryModel.getGysName().equals("")==false){
			sc.andGysNameLike("%"+queryModel.getGysName()+"%");//模糊查询
		}
		if(createTime1!=null&&createTime1.equals("")==false){
			sc.andCreateTimeGreaterThanOrEqualTo(createTime1);
		}
		if(createTime2!=null&&createTime2.equals("")==false){
			sc.andCreateTimeLessThanOrEqualTo(createTime2);
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<GysMsg> list = gysMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(GysMsg model:list){
			list2.add(getGysMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装供应商信息为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getGysMsgModel(GysMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("gysMsg",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		gysMsgMapper.deleteByPrimaryKey(id);
	}
}

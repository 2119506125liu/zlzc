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
public class ProMsgServiceImpl implements ProMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	ProMsgMapper proMsgMapper;
	@Autowired
	GysMsgMapper gysMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(ProMsg model,LoginModel login){
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getProImg()==null||model.getProImg().equals("")){
			return "商品图为必填属性";
		}
		if(model.getProImg()!=null){
			String [] fileSplit = model.getProImg().split(";");
			if(fileSplit.length>1){
				return "商品图的图片数量不能大于1";
			}
		}
		if(model.getProIntro()==null||model.getProIntro().equals("")){
			return "商品介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getGys()==null){
			return "供应商为必填属性";
		}
		proMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(ProMsg model,LoginModel login){
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getProImg()==null||model.getProImg().equals("")){
			return "商品图为必填属性";
		}
		if(model.getProImg()!=null){
			String [] fileSplit = model.getProImg().split(";");
			if(fileSplit.length>1){
				return "商品图的图片数量不能大于1";
			}
		}
		if(model.getProIntro()==null||model.getProIntro().equals("")){
			return "商品介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getGys()==null){
			return "供应商为必填属性";
		}
		proMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(ProMsg model,LoginModel login){
		ProMsg preModel = proMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getProImg()==null||model.getProImg().equals("")){
			return "商品图为必填属性";
		}
		if(model.getProImg()!=null){
			String [] fileSplit = model.getProImg().split(";");
			if(fileSplit.length>1){
				return "商品图的图片数量不能大于1";
			}
		}
		if(model.getProIntro()==null||model.getProIntro().equals("")){
			return "商品介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getGys()==null){
			return "供应商为必填属性";
		}
		preModel.setProName(model.getProName());
		preModel.setProImg(model.getProImg());
		preModel.setProIntro(model.getProIntro());
		preModel.setStockNum(model.getStockNum());
		preModel.setGys(model.getGys());
		proMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(ProMsg model,LoginModel login){
		ProMsg preModel = proMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getProImg()==null||model.getProImg().equals("")){
			return "商品图为必填属性";
		}
		if(model.getProImg()!=null){
			String [] fileSplit = model.getProImg().split(";");
			if(fileSplit.length>1){
				return "商品图的图片数量不能大于1";
			}
		}
		if(model.getProIntro()==null||model.getProIntro().equals("")){
			return "商品介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getGys()==null){
			return "供应商为必填属性";
		}
		preModel.setProName(model.getProName());
		preModel.setProImg(model.getProImg());
		preModel.setProIntro(model.getProIntro());
		preModel.setStockNum(model.getStockNum());
		preModel.setGys(model.getGys());
		proMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询商品信息列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(ProMsg queryModel,Integer pageSize,LoginModel login) {
		ProMsgExample se = new ProMsgExample();
		ProMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		if(queryModel.getGys()!=null){
			sc.andGysEqualTo(queryModel.getGys());//查询供应商等于指定值
		}
		int count = (int)proMsgMapper.countByExample(se);
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
	*根据参数查询商品信息列表数据
	*/
	@Override
	public Map<String,Object> getDataList(ProMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		ProMsgExample se = new ProMsgExample();
		ProMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		if(queryModel.getGys()!=null){
			sc.andGysEqualTo(queryModel.getGys());//查询供应商等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<ProMsg> list = proMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(ProMsg model:list){
			list2.add(getProMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装商品信息为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getProMsgModel(ProMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("proMsg",model);
		List<String> proImgList = new ArrayList<String>();
		if(model.getProImg()!=null){
			String [] proImgSplit = model.getProImg().split(";");
			for(String tmpstr:proImgSplit ){
				if(tmpstr.equals("")==false){
					proImgList.add(tmpstr);
				}
			}
		}
		map.put("proImgList",proImgList);
		if(model.getGys()!=null){
			GysMsg gysMsg = gysMsgMapper.selectByPrimaryKey(model.getGys());//供应商为外接字段，需要关联供应商信息来解释该字段
			map.put("gysMsg",gysMsg);
			if(gysMsg!=null){
				map.put("gysStr",gysMsg.getGysName());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		proMsgMapper.deleteByPrimaryKey(id);
	}
}

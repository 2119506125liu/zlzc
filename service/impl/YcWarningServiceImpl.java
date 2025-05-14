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
public class YcWarningServiceImpl implements YcWarningService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	YcWarningMapper ycWarningMapper;
	@Autowired
	JwBookMapper jwBookMapper;
	/**
	新增
	*/
	@Override
	public String add(YcWarning model,LoginModel login){
		if(model.getYcIntro()==null||model.getYcIntro().equals("")){
			return "异常说明为必填属性";
		}
		if(model.getYcType()==null){
			return "异常类型为必填属性";
		}
		if(model.getYcImg()==null||model.getYcImg().equals("")){
			return "异常附图为必填属性";
		}
		if(model.getYcImg()!=null){
			String [] fileSplit = model.getYcImg().split(";");
			if(fileSplit.length>1){
				return "异常附图的图片数量不能大于1";
			}
		}
		if(model.getZrr()==null||model.getZrr().equals("")){
			return "责任人为必填属性";
		}
		if(model.getZrrCel()==null||model.getZrrCel().equals("")){
			return "责任人电话为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "所属单位为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getYcfxTime()==null||model.getYcfxTime().equals("")){
			return "异常发现时间为必填属性";
		}
		model.setYcType(1);//默认采购异常,
		model.setDealStatus(1);//默认未处理,
		model.setJwBook(login.getId());//登录id
		String nowTime = sdf1.format(new Date());
		ycWarningMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(YcWarning model,LoginModel login){
		YcWarning preModel = ycWarningMapper.selectByPrimaryKey(model.getId());
		if(model.getYcIntro()==null||model.getYcIntro().equals("")){
			return "异常说明为必填属性";
		}
		if(model.getYcImg()==null||model.getYcImg().equals("")){
			return "异常附图为必填属性";
		}
		if(model.getYcImg()!=null){
			String [] fileSplit = model.getYcImg().split(";");
			if(fileSplit.length>1){
				return "异常附图的图片数量不能大于1";
			}
		}
		if(model.getZrr()==null||model.getZrr().equals("")){
			return "责任人为必填属性";
		}
		if(model.getZrrCel()==null||model.getZrrCel().equals("")){
			return "责任人电话为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "所属单位为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getYcfxTime()==null||model.getYcfxTime().equals("")){
			return "异常发现时间为必填属性";
		}
		if(model.getDealIntro()==null||model.getDealIntro().equals("")){
			return "处理说明为必填属性";
		}
		if(model.getDealFile()==null||model.getDealFile().equals("")){
			return "处理文件为必填属性";
		}
		if(model.getDealFile()!=null){
			String [] fileSplit = model.getDealFile().split(";");
			if(fileSplit.length>1){
				return "处理文件的文件数量不能大于1";
			}
		}
		if(model.getDealTime()==null||model.getDealTime().equals("")){
			return "处理时间为必填属性";
		}
		if(model.getJwBook()==null){
			return "纪委书记为必填属性";
		}
		preModel.setYcIntro(model.getYcIntro());
		preModel.setYcImg(model.getYcImg());
		preModel.setZrr(model.getZrr());
		preModel.setZrrCel(model.getZrrCel());
		preModel.setDw(model.getDw());
		preModel.setDepart(model.getDepart());
		preModel.setYcfxTime(model.getYcfxTime());
		preModel.setDealIntro(model.getDealIntro());
		preModel.setDealFile(model.getDealFile());
		preModel.setDealTime(model.getDealTime());
		preModel.setJwBook(model.getJwBook());
		String nowTime = sdf1.format(new Date());
		ycWarningMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	确认预警
	*/
	@Override
	public String qryj(YcWarning model,LoginModel login){
		YcWarning preModel = ycWarningMapper.selectByPrimaryKey(model.getId());
		if(model.getDealIntro()==null||model.getDealIntro().equals("")){
			return "处理说明为必填属性";
		}
		if(model.getDealFile()==null||model.getDealFile().equals("")){
			return "处理文件为必填属性";
		}
		if(model.getDealFile()!=null){
			String [] fileSplit = model.getDealFile().split(";");
			if(fileSplit.length>1){
				return "处理文件的文件数量不能大于1";
			}
		}
		preModel.setDealStatus(2);//处理状态设置为已确认预警
		preModel.setDealIntro(model.getDealIntro());
		preModel.setDealFile(model.getDealFile());
		ycWarningMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	取消预警
	*/
	@Override
	public String qxyj(YcWarning model,LoginModel login){
		YcWarning preModel = ycWarningMapper.selectByPrimaryKey(model.getId());
		if(model.getDealIntro()==null||model.getDealIntro().equals("")){
			return "处理说明为必填属性";
		}
		if(model.getDealFile()==null||model.getDealFile().equals("")){
			return "处理文件为必填属性";
		}
		if(model.getDealFile()!=null){
			String [] fileSplit = model.getDealFile().split(";");
			if(fileSplit.length>1){
				return "处理文件的文件数量不能大于1";
			}
		}
		preModel.setDealStatus(3);//处理状态设置为已取消预警
		preModel.setDealIntro(model.getDealIntro());
		preModel.setDealFile(model.getDealFile());
		ycWarningMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(YcWarning model,LoginModel login){
		YcWarning preModel = ycWarningMapper.selectByPrimaryKey(model.getId());
		if(model.getYcIntro()==null||model.getYcIntro().equals("")){
			return "异常说明为必填属性";
		}
		if(model.getYcType()==null){
			return "异常类型为必填属性";
		}
		if(model.getYcImg()==null||model.getYcImg().equals("")){
			return "异常附图为必填属性";
		}
		if(model.getYcImg()!=null){
			String [] fileSplit = model.getYcImg().split(";");
			if(fileSplit.length>1){
				return "异常附图的图片数量不能大于1";
			}
		}
		if(model.getZrr()==null||model.getZrr().equals("")){
			return "责任人为必填属性";
		}
		if(model.getZrrCel()==null||model.getZrrCel().equals("")){
			return "责任人电话为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "所属单位为必填属性";
		}
		if(model.getDepart()==null||model.getDepart().equals("")){
			return "所属部门为必填属性";
		}
		if(model.getYcfxTime()==null||model.getYcfxTime().equals("")){
			return "异常发现时间为必填属性";
		}
		preModel.setYcIntro(model.getYcIntro());
		preModel.setYcType(model.getYcType());
		preModel.setYcImg(model.getYcImg());
		preModel.setZrr(model.getZrr());
		preModel.setZrrCel(model.getZrrCel());
		preModel.setDw(model.getDw());
		preModel.setDepart(model.getDepart());
		preModel.setYcfxTime(model.getYcfxTime());
		String nowTime = sdf1.format(new Date());
		ycWarningMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询异常预警列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(YcWarning queryModel,Integer pageSize,LoginModel login) {
		YcWarningExample se = new YcWarningExample();
		YcWarningExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getYcType()!=null){
			sc.andYcTypeEqualTo(queryModel.getYcType());//查询异常类型等于指定值
		}
		if(queryModel.getDealStatus()!=null){
			sc.andDealStatusEqualTo(queryModel.getDealStatus());//查询处理状态等于指定值
		}
		if(login.getLoginType()==3){
			sc.andJwBookEqualTo(login.getId());//查询权限限制
		}
		int count = (int)ycWarningMapper.countByExample(se);
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
	*根据参数查询异常预警列表数据
	*/
	@Override
	public Map<String,Object> getDataList(YcWarning queryModel,Integer page,Integer pageSize,LoginModel login) {
		YcWarningExample se = new YcWarningExample();
		YcWarningExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getYcType()!=null){
			sc.andYcTypeEqualTo(queryModel.getYcType());//查询异常类型等于指定值
		}
		if(queryModel.getDealStatus()!=null){
			sc.andDealStatusEqualTo(queryModel.getDealStatus());//查询处理状态等于指定值
		}
		if(login.getLoginType()==3){
			sc.andJwBookEqualTo(login.getId());//查询权限限制
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<YcWarning> list = ycWarningMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(YcWarning model:list){
			list2.add(getYcWarningModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装异常预警为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getYcWarningModel(YcWarning model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ycWarning",model);
		map.put("ycTypeStr",DataListUtils.getYcTypeNameById(model.getYcType()+""));//解释异常类型字段
		List<String> ycImgList = new ArrayList<String>();
		if(model.getYcImg()!=null){
			String [] ycImgSplit = model.getYcImg().split(";");
			for(String tmpstr:ycImgSplit ){
				if(tmpstr.equals("")==false){
					ycImgList.add(tmpstr);
				}
			}
		}
		map.put("ycImgList",ycImgList);
		map.put("dealStatusStr",DataListUtils.getDealStatusNameById(model.getDealStatus()+""));//解释处理状态字段
		List<Map<String,String>> dealFileList = new ArrayList<Map<String,String>>();
		if(model.getDealFile()!=null){
			String [] dealFileSplit = model.getDealFile().split(";");
			for(String tmpstr:dealFileSplit ){
				if(tmpstr.equals("")==false){
					Map<String,String> tmpMap = new HashMap<String,String>();
					String [] tmp = tmpstr.split("/");
					tmpMap.put("url",tmpstr);
					tmpMap.put("name", tmp[tmp.length-1]);
					dealFileList.add(tmpMap);
				}
			}
		}
		map.put("dealFileList",dealFileList);
		if(model.getJwBook()!=null){
			JwBook jwBook = jwBookMapper.selectByPrimaryKey(model.getJwBook());//纪委书记为外接字段，需要关联纪委书记来解释该字段
			map.put("jwBook",jwBook);
			if(jwBook!=null){
				map.put("jwBookStr",jwBook.getLoginName());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		ycWarningMapper.deleteByPrimaryKey(id);
	}
}

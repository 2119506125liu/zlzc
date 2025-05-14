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
public class CgMsgServiceImpl implements CgMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	CgMsgMapper cgMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(CgMsg model,LoginModel login){
		if(model.getCpName()==null||model.getCpName().equals("")){
			return "产品名为必填属性";
		}
		if(model.getCgPrice()==null){
			return "采购价格为必填属性";
		}
		if(model.getCgNum()==null){
			return "采购数量为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getCgs()==null||model.getCgs().equals("")){
			return "采购商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getCgIntro()==null||model.getCgIntro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getAppFile()==null||model.getAppFile().equals("")){
			return "申请文件为必填属性";
		}
		if(model.getAppFile()!=null){
			String [] fileSplit = model.getAppFile().split(";");
			if(fileSplit.length>1){
				return "申请文件的文件数量不能大于1";
			}
		}
		if(model.getWcIntro()==null||model.getWcIntro().equals("")){
			return "完成说明为必填属性";
		}
		model.setAppDate(sdf2.format(new Date()));//当前日期格式
		model.setCgStatus(1);//默认待审核,
		model.setTotalAmount(model.getCgPrice()*model.getCgNum());
		cgMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	审核通过
	*/
	@Override
	public String shtg(CgMsg model,LoginModel login){
		CgMsg preModel = cgMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCgStatus(2);//采购状态设置为审核通过
		preModel.setCheckRemark(model.getCheckRemark());
		cgMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	审核不通过
	*/
	@Override
	public String shbtg(CgMsg model,LoginModel login){
		CgMsg preModel = cgMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCgStatus(3);//采购状态设置为审核不通过
		preModel.setCheckRemark(model.getCheckRemark());
		cgMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(CgMsg model,LoginModel login){
		CgMsg preModel = cgMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getCpName()==null||model.getCpName().equals("")){
			return "产品名为必填属性";
		}
		if(model.getCgPrice()==null){
			return "采购价格为必填属性";
		}
		if(model.getCgNum()==null){
			return "采购数量为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getCgs()==null||model.getCgs().equals("")){
			return "采购商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getCgIntro()==null||model.getCgIntro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getAppFile()==null||model.getAppFile().equals("")){
			return "申请文件为必填属性";
		}
		if(model.getAppFile()!=null){
			String [] fileSplit = model.getAppFile().split(";");
			if(fileSplit.length>1){
				return "申请文件的文件数量不能大于1";
			}
		}
		if(model.getWcIntro()==null||model.getWcIntro().equals("")){
			return "完成说明为必填属性";
		}
		preModel.setCpName(model.getCpName());
		preModel.setCgPrice(model.getCgPrice());
		preModel.setCgNum(model.getCgNum());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setCgs(model.getCgs());
		preModel.setLxr(model.getLxr());
		preModel.setCgIntro(model.getCgIntro());
		preModel.setAppFile(model.getAppFile());
		preModel.setWcIntro(model.getWcIntro());
		preModel.setTotalAmount(preModel.getCgPrice()*preModel.getCgNum());
		cgMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	完成采购
	*/
	@Override
	public String wccg(CgMsg model,LoginModel login){
		CgMsg preModel = cgMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getWcIntro()==null||model.getWcIntro().equals("")){
			return "完成说明为必填属性";
		}
		preModel.setCgStatus(5);//采购状态设置为已完成采购
		preModel.setWcIntro(model.getWcIntro());
		cgMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询采购信息列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(CgMsg queryModel,Integer pageSize,LoginModel login) {
		CgMsgExample se = new CgMsgExample();
		CgMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getCpName()!=null&&queryModel.getCpName().equals("")==false){
			sc.andCpNameLike("%"+queryModel.getCpName()+"%");//模糊查询
		}
		if(queryModel.getCgStatus()!=null){
			sc.andCgStatusEqualTo(queryModel.getCgStatus());//查询采购状态等于指定值
		}
		int count = (int)cgMsgMapper.countByExample(se);
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
	*根据参数查询采购信息列表数据
	*/
	@Override
	public Map<String,Object> getDataList(CgMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		CgMsgExample se = new CgMsgExample();
		CgMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getCpName()!=null&&queryModel.getCpName().equals("")==false){
			sc.andCpNameLike("%"+queryModel.getCpName()+"%");//模糊查询
		}
		if(queryModel.getCgStatus()!=null){
			sc.andCgStatusEqualTo(queryModel.getCgStatus());//查询采购状态等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<CgMsg> list = cgMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(CgMsg model:list){
			list2.add(getCgMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装采购信息为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getCgMsgModel(CgMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cgMsg",model);
		List<Map<String,String>> appFileList = new ArrayList<Map<String,String>>();
		if(model.getAppFile()!=null){
			String [] appFileSplit = model.getAppFile().split(";");
			for(String tmpstr:appFileSplit ){
				if(tmpstr.equals("")==false){
					Map<String,String> tmpMap = new HashMap<String,String>();
					String [] tmp = tmpstr.split("/");
					tmpMap.put("url",tmpstr);
					tmpMap.put("name", tmp[tmp.length-1]);
					appFileList.add(tmpMap);
				}
			}
		}
		map.put("appFileList",appFileList);
		map.put("cgStatusStr",DataListUtils.getCgStatusNameById(model.getCgStatus()+""));//解释采购状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		cgMsgMapper.deleteByPrimaryKey(id);
	}
}

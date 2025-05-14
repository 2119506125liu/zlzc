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
public class ZbMsgServiceImpl implements ZbMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	CgMsgMapper cgMsgMapper;
	@Autowired
	PbzjMapper pbzjMapper;
	@Autowired
	ZbMsgMapper zbMsgMapper;
	@Autowired
	CompanyStaffMapper companyStaffMapper;
	@Autowired
	YcWarningMapper ycWarningMapper;
	/**
	新增
	*/
	@Override
	public String add(ZbMsg model,LoginModel login){
		CgMsg cgMsg = cgMsgMapper.selectByPrimaryKey(model.getCgid());
		if(model.getZbs()==null||model.getZbs().equals("")){
			return "中标商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getLxfs()==null||model.getLxfs().equals("")){
			return "联系方式为必填属性";
		}
		if(model.getZbFile()==null||model.getZbFile().equals("")){
			return "中标文件为必填属性";
		}
		if(model.getZbFile()!=null){
			String [] fileSplit = model.getZbFile().split(";");
			if(fileSplit.length>1){
				return "中标文件的文件数量不能大于1";
			}
		}
		if(model.getPbzj()==null){
			return "评标专家为必填属性";
		}
		if(model.getZbTime()==null||model.getZbTime().equals("")){
			return "中标时间为必填属性";
		}
		String nowTime = sdf1.format(new Date());
		zbMsgMapper.insertSelective(model);//插入数据
		
		CgMsg cg = cgMsgMapper.selectByPrimaryKey(model.getCgid());
		if(cg.getCgs().equals(model.getZbs())) {
			Pbzj pbzj = pbzjMapper.selectByPrimaryKey(model.getPbzj());
			YcWarning warning = new YcWarning();
			warning.setYcType(3);
			warning.setYcIntro(cg.getCpName()+"，该采购和中标信息都是“"+cg.getCgs()+"”");
			warning.setZrr(pbzj.getZjName());
			warning.setZrrCel(pbzj.getZjCel());
			warning.setDealStatus(1);
			warning.setYcfxTime(sdf1.format(new Date()));
			ycWarningMapper.insertSelective(warning);
		}
		Pbzj zj = pbzjMapper.selectByPrimaryKey(model.getPbzj());
		CompanyStaffExample ce = new CompanyStaffExample();
		List<CompanyStaff> cl = companyStaffMapper.selectByExample(ce);
		for(CompanyStaff c:cl) {
			if(zj.getZjName().equals(c.getStaffName())&&c.getCompanyName().equals(model.getZbs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(2);
				
				warning.setYcIntro("评标专家和中标单位员工名称同名，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
			
			if(model.getLxr().equals(c.getStaffName())&&c.getCompanyName().equals(cg.getCgs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(1);
				warning.setYcIntro("中标人名称和招标单位员工名称相同，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
		}
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(ZbMsg model,LoginModel login){
		CgMsg cgMsg = cgMsgMapper.selectByPrimaryKey(model.getCgid());
		if(model.getZbs()==null||model.getZbs().equals("")){
			return "中标商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getLxfs()==null||model.getLxfs().equals("")){
			return "联系方式为必填属性";
		}
		if(model.getZbFile()==null||model.getZbFile().equals("")){
			return "中标文件为必填属性";
		}
		if(model.getZbFile()!=null){
			String [] fileSplit = model.getZbFile().split(";");
			if(fileSplit.length>1){
				return "中标文件的文件数量不能大于1";
			}
		}
		if(model.getPbzj()==null){
			return "评标专家为必填属性";
		}
		if(model.getZbTime()==null||model.getZbTime().equals("")){
			return "中标时间为必填属性";
		}
		String nowTime = sdf1.format(new Date());
		zbMsgMapper.insertSelective(model);//插入数据
		
		CgMsg cg = cgMsgMapper.selectByPrimaryKey(model.getCgid());
		if(cg.getCgs().equals(model.getZbs())) {
			Pbzj pbzj = pbzjMapper.selectByPrimaryKey(model.getPbzj());
			YcWarning warning = new YcWarning();
			warning.setYcType(3);
			warning.setYcIntro(cg.getCpName()+"，该采购和中标信息都是“"+cg.getCgs()+"”");
			warning.setZrr(pbzj.getZjName());
			warning.setZrrCel(pbzj.getZjCel());
			warning.setDealStatus(1);
			warning.setYcfxTime(sdf1.format(new Date()));
			ycWarningMapper.insertSelective(warning);
		}
		Pbzj zj = pbzjMapper.selectByPrimaryKey(model.getPbzj());
		CompanyStaffExample ce = new CompanyStaffExample();
		List<CompanyStaff> cl = companyStaffMapper.selectByExample(ce);
		for(CompanyStaff c:cl) {
			if(zj.getZjName().equals(c.getStaffName())&&c.getCompanyName().equals(model.getZbs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(2);
				
				warning.setYcIntro("评标专家和中标单位员工名称同名，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
			
			if(model.getLxr().equals(c.getStaffName())&&c.getCompanyName().equals(cg.getCgs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(1);
				warning.setYcIntro("中标人名称和招标单位员工名称相同，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
		}
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(ZbMsg model,LoginModel login){
		ZbMsg preModel = zbMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getZbs()==null||model.getZbs().equals("")){
			return "中标商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getLxfs()==null||model.getLxfs().equals("")){
			return "联系方式为必填属性";
		}
		if(model.getZbFile()==null||model.getZbFile().equals("")){
			return "中标文件为必填属性";
		}
		if(model.getZbFile()!=null){
			String [] fileSplit = model.getZbFile().split(";");
			if(fileSplit.length>1){
				return "中标文件的文件数量不能大于1";
			}
		}
		if(model.getPbzj()==null){
			return "评标专家为必填属性";
		}
		if(model.getZbTime()==null||model.getZbTime().equals("")){
			return "中标时间为必填属性";
		}
		preModel.setZbs(model.getZbs());
		preModel.setLxr(model.getLxr());
		preModel.setLxfs(model.getLxfs());
		preModel.setZbFile(model.getZbFile());
		preModel.setPbzj(model.getPbzj());
		preModel.setZbTime(model.getZbTime());
		String nowTime = sdf1.format(new Date());
		zbMsgMapper.updateByPrimaryKey(preModel);//更新数据
		
		CgMsg cg = cgMsgMapper.selectByPrimaryKey(preModel.getCgid());
		if(cg.getCgs().equals(preModel.getZbs())) {
			Pbzj pbzj = pbzjMapper.selectByPrimaryKey(preModel.getPbzj());
			YcWarning warning = new YcWarning();
			warning.setYcType(3);
			warning.setYcIntro(cg.getCpName()+"，该采购和中标信息都是“"+cg.getCgs()+"”");
			warning.setZrr(pbzj.getZjName());
			warning.setZrrCel(pbzj.getZjCel());
			warning.setDealStatus(1);
			warning.setYcfxTime(sdf1.format(new Date()));
			ycWarningMapper.insertSelective(warning);
		}
		Pbzj zj = pbzjMapper.selectByPrimaryKey(preModel.getPbzj());
		CompanyStaffExample ce = new CompanyStaffExample();
		List<CompanyStaff> cl = companyStaffMapper.selectByExample(ce);
		for(CompanyStaff c:cl) {
			if(zj.getZjName().equals(c.getStaffName())&&c.getCompanyName().equals(preModel.getZbs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(2);
				
				warning.setYcIntro("评标专家和中标单位员工名称同名，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
			
			if(preModel.getLxr().equals(c.getStaffName())&&c.getCompanyName().equals(cg.getCgs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(1);
				warning.setYcIntro("中标人名称和招标单位员工名称相同，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
		}
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(ZbMsg model,LoginModel login){
		ZbMsg preModel = zbMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getZbs()==null||model.getZbs().equals("")){
			return "中标商为必填属性";
		}
		if(model.getLxr()==null||model.getLxr().equals("")){
			return "联系人为必填属性";
		}
		if(model.getLxfs()==null||model.getLxfs().equals("")){
			return "联系方式为必填属性";
		}
		if(model.getZbFile()==null||model.getZbFile().equals("")){
			return "中标文件为必填属性";
		}
		if(model.getZbFile()!=null){
			String [] fileSplit = model.getZbFile().split(";");
			if(fileSplit.length>1){
				return "中标文件的文件数量不能大于1";
			}
		}
		if(model.getPbzj()==null){
			return "评标专家为必填属性";
		}
		if(model.getZbTime()==null||model.getZbTime().equals("")){
			return "中标时间为必填属性";
		}
		preModel.setZbs(model.getZbs());
		preModel.setLxr(model.getLxr());
		preModel.setLxfs(model.getLxfs());
		preModel.setZbFile(model.getZbFile());
		preModel.setPbzj(model.getPbzj());
		preModel.setZbTime(model.getZbTime());
		String nowTime = sdf1.format(new Date());
		zbMsgMapper.updateByPrimaryKey(preModel);//更新数据
		
		
		CgMsg cg = cgMsgMapper.selectByPrimaryKey(preModel.getCgid());
		if(cg.getCgs().equals(preModel.getZbs())) {
			Pbzj pbzj = pbzjMapper.selectByPrimaryKey(preModel.getPbzj());
			YcWarning warning = new YcWarning();
			warning.setYcType(3);
			warning.setYcIntro(cg.getCpName()+"，该采购和中标信息都是“"+cg.getCgs()+"”");
			warning.setZrr(pbzj.getZjName());
			warning.setZrrCel(pbzj.getZjCel());
			warning.setDealStatus(1);
			warning.setYcfxTime(sdf1.format(new Date()));
			ycWarningMapper.insertSelective(warning);
		}
		Pbzj zj = pbzjMapper.selectByPrimaryKey(preModel.getPbzj());
		CompanyStaffExample ce = new CompanyStaffExample();
		List<CompanyStaff> cl = companyStaffMapper.selectByExample(ce);
		for(CompanyStaff c:cl) {
			if(zj.getZjName().equals(c.getStaffName())&&c.getCompanyName().equals(preModel.getZbs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(2);
				
				warning.setYcIntro("评标专家和中标单位员工名称同名，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
			
			if(preModel.getLxr().equals(c.getStaffName())&&c.getCompanyName().equals(cg.getCgs())) {
				YcWarning warning = new YcWarning();
				warning.setYcType(1);
				warning.setYcIntro("中标人名称和招标单位员工名称相同，采购："+cg.getCpName());
				warning.setZrr(zj.getZjName());
				warning.setZrrCel(zj.getZjCel());
				warning.setDealStatus(1);
				warning.setYcfxTime(sdf1.format(new Date()));
				ycWarningMapper.insertSelective(warning);
			}
			
		}
		return "";
	}
	/**
	*根据参数查询中标信息列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(ZbMsg queryModel,Integer pageSize,LoginModel login) {
		ZbMsgExample se = new ZbMsgExample();
		ZbMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getCgid()!=null){
			sc.andCgidEqualTo(queryModel.getCgid());
		}
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getPbzj()!=null){
			sc.andPbzjEqualTo(queryModel.getPbzj());//查询评标专家等于指定值
		}
		int count = (int)zbMsgMapper.countByExample(se);
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
	*根据参数查询中标信息列表数据
	*/
	@Override
	public Map<String,Object> getDataList(ZbMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		ZbMsgExample se = new ZbMsgExample();
		ZbMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getCgid()!=null){
			sc.andCgidEqualTo(queryModel.getCgid());
		}
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getPbzj()!=null){
			sc.andPbzjEqualTo(queryModel.getPbzj());//查询评标专家等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<ZbMsg> list = zbMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(ZbMsg model:list){
			list2.add(getZbMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装中标信息为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getZbMsgModel(ZbMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("zbMsg",model);
		if(model.getCgid()!=null){
			CgMsg cgMsg = cgMsgMapper.selectByPrimaryKey(model.getCgid());//采购ID为外接字段，需要关联采购信息来解释该字段
			map.put("cgMsg",cgMsg);
			if(cgMsg!=null){
				map.put("cgidStr",cgMsg.getCpName());
			}
		}
		List<Map<String,String>> zbFileList = new ArrayList<Map<String,String>>();
		if(model.getZbFile()!=null){
			String [] zbFileSplit = model.getZbFile().split(";");
			for(String tmpstr:zbFileSplit ){
				if(tmpstr.equals("")==false){
					Map<String,String> tmpMap = new HashMap<String,String>();
					String [] tmp = tmpstr.split("/");
					tmpMap.put("url",tmpstr);
					tmpMap.put("name", tmp[tmp.length-1]);
					zbFileList.add(tmpMap);
				}
			}
		}
		map.put("zbFileList",zbFileList);
		if(model.getPbzj()!=null){
			Pbzj pbzj = pbzjMapper.selectByPrimaryKey(model.getPbzj());//评标专家为外接字段，需要关联评标专家来解释该字段
			map.put("pbzj",pbzj);
			if(pbzj!=null){
				map.put("pbzjStr",pbzj.getZjName());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		zbMsgMapper.deleteByPrimaryKey(id);
	}
}

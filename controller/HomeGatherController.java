package com.zlzc.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;
import java.io.IOException;
import com.zlzc.dao.*;
import com.zlzc.model.*;
import com.zlzc.service.*;
import com.zlzc.controller.*;
import com.zlzc.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/home")
public class HomeGatherController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	DecimalFormat df = new DecimalFormat("#.00");
	@Autowired
	CgMsgMapper cgMsgMapper;
	@Autowired
	YcWarningMapper ycWarningMapper;
	@RequestMapping(value="getHomeMsg")
	@ResponseBody
	public Object getHomeMsg(HttpServletRequest request){
		Map<String,Object> rs = new HashMap<String,Object>();
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		if(login==null){
			rs.put("code",0);
			rs.put("msg","尚未登录");
			return rs;
		}
		String today = sdf2.format(new Date());
		//
		//查询待审核采购
		CgMsgExample de1 = new CgMsgExample();
		CgMsgExample.Criteria dc1 = de1.createCriteria();
		dc1.andCgStatusEqualTo(1);//待审核
		List<CgMsg> dl1 = cgMsgMapper.selectByExample(de1);
		rs.put("data1",dl1.size());
		//
		//查询采购中数
		CgMsgExample de2 = new CgMsgExample();
		CgMsgExample.Criteria dc2 = de2.createCriteria();
		dc2.andCgStatusEqualTo(4);//采购中
		List<CgMsg> dl2 = cgMsgMapper.selectByExample(de2);
		rs.put("data2",dl2.size());
		//
		//查询已完成的采购
		CgMsgExample de3 = new CgMsgExample();
		CgMsgExample.Criteria dc3 = de3.createCriteria();
		dc3.andCgStatusEqualTo(5);//已完成采购
		List<CgMsg> dl3 = cgMsgMapper.selectByExample(de3);
		rs.put("data3",dl3.size());
		//
		//查询采购统计
		CgMsgExample de4 = new CgMsgExample();
		CgMsgExample.Criteria dc4 = de4.createCriteria();
		dc4.andCgStatusEqualTo(5);//已完成采购
		List<CgMsg> dl4 = cgMsgMapper.selectByExample(de4);
		List<Map<String,Object>> dlist4 = new ArrayList<Map<String,Object>>();
		String startDate4 = CommonUtils.getDiffDate(today,-365,sdf2,3);//起始日期是365天前
		List<String> allDate4 = DateCommonUtils.getEchartTimeList(startDate4, today, "yyyy-MM-dd", "yyyy-MM", 2);//查询范围内的所有月份集合
		for(String date:allDate4){
			Integer  value  = 0;//采购数量
			for(CgMsg d:dl4){
				if(d.getAppDate()==null){
					continue;
				}
				if(d.getAppDate().contains(date)){
					if(d.getCgNum()!=null){
						value+=d.getCgNum();
					}else{
						continue;
					}
				}
			}
			Map<String,Object> map =  new HashMap<String,Object>();
			map.put("title",date);
			map.put("value",value);
			dlist4.add(map);
		}
		rs.put("data4",dlist4);
		//
		//查询异常统计
		YcWarningExample de5 = new YcWarningExample();
		List<YcWarning> dl5 = ycWarningMapper.selectByExample(de5);
		List<Map<String,Object>> dlist5 = DataListUtils.getYcTypeList();
		for(Map<String,Object> map:dlist5){
			Integer  value  = 0;
			for(YcWarning d:dl5){
				if(map.get("id").toString().equals(d.getYcType()+"")){
					value++;
				}
			}
			map.put("title",map.get("name").toString());
			map.put("value",value);
		}
		rs.put("data5",dlist5);
		rs.put("code",1);
		rs.put("msg","请求成功");
		return rs;
	}
}

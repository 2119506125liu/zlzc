package com.zlzc.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
*
数据列表解释器，键值对列举说明工具，例如性别字段：1表示男，2表示女
*
*/
public class DataListUtils {
	public static void main(String[] args) {
	}
	/**
	**获取登录角色列表
	*/
	public static List<Map<String,Object>> getLoginTypeList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","admin"));
		list.add(getMap("2","gzw"));
		list.add(getMap("3","jwsj"));
		list.add(getMap("4","staff"));
		return list;
	}
	/**
	**获取sex数据列表
	*/
	public static List<Map<String,Object>> getSexList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","男"));
		list.add(getMap("2","女"));
		return list;
	}
	public static String getSexNameById(String id){//根据sex的key值获取名称
		List<Map<String,Object>> list = getSexList();
		return getNameById(id,list);
	}
	/**
	**获取cg_status数据列表
	*/
	public static List<Map<String,Object>> getCgStatusList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","待审核"));
		list.add(getMap("2","审核通过"));
		list.add(getMap("3","审核不通过"));
		list.add(getMap("4","采购中"));
		list.add(getMap("5","已完成采购"));
		return list;
	}
	public static String getCgStatusNameById(String id){//根据cg_status的key值获取名称
		List<Map<String,Object>> list = getCgStatusList();
		return getNameById(id,list);
	}
	/**
	**获取yc_type数据列表
	*/
	public static List<Map<String,Object>> getYcTypeList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","采购异常"));
		list.add(getMap("2","招标异常"));
		list.add(getMap("3","合同异常"));
		list.add(getMap("4","合同支付异常"));
		return list;
	}
	public static String getYcTypeNameById(String id){//根据yc_type的key值获取名称
		List<Map<String,Object>> list = getYcTypeList();
		return getNameById(id,list);
	}
	/**
	**获取deal_status数据列表
	*/
	public static List<Map<String,Object>> getDealStatusList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","未处理"));
		list.add(getMap("2","已确认预警"));
		list.add(getMap("3","已取消预警"));
		return list;
	}
	public static String getDealStatusNameById(String id){//根据deal_status的key值获取名称
		List<Map<String,Object>> list = getDealStatusList();
		return getNameById(id,list);
	}
	public static String getNameById(String id,List<Map<String,Object>> list){
		if(id==null){
			return null;
		}
		if(id.endsWith(",")){
			id = id.substring(0,id.length()-1);
		}
		String[] idsplit = id.split(",");
		String rs = "";
		for(String tmp:idsplit){
			for(Map<String,Object> map:list){
				if(map.get("id").toString().equals(tmp)){
					rs+=map.get("name").toString()+",";
				}
			}
		}
		if(rs.endsWith(",")){
			rs = rs.substring(0,rs.length()-1);
		}
		return rs;
	}
	private static Map<String,Object> getMap(String id,String name){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		map.put("name", name);
		return map;
	}
}

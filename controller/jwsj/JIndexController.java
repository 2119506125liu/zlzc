package com.zlzc.controller.jwsj;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zlzc.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zlzc.controller.LoginModel;
import com.zlzc.util.CommonVal;
import  com.zlzc.model.*;
import com.zlzc.dao.*;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/jwsj/index")
public class JIndexController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	@Autowired
	JwBookMapper jwBookMapper;
	@RequestMapping(value="getInitData")
	@ResponseBody
	public Object getInitData(HttpServletRequest request){
		Map<String,Object> rs = new HashMap<String,Object>();
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		if(login==null){
			rs.put("code",0);
			rs.put("msg","尚未登录");
			return rs;
		}
		JwBook user = jwBookMapper.selectByPrimaryKey(login.getId());
		rs.put("user", user);
		return rs;
	}
}

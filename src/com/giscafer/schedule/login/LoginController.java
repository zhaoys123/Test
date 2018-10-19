package com.giscafer.schedule.login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;


@Controller
public class LoginController {

	private HttpServletRequest request;
	
	@RequestMapping("/login.do")
	@ResponseBody
	public String loginIndex(HttpServletRequest request, HttpServletResponse response){
			   HttpSession session = request.getSession();
					String username=getPara("username");
					String password=getPara("password");
					Record first = Db.findFirst("select * from  user where hospitalid=1 and username ='"+username+"' and password ='"+password+"'");
					Object object = first.get("hospitalid");
					Object object1 = first.get("hospitalname");
					session.setAttribute("hospitalid", object);
					session.setAttribute("hospitalname", object1);
				    String	min =  (object != null) ? "1" :"0";
					return min;
	}
	public String getPara(String name) {
		return request.getParameter(name);
	}
}

package com.giscafer.schedule.index;

import java.io.IOException;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;


/**
 * IndexController
 */
public class IndexController extends Controller {
	
	
	public void index() {
		render("login.html");
	}
	/** 
	 * @throws IOException
	 */
	@ActionKey("/toindex")
	public void toIndex() throws IOException{
		render("index.html");
		Object hospitalname = this.getSession().getAttribute("hospitalname");
		setAttr("hospitalname", hospitalname);
	}
	/**
	 * 登陆
	 */
	@ActionKey("/loginUser")
	public void loginUser()throws IOException{
		Object object=null;
		String username=getPara("username");
		String password=getPara("password");
		Record first = Db.findFirst("select * from  user where  username ='"+username+"' and password ='"+password+"'");
		if(first != null){
			 object = first.get("hospitalid");
			 Object object1 = first.get("hospitalname");
		     this.getSession().setAttribute("hospitalid", object);
		     this.getSession().setAttribute("hospitalname", object1);
		}
	    String	min =  (object != null) ? "1" :"0";
	    renderJson(min);
	}
}






package com.giscafer.schedule.nonework;

import java.io.IOException;


import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 * 
 * @ClassName: NoneWorkController  
 * @Description: TODO(统计考勤)  
 * @author giscafer 
 * @date 2015-11-1 下午5:11:11  
 *
 */
public class NoneworkController extends Controller{
	

	public void index() {
	}
	
	
/**
 * 跳转
 * @throws IOException
 */
@ActionKey("/getnone")
public void getnone(){
	System.out.println("1");
  }
}

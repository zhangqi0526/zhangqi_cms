package com.zhangqi.cms.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	/**
	 * @Title: login   
	 * @Description: 后台登录   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/")
	public String login() {
		return "admin/login";
	}
	/**
	 * @Title: home   
	 * @Description: 后台首页  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/home")
	public String home() {
		return "admin/home";
	}
	/**
	 * @Title: welcome   
	 * @Description: 后台欢迎页面   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/welcome")
	public String welcome() {
		return "admin/welcome";
	}
	/**
	 * @Title: user   
	 * @Description: 用户管理   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/user")
	public String user() {
		return "admin/user";
	}
	/**
	 * @Title: article   
	 * @Description: 文章管理  
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/article")
	public String article() {
		return "admin/article";
	}
	/**
	 * @Title: settings   
	 * @Description: 系统设置   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/settings")
	public String settings() {
		return "admin/settings";
	}
}

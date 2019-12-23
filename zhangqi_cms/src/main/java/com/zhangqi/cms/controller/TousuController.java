package com.zhangqi.cms.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhangqi.cms.common.CmsConstant;
import com.zhangqi.cms.common.JsonResult;
import com.zhangqi.cms.pojo.Tousu;
import com.zhangqi.cms.pojo.User;
import com.zhangqi.cms.service.TousuService;

@Controller
@RequestMapping("/tousu/")
public class TousuController {

	@Autowired
	private TousuService tousuService;
	
	/**
	 * 添加评论
	 * add
	 * @param comment
	 */
	@RequestMapping(value="add",method=RequestMethod.POST)
	public @ResponseBody JsonResult add(Tousu tousu,HttpSession session) {
		User userInfo =(User) session.getAttribute(CmsConstant.UserSessionKey);
		if(userInfo==null) {
			return JsonResult.fail(CmsConstant.unLoginErrorCode, "用户未登录");
		}
		tousu.setUserId(userInfo.getId());
		boolean result = tousuService.add(tousu);
		if(result) {
			return JsonResult.sucess();
		}
		return JsonResult.fail(10000, "未知错误");
		
		
	}
}

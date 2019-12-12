package com.zhangqi.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/article/")
public class ArticleController {

	/**
	 * @Title: add   
	 * @Description: 发布文章   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("add")
	public String add() {
		return "article/add";
	}
	/**
	 * @Title: update   
	 * @Description: 修改文章   
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("update")
	public String update() {
		return "update";
	}
}

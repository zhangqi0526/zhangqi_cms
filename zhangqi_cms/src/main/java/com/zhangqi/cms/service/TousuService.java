package com.zhangqi.cms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangqi.cms.dao.ArticleDao;
import com.zhangqi.cms.dao.TousuDao;
import com.zhangqi.cms.pojo.Tousu;
import com.zhangqi.common.utils.DateUtil;

@Service
public class TousuService {

	@Autowired
	private TousuDao tousuDao;
	@Autowired
	private ArticleService articleService;
	
	public boolean add(Tousu tousu) {
		String createdStr = DateUtil.dateTimeFormat.format(new Date());
		tousu.setCreated(createdStr);
		tousuDao.insert(tousu);
		articleService.addTousu(tousu.getArticleId());
		return true;
	}

	
}

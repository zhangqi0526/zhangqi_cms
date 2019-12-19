package com.zhangqi.cms.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangqi.cms.dao.ArticleDao;
import com.zhangqi.cms.dao.CategoryDao;
import com.zhangqi.cms.dao.ChannelDao;
import com.zhangqi.cms.pojo.Article;
import com.zhangqi.cms.pojo.Category;
import com.zhangqi.cms.pojo.Channel;
import com.zhangqi.cms.service.ArticleService;
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private ChannelDao channelDao;
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public PageInfo<Article> getPageInfo(Article article, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Article> articleList = articleDao.select(article);
		return new PageInfo<>(articleList);
	}

	@Override
	public boolean updateStatus(Integer id, int status) {
		return articleDao.updateStatus(id, status)>0;
	}

	@Override
	public boolean addHot(Integer id) {
		return articleDao.addHot(id)>0;
	}

	@Override
	public List<Channel> getChannelList() {
		return channelDao.select(null);
	}

	@Override
	public Article getById(Integer id) {
		return articleDao.selectById(id);
	}

	@Override
	public boolean save(Article article) {
		if(article.getId()==null) {
			article.setDeleted(0);
			article.setCreated(new Date());
			article.setUpdated(new Date());
			article.setCommentcnt(0);
			article.setHits(0);
			article.setHot(0);
			articleDao.insert(article);
		}else {
			article.setUpdated(new Date());
			articleDao.update(article);
		}
		return false;
	}

	@Override
	public List<Category> getCateListByChannelId(Integer channelId) {
		return categoryDao.selectListByChannelId(channelId);
	}

	@Override
	public boolean delByIds(String ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAllCheck(String ids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Article> getListByChannelId(Integer channelId, Integer id, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Article> getHotList(int pageNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Article> getListByChannelIdAndCateId(Integer channelId, Integer cateId, Integer pageNo) {
		// TODO Auto-generated method stub
		return null;
	}

}

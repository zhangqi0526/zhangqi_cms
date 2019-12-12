package com.zhangqi.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangqi.cms.dao.UserDao;
import com.zhangqi.cms.pojo.User;
import com.zhangqi.cms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public boolean locked(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unLocked(Integer userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addScore(Integer userId, int score) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<User> getPageInfo(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<User> userList = userDao.select(user);
		return new PageInfo<>(userList);
	}
}

package com.zhangqi.cms.service;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public interface UserService {

	/**
	 * @Title: register   
	 * @Description: 注册新增用户   
	 * @param: @param user
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean register(User user);
	/**
	 * @Title: getByUsername   
	 * @Description: 根据登录名称，查询用户   
	 * @param: @param username
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User getByUsername(String username);
	/**
	 * @Title: locked   
	 * @Description: 锁用户   
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean locked(Integer userId);
	/**
	 * @Title: unLocked   
	 * @Description: 解锁用户   
	 * @param: @param userId
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
	boolean unLocked(Integer userId);
	/**
	 * @Title: addScore   
	 * @Description: 给用户添加积分，返回用户总积分。 
	 * @param: @param userId
	 * @param: @param score
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int addScore(Integer userId,int score);
}

package com.duoduo.system.dao;

import com.duoduo.system.model.User;

public interface UserMapper {
	
	/**
	 * 根据帐号查询用户
	 * @param account 帐号
	 * @return
	 */
	User selectByAccount(String account);
}

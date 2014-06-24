package com.duoduo.system.dao;

import java.util.List;

import com.duoduo.system.model.Role;


public interface RoleMapper{
	
	/**
	 * 根据用户id获取角色集合
	 * @param userId
	 * @return
	 */
	List<Role> selectByUserId(Integer userId);
	
	/**
	 * 查询所有角色
	 * @return
	 */
	List<Role> selectAll();
}

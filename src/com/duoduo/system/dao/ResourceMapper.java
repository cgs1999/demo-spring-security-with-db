package com.duoduo.system.dao;

import java.util.List;

import com.duoduo.system.model.Resource;


public interface ResourceMapper{
	
	/**
	 * 根据角色id获取该角色可以访问的资源
	 * @param roleId
	 * @return
	 */
	List<Resource> selectByRoleId(Integer roleId);
}

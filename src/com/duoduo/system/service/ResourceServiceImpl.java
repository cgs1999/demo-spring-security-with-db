package com.duoduo.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.duoduo.system.dao.ResourceMapper;
import com.duoduo.system.model.Resource;



public class ResourceServiceImpl implements ResourceService{
	
	@Autowired
	private ResourceMapper resourceMapper;
	@Override
	public List<Resource> getByRoleId(Integer roleId) {
		return resourceMapper.selectByRoleId(roleId);
	}

}

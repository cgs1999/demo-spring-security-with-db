package com.duoduo.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.duoduo.system.dao.RoleMapper;
import com.duoduo.system.model.Role;


public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> getAll() {
		return roleMapper.selectAll();
	}

}

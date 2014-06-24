package com.duoduo.system.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.duoduo.system.dao.RoleMapper;
import com.duoduo.system.dao.UserMapper;
import com.duoduo.system.exception.UserException;
import com.duoduo.system.model.Role;
import com.duoduo.system.model.User;


public class UserDetailsServiceImpl implements UserDetailsService{
	
	private static Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private RoleMapper roleMapper;
	
	/**
	 * @param account 登录帐号
	 */
	public UserDetails loadUserByUsername(String account)
			throws UsernameNotFoundException {
		log.info("登录账号："+account);
		org.springframework.security.core.userdetails.User userDetails = null;
		try {
			User user = userMapper.selectByAccount(account);
			if(user == null) {
				throw new UserException("帐号："+account+" 不存在！");
			}
			Collection<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(user);  
			
			boolean enables = true;  
	        boolean accountNonExpired = true;  
	        boolean credentialsNonExpired = true;  
	        boolean accountNonLocked = true; 
	        userDetails = new org.springframework.security.core.userdetails.User(user.getAccount(), user.getPassword(), enables, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthorities);  
		}catch(Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
		return userDetails;
	}
	
	/**
	 * 根据用户获取该用户拥有的角色
	 * @param user
	 * @return
	 */
	private Set<GrantedAuthority> getGrantedAuthorities(User user) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();  
        List<Role> roles = roleMapper.selectByUserId(user.getId()); 
        if(roles != null) {
        	for(Role role : roles) {  
        		grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            }  
        }
        return grantedAuthorities;  
	}

}

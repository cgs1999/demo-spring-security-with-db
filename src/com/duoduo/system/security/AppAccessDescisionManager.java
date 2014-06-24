package com.duoduo.system.security;

import java.util.Collection;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

/**
 * 
 * 访问决策器，决定某个用户具有的角色，是否有足够的权限去访问某个资源 ;做最终的访问控制决定 .
 * @author Luxh
 *
 */
public class AppAccessDescisionManager implements AccessDecisionManager {
	
	private static Logger log = LoggerFactory.getLogger(AppAccessDescisionManager.class);
	
	/**
	 * 认证用户是否具有权限访问该url地址 
	 */
	@Override
	public void decide(Authentication authentication, Object obj,
			Collection<ConfigAttribute> configAttributes) throws AccessDeniedException,
			InsufficientAuthenticationException {
		log.info("AppAccessDescisionManager 验证用户是否具有访问资源的权限");
		
		if(configAttributes != null) {
			Iterator<ConfigAttribute> it = configAttributes.iterator(); 
			while(it.hasNext()) {
				//访问资源需要的权限
				String needRole = it.next().getAttribute();
				 //authentication.getAuthorities()  用户所有的权限  
	            for(GrantedAuthority ga:authentication.getAuthorities()){  
	                if(needRole.equals(ga.getAuthority())){  
	                    return;  
	                }  
	            }  
			}
		}
		
		//没有权限  
        throw new AccessDeniedException("没有权限访问！");  
	}
	
	/** 
     * 启动时候被AbstractSecurityInterceptor调用，决定AccessDecisionManager是否可以执行传递ConfigAttribute。 
     */  
	@Override
	public boolean supports(ConfigAttribute arg0) {
		return true;
	}
	
	/** 
     * 被安全拦截器实现调用，包含安全拦截器将显示的AccessDecisionManager支持安全对象的类型 
     */  
	@Override
	public boolean supports(Class<?> arg0) {
		return true;
	}

}

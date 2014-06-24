package com.duoduo.system.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

public class SpringSecurityUtil {
	
	public static Authentication getAuthentication() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return auth;
	}
	
	public static WebAuthenticationDetails getWebAuthenticationDetails() {
		WebAuthenticationDetails webAuth = (WebAuthenticationDetails) getAuthentication().getDetails();
		return webAuth;
	}

}

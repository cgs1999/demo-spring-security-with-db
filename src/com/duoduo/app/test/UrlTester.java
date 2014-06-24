package com.duoduo.app.test;

import org.junit.Test;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

public class UrlTester {
	
	@Test
	public void testMatch() {
		PathMatcher  matcher = new AntPathMatcher();
		String requestPath="http://localhost:8080/pub/login.jsp";
		String patternPath="**/pub/login.jsp";
		System.out.println(matcher.match(patternPath, requestPath));
	}
}

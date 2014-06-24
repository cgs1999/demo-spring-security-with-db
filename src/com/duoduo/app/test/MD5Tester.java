package com.duoduo.app.test;

import org.junit.Test;

import com.duoduo.system.util.MD5Util;


public class MD5Tester {
	
	@Test
	public void testEncodePassword() {
		String password = "123456";
		String salt = "luxh";
		System.out.println(MD5Util.encodePassword(password, salt));
	}
}

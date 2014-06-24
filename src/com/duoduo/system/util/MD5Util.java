package com.duoduo.system.util;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MD5Util {
	public static String encodePassword(String password,String salt) {
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		return md5.encodePassword(password, salt);
	}
}

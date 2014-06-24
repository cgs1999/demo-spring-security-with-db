package com.duoduo.system.exception;

public class UserException extends Exception{
	
	private static final long serialVersionUID = -178166731689116867L;

	public UserException() {}
	
	public UserException(String message) {
		super(message);
	}
}

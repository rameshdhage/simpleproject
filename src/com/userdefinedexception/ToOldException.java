package com.userdefinedexception;

public class ToOldException extends RuntimeException  {
	
	private String massage;
	
	ToOldException(String msg){
		super(msg);
	}

}

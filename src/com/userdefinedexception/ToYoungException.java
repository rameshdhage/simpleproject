package com.userdefinedexception;

public class ToYoungException  extends RuntimeException {
	
	private String massage;
	
	
	ToYoungException (String msg){
		super(msg);
	}

}

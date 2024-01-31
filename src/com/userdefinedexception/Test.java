package com.userdefinedexception;

public class Test {

	public static void main(String[] args) {
	
	Acccount account=new Acccount();
	System.out.println("current balance"+account.balance());
	account.withdrawal(2600);
	System.out.println("current balance"+account.balance());
			
	
	}

}

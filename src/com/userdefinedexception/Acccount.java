package com.userdefinedexception;

public class Acccount {
	
	private int balance=3000;
	
	public int balance() {
		return balance;
		
	}
	public void withdrawal(int amount) {
		if(amount>balance) {
			throw new InsufficientFundException("Insufficeint balance in your account");
		}
		else {
			 balance=balance-amount;
		}
	}

}

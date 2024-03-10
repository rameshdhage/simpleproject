package com.userdefinedexception;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your age");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		
		
		
		if(age>60) {
			throw  new ToOldException ("your age is already scrossed marriage age you can not get marrige"); 
		}
		else if(age<18){
			throw new ToYoungException ("please wait some more time you will get best match");
		}else {
			System.out.println("Thanks for registration i will be send on mail");
		}
	}
	
	

}

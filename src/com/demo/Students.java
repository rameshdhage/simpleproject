package com.demo;

import java.util.Scanner;

public class Students {

	int rollNo;
	String name;

	public Students(int rollNo, String name) {

		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String[] args) {

		Students[] objects = new Students[3];
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("please enter a rollnumber");
			System.out.println("please enter a name");
			
			
			int num=scanner.nextInt();
			String name=scanner.next();
			objects[i]=new Students(num,name);
			
		}for(Students s:objects ) {
			System.out.println(s);
			
		}
		
	}

	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + "]";
	}}
		
		
		

				
		
	



package com.demo;


	class Test {
	    
	    public void m1(){
	        System.out.println("This is a m1 method");
	        
	    }
	    
	    public void m1(int num){
	        System.out.println("int org- method");
	    }
	    public void m1(double number){
	        System.out.println("This is double org method");
	        
	    }
	    public void m1(String name){
	        System.out.println("This is a string arg method");
	        
	    }
	    public static void main(String args[]){
	        Test test=new Test();
	        test.m1();
	        test.m1(10);
	        test.m1(8.9);
	        test.m1("ramesh");
	    }
	    
	   
	}



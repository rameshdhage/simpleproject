package com.javateapoints;

public class CopyArray {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		
		int arr2[]=new int [arr1.length];
		
		//copy one array to another array
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
			
		}	
		System.out.println("Elements of the old array");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		
		System.out.println("Elements of the new array");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
			
			
		}
		
		
		
		
		
		

	

}}

package com.demo;

public class CopyArray {
	public static void main(String[] args) {
		
		int arr1[]={12,14,15,16,19};
		
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
		     
			arr2[i]=arr1[i];
			
		}
		System.out.println("Eleents of an old  array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
			
		}
		System.out.println();
		
		System.out.println("Elements of an new array;");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		
		
	}


}

package com.demo;

import java.util.Arrays;

public class RemoveDuplicate {
	
	
	public static void main(String args[]) {
		
		int arr[]= {1,2,3,1,4,5,3};
		
		int [] result=removeDuplicate(arr);
		
		System.out.println(Arrays.toString(result));
		
		
	}
	
	public static int [] removeDuplicate(int [] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
}

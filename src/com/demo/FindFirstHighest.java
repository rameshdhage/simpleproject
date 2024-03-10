package com.demo;

import java.util.Arrays;

public class FindFirstHighest {
	
	public static void main(String[] args) {
		
		int arr[]= {12,33,44,33,24,66,77,54,322,};
		
		int firstHighest=findFirstHighest(arr);
		
		System.out.println("This is a firstHighest number="+firstHighest);
		
		
	}
	
	public static int findFirstHighest(int arr[]) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-1];
		
		
	}

}

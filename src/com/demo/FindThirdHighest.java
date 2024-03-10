package com.demo;

import java.util.Arrays;

public class FindThirdHighest {
	
	public static void main(String[] args) {
		
		int arr[]= {12,23,44,55,67,78,54};
		
		int thirdHighest=findThirdHighest(arr);
		
		System.out.println("this is a thirdHighest number="+thirdHighest);
	}
	
	public static int findThirdHighest(int [] arr) {
		
		Arrays.sort(arr);
		
		return arr[arr.length-3];
		
		
	}
	

}

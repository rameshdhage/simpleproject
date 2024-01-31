package com.demo;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]=new int [] {90,23,5,109,12,22,67,34};
		
		
		Arrays.sort(arr);
		System.out.println("the lements of array asending orders");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	

}

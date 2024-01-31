package com.demo;

public class LargeElements {
	public static void main(String[] args) {
		//Initialize array
		
		int [] arr= {25,11,7,75,56};
		
		//Initialize min with first element of array.
		int large =arr[0];
		//loop through the array
		
		for(int i=0;i<arr.length;i++) {
			//compare array elements of array with min
			if(arr[i]>large) {
				large=arr[i];
			}
		}
		System.out.println("largest elements present in given array:"+large);
	}

}

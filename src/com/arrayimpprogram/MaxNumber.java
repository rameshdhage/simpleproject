package com.arrayimpprogram;

public class MaxNumber {

	public static void main(String[] args) {
	int arr[]= {12,14,16,17,18,8,87,98};
	
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
			
		}
		
	}
	System.out.println("Max number of array"+max);
	

	}

}

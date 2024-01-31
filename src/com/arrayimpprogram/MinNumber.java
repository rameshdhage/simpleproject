package com.arrayimpprogram;

public class MinNumber {
	public static void main(String[] args) {
		
		int arr[]= {12,12,49,24,34,36,144};
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				}}
		
		System.out.println("min number of the array="+min);		
		
		
	}

}

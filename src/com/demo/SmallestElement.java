package com.demo;

public class SmallestElement {
	public static void main(String[] args) {
		//Initialize array
		
		int [] arr=new int [] {25,11,7,75,56};
		
		//Initialize min with first element of array.
		int min =arr[0];
		//loop through the array
		
		for(int i=0;i<arr.length;i++) {
			//compare array elements of array with min
			if(arr[i]<min)
				min=arr[i];
		
		}
		System.out.println("Smallest elements present in given array:"+min);
	}

}

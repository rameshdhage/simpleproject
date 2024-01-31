package com.arrayimpprogram;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int arr[]= {12,14,15,151,46,47,5,86};
		
		int temp=0;
	   Arrays.sort(arr);
		System.out.println("the elements of the asending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
		}
		System.out.println("Elements of the array acending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		System.out.println("Elements of an array decending order");
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
		}

	}

}

package com.demo;

public class SortDsc {

	public static void main(String[] args) {
		//Initialize array
		int  arr[]= {5,2,8,7,1};
		int temp=0;
		
		//Displaying elements of original array
		System.out.println("Elements of original array:");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"");
		}
		
		//sort the array descending orders
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}}
		System.out.println();
		
    //displaying elements of array after sorting 
		System.out.println("Elements os array sorted in descending order:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
	}

}

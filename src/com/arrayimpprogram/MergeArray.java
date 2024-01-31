package com.arrayimpprogram;

public class MergeArray {
	public static void main(String[] args) {
		
		int a[]= {12,24,45,67};
		int b[]= {23,34,35,56};
		
		int L1=a.length;
		int L2=b.length;
		int L3=L1+L2;
		
		int c[]=new int[L3];
		
		for(int i=0;i<L1;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<L2;i++) {
			c[L1+i]=a[i];
			
		}
		for(int i=0;i<L3;i++) {
			System.out.println(c[i]);
		}
		
	}

}

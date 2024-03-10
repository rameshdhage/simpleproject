package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*public class Demo{
	
	public static void main(String[] args) {
		
	   List<String> list=Arrays.asList("Akash","Ashvini","Ananda","ramesh","Deepak");
		
	  list.stream().filter(name->name.startsWith("A")).forEach(System.out::println);
}}*/		

import java.util.*;

class Demo {
	
   public static void main(String[] args) {
	   
	   int arr[]= {23,44,222,34,24,55,44,222};
	   int temp=0;
	   
	   
	   
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i+1;j<arr.length;j++) {
			   if(arr[i]>arr[j]) {
				   temp=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   System.out.println("Given array are the ASC order....");
	   
	   for(int i=0;i<arr.length;i++) {
		   System.out.println(arr[i]);
	   }
	   System.out.println("Given array are the DESC order.....");
	   
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
		   System.out.println(arr[i]);
	   }
	   
	   
	}
}
		
		
		

	 
	 
	 
	
 
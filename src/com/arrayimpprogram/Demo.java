package com.arrayimpprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Map<Integer,String > map=new  HashMap<Integer,String>();
		
		map.put(1,"c");
		map.put(2,"c++");
		map.put(3,"java");
		map.put(4,"angular");
		map.put(5,"python");
		
		
	System.out.println("hashmap iterat by using entrySet");
		
	Iterator <Entry<Integer,String>>	iterator=map.entrySet().iterator();
	
	while(iterator.hasNext()) {
		
	Entry<Integer,String>	entry=iterator.next();
	
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
	
	}
	System.out.println();
	
	System.out.println("hashmap iterate by using keySet");
	
	       Iterator <Integer> itr=map.keySet().iterator();
	       
	       while(itr.hasNext()) {
	    	Integer key = itr.next();
	    	
	    	System.out.println(key);
	    	System.out.println(map.get(key));
	    	
	       }
	System.out.println();
	
	System.out.println("using lambda expresion iterat the hashmap");
	
		map.forEach((key,value)->{
			
			System.out.println(key);
			System.out.println(value);
			
		});
		
		System.out.println();
		
	  System.out.println("using stream api")  ;
	  
	  map.entrySet().stream().forEach((entry)->{
		  
		  System.out.println(entry.getKey());
		  System.out.println(entry.getValue());
		  
		  
		  
	  });
	  
		
		
		
		
	}
		
	
	
	}
	
	
	
	
	   


		
		
		
		

	
			
		
		
	
	

	



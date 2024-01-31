package com.sachinesir;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmapEx1 {
	public static void main(String[] args){
		Map<String,String> lhp=new LinkedHashMap<String,String>();
	    lhp.put("ganesh","ubale");
		lhp.put("shyam","shinde");
		lhp.put("shivaji","gade");
		lhp.put("balaji","kadam");
		lhp.put("karan","yede");
		
		System.out.println(lhp);
		lhp.forEach((k,v)->System.out.println("key="+k+"value="+v));
		
	Iterator<Map.Entry<String,String>>	itr=lhp.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

        
         }}

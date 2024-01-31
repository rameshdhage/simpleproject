package com.sachinesir;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"ramesh",20000);
		Employee emp2=new Employee(102,"satish",50000);
		Employee emp3=new Employee(103,"amol",30000);
		Employee emp4=new Employee(104,"lalit",40000);
		
		HashMap<Employee,String> map=new HashMap<>();
		
		map.put(emp1,"Employee-1");
		map.put(emp2,"Employee-2");
		map.put(emp3,"Employee-3");
		map.put(emp4,"Employee-4");
		
 /*Iterator<Map.Entry<Employee,String>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(map);
	//map.forEach((k,v)->System.out.println("key="+k+"value="+v));
		
	for(Map.Entry<Employee,String>entry:map.entrySet()) {
		System.out.println(entry.getKey()+"=="+entry.getValue());}*/
		
	
		
	}}

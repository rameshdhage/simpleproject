package com.sachinesir;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
	public static void main(String[] args) {
	Map<String,Employees> emp=new HashMap<>();
	emp.put("ramesh",new Employees("ramesh",34000));
	emp.put("ganesh",new Employees("ganesh",38000));
	emp.put("deepak",new Employees("deepak",30000));
	emp.put("satish",new Employees("satish",24000));
	emp.put("balaji",new Employees("balaji",84000));
	emp.put("shivaji",new Employees("shivaji",74000));
	emp.put("bhaskar",new Employees("bhaskar",56000));
	emp.put("maurli",new Employees("murli",66000));
	emp.put("karan",new Employees("karan",55000));
	emp.put("shyam",new Employees("shyam",67000));
	emp.put("lalit",new Employees("lalit",98000));
	emp.put("amol",new Employees("amol",58000));
	emp.put("ananda",new Employees("ananda",87000));
	emp.put("nagorao",new Employees("nagorao",23000));
	emp.put("santosh",new Employees("santosh",98000));
	emp.put("tirupati",new Employees("tirupati",56000));
	emp.put("kajal",new Employees("kajal",67000));
	emp.put("shital",new Employees("shital",45000));
	emp.put("shivani",new Employees("shivani",78000));
	emp.put("radha",new Employees("radha",35000));
	
	 // Collections.sort();
       for(Employees empl:emp.values()) {
		System.out.println("name="+((Employees)empl).getName());
		System.out.println("salary="+((Employees)empl).getSalary());
		}}}
	

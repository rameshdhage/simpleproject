package com.sachinesir;

public class Employees {
	
	private  String name;
	private double salary;
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	

}

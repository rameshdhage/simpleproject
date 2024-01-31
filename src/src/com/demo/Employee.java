package src.com.demo;

import java.util.ArrayList;

public class Employee {
	
		String name;
		double mobile;
		String city;
		double salary;
		
	
		public Employee (String name,double mobile,String city,double salary) {
			this.name=name;
			this.mobile=mobile;
			this.salary=salary;
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getMobile() {
			return mobile;
		}


		public void setMobile(double mobile) {
			this.mobile = mobile;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public double getSalary() {
			return salary;
		}
		


		public void setSalary(double salary) {
			this.salary = salary;
		}
		public static ArrayList<Employee>getEmployeList(){
			ArrayList<Employee>employeeList=new ArrayList<Employee>();
			
			employeeList.add(new Employee("ramesh",779880609,"nanded",2500));
			employeeList.add(new Employee("satish",897657677,"yeli",78878));
			
			/*for(Employee imp:employeeList) {
            System.out.println("name>>"+imp.getName()
            +"moble>>"+imp.getMobile()
            +"city>>"+imp.getCity()
             +"salary>>"+imp.getSalary());
			}*/
			System.out.println(employeeList);
			return employeeList;
			}
		
		public static void main(String[] args) {
			getEmployeList();
		
		}
		
		
		
		
	

}

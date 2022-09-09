package com.infosys.demo7;

public class EmployeeMain {

	public static void main(String[] args) {
	Employee employee1=new Employee("Shayam",23000);
	System.out.println(employee1.getEmployeeId());
	System.out.println(employee1.getEmployeeName());
	System.out.println(employee1.getBasic());
	Employee employee2=new Employee("Suresh",21000);
     System.out.println(employee2.getEmployeeId());
	System.out.println(employee2.getEmployeeName());
	System.out.println(employee2.getBasic());
	Employee employee3=new Employee("Naina",22000);
    System.out.println(employee3.getEmployeeId());
	System.out.println(employee3.getEmployeeName());
	System.out.println(employee3.getBasic());
	}

}

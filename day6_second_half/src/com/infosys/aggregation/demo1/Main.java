package com.infosys.aggregation.demo1;

public class Main {

	public static void main(String[] args) {
	Employee employee=new Employee(1,"Subir",9823456781L,"A/122, Jawahar Nagar-Delhi");
	Department dept=new Department(111,"Finance",employee);
	System.out.println("The details");
	System.out.println(dept.getDepartmentId());
	System.out.println(dept.getDepartmentName());
	System.out.println(dept.getManager());
	employee=dept.getManager();
	System.out.println(employee.getEmployeeId());
	System.out.println(employee.getEmployeeName());
	System.out.println(employee.getAddress());
    System.out.println(employee.getMobileNumber());
	}

}

package com.infosys.demo7;

public class Employee {
private String employeeId;
private String employeeName;
private long basic;
private  static int counter;

// static block will be called once before constructor call
static {
	counter=1;
	System.out.println("I am called"); 
}

public Employee(String employeeName, long basic) {
	super();
	this.employeeId="E000"+counter;
	this.employeeName = employeeName;
	this.basic = basic;
	counter++;
	System.out.println("The parameterized constructor will be called");
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public long getBasic() {
	return basic;
}

public void setBasic(long basic) {
	this.basic = basic;
}

public String getEmployeeId() {
	return employeeId;
}




}

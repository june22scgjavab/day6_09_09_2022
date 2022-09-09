package com.infosys.aggregation.demo1;

public class Employee {
private int employeeId;
private String employeeName;
private long mobileNumber;
private String address;



public Employee(int employeeId, String employeeName, long mobileNumber, String address) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.mobileNumber = mobileNumber;
	this.address = address;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}

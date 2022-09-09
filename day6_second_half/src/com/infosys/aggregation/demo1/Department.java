package com.infosys.aggregation.demo1;

public class Department {
private int departmentId;
private String departmentName;
private Employee manager;  // HAS-A relationship
public Department(int departmentId, String departmentName, Employee manager) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.manager = manager;
}
public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public Employee getManager() {
	return manager;
}
public void setManager(Employee manager) {
	this.manager = manager;
}

}

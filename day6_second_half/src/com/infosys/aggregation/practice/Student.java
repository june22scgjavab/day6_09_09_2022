package com.infosys.aggregation.practice;
public class Student {
  private int roll;
  private Name name;
  private int marks;
  private Address address;
//setters/getters/constructor

public Address getAddress() {
	return address;
}

public Student(int roll, Name name, int marks, Address address) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.address = address;
}

public void setAddress(Address address) {
	this.address = address;
}



public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public Name getName() {
	return name;
}

public void setName(Name name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

 
}


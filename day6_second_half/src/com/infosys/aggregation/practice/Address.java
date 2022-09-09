package com.infosys.aggregation.practice;

public class Address{
private int hno;
private String locality;
private String city;
private String state;
public Address(int hno, String locality, String city, String state) {
	super();
	this.hno = hno;
	this.locality = locality;
	this.city = city;
	this.state = state;
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

// setters/getters/parameterized constructor

}

package com.infosys.aggregation.practice;
public class StudentMain{
	/*
	 * ROLL: 1
FIRSTNAME: Ram
MIDDLENAME: Kumar
LASTNAME: Verma
MARKS: 90
	 * 
	 */
   public static void main(String args[]){
    Name name=new Name("Ram","Kumar","Verma");
    Address address=new Address(1,"Jawahar Nagar","Kanpur","UP");
    Student student=new Student(1,name,90,address);
    System.out.println("ROLL: "+student.getRoll());
    name=student.getName();
    System.out.println(student.getName());
    System.out.println(student.getName().getFirstName());
    System.out.println(student.getName().getMiddleName());
    System.out.println(student.getName().getLastName());
    System.out.println("FIRSTNAME: "+name.getFirstName());
    System.out.println("MIDDLENAME: "+name.getMiddleName());
    System.out.println("LASTNAME: "+name.getLastName());
    System.out.println("MARKS: "+student.getMarks());
    address=student.getAddress();
    System.out.println("HNO: "+address.getHno());
    System.out.println("LOCALITY: "+address.getLocality());
    System.out.println("CITY: "+address.getCity());
    System.out.println("STATE: "+address.getState());
   }
}

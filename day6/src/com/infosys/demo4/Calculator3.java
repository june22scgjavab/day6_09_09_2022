package com.infosys.demo4;

public class Calculator3 {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
	   Calculator3 calc=new Calculator3();
	  int sum=calc.add(1,2);// A static method can call other static method
      System.out.println(sum);
	}

}

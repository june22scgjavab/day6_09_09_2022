package com.infosys.demo4;

public class Calculator {

	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		add(1,2);//Cannot make a static reference to the non-static
		//method add(int, int) from the type Calculator

	}

}

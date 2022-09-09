package com.infosys.demo4;

public class Demo3 {
	private  int i;
	// to access non static members , first create an object of the class
	// and then access
	public static void main(String[] args) {
		Demo3 demo=new Demo3();
		demo.i=10; 
		System.out.println(demo.i);
	}

}

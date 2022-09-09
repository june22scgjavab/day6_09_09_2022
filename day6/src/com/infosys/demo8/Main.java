package com.infosys.demo8;

public class Main {

	static {
		System.out.println("I am the static block of main");
	}
	Main(){
		System.out.println("I am the constructor of Main");
	}
	
	public static void main(String[] args) {
	Number number=null;
	Main main=new Main();
	System.out.println("I am within main method");
	number=new Number();
	
	}

}

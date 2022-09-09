package com.infosys.demo4;

public class Demo {
private int i;
	public static void main(String[] args) {
		i=20;  // Compilation error because i is a non static variable
		// and main in static so static cannot access non static member

	}

}

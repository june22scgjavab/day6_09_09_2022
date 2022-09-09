package com.infosys.demo3;

public class NumbersMain {

	public static void main(String[] args) {
		Numbers number1=new Numbers();
		number1.setNum(1);
		number1.setStatic_num(2);
		Numbers number2=new Numbers();
		number2.setNum(3);
		number2.setStatic_num(4);
		Numbers number3=new Numbers();
		number3.setNum(5);
		number3.setStatic_num(6);
		System.out.println(number1.getNum()+"\t"+number1.getStatic_num());
		System.out.println();
		System.out.println(number2.getNum()+"\t"+number2.getStatic_num());
		System.out.println();
		System.out.println(number3.getNum()+"\t"+number3.getStatic_num());
		System.out.println();
		System.out.println(Numbers.getStatic_num()); // static methods should
		// be called with the class name though they can be callled with the
		// object but better to call static methods with the class name

	}

}

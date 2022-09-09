package com.infosys.demo3;

public class Numbers {
private int num;
private static int static_num;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public static int getStatic_num() {
	return static_num;
}
public static void setStatic_num(int static_num) {
	Numbers.static_num = static_num;
}

}

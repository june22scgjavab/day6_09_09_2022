package com.infosys.demo1;

public class ItemMain {

	public static void main(String[] args) {
	Item item1=new Item();
	Item item2=new Item();
	Item item3=new Item();
	item1.setItemId(1);
	item1.setItemName("Pen");
	item1.setItemPrice(120.50f);
	item1.setBrandName("XYZ");
	item2.setItemId(2);
	item2.setItemName("Pencil");
	item2.setItemPrice(10);
	item2.setBrandName("XYZ");
	item3.setItemId(3);
	
	item3.setItemName("Sharpner");
	item3.setItemPrice(5);
	item3.setBrandName("XYZ");
	System.out.println("The details");
	System.out.println(item1.getItemId());
	System.out.println(item1.getItemName());
	System.out.println(item1.getItemPrice());
	System.out.println(item1.getBrandName());
	System.out.println(item2.getItemId());
	System.out.println(item2.getItemName());
	System.out.println(item2.getItemPrice());
	System.out.println(item2.getBrandName());
	System.out.println(item3.getItemId());
	System.out.println(item3.getItemName());
	System.out.println(item3.getItemPrice());
    System.out.println(item3.getBrandName());	
	
	

	}

}
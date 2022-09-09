package com.infosys.demo2;

public class ItemMain {

	public static void main(String[] args) {
	Item item1=new Item();
	Item item2=new Item();
	Item item3=new Item();
	item1.setItemId(1);
	item1.setItemName("Pen");
	item1.setItemPrice(120.50f);
	//item1.setBrandName("XYZ"); // We need not write or access static members
	// with object but we can access static members with class name
	item2.setItemId(2);
	item2.setItemName("Pencil");
	item2.setItemPrice(10);
	//item2.setBrandName("XYZ");
	item3.setItemId(3);
	
	item3.setItemName("Sharpner");
	item3.setItemPrice(5);
	//item3.setBrandName("XYZ");
	
	Item.setBrandName("XYZ"); // static members can be accessed with the 
	// class name as static are related to class rather than objects
	
	System.out.println("The details");
	System.out.println(item1.getItemId());
	System.out.println(item1.getItemName());
	System.out.println(item1.getItemPrice());
	//System.out.println(item1.getBrandName());
	System.out.println(item2.getItemId());
	System.out.println(item2.getItemName());
	System.out.println(item2.getItemPrice());
	//System.out.println(item2.getBrandName());
	System.out.println(item3.getItemId());
	System.out.println(item3.getItemName());
	System.out.println(item3.getItemPrice());
   // System.out.println(item3.getBrandName());	
	
	System.out.println(Item.getBrandName());

	}

}

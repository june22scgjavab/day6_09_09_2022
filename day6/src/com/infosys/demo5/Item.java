package com.infosys.demo5;

public class Item {
private int itemId;
private String itemName;
private float itemPrice;
private static String brandName="XYZ"; // one copy of this variable which is 
// shared by all the objects of a class


public int getItemId() {
	return itemId;
}
public static String getBrandName() {
	return brandName;
}
public static void setBrandName(String brandName) {
	Item.brandName = brandName;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public float getItemPrice() {
	return itemPrice;
}
public void setItemPrice(float itemPrice) {
	this.itemPrice = itemPrice;
}

}

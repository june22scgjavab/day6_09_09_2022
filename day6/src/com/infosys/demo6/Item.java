package com.infosys.demo6;

public class Item {
private int itemId;
private String itemName;
private float itemPrice;
private static String brandName;

static {
	brandName="XYZ"; // static block is used to initialise static members
	// as constructor is used to initialise member variables
}

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

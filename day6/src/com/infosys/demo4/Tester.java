package com.infosys.demo4;
class Customer {
	private String customerId;
	private String customerName;
	private long contactNumber;
	private String address;
	private float deliveryCharge;
	public Customer(String customerId, String customerName, long contactNumber,
			String addres) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.deliveryCharge = 1.5f;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		double finalBillAmount=priceAfterDiscount + deliveryCharge;
		return finalBillAmount;
	}
}
public class Tester {
	public static void main(String[] args) {
		Customer customer1 = new Customer("C1001", "Sam", 9945000009L,
				"Carolina Street, Springfield, 62702");
		System.out.println("Final amount to be paid: $" +customer1.payBill(20));
		Customer customer2 = new Customer("C1002", "Tom", 994512456779L,
				"Carolina Street, Springfield, 62702");
		System.out.println("Final amount to be paid: $" +customer2.payBill(25));
	
	
	
	}
}

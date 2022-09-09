package com.infosys.aggregation.demo2;

public class Library {
private String name;
private Book books[]; // books is of type Book and it is an array
public Library(String name, Book[] books) {
	super();
	this.name = name;
	this.books = books;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Book[] getBooks() {
	return books;
}
public void setBooks(Book[] books) {
	this.books = books;
}

}

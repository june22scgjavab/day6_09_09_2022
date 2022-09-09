package com.infosys.aggregation.demo2;

public class Book {
private int id;
private String title;
private String author;
private String subject;
public Book(int id, String title, String author, String subject) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.subject = subject;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}

}

package com.infosys.arrayofobjects;

public class BookMain {

	public static void main(String[] args) {
		Book book1=new Book(1,"DBMS",500);
		Book book2=new Book(2,"Java",700);
		
		//Book books[]= {book1,book2};
		
		Book books[]=new Book[2];  
		books[0]=book1;
		books[1]=book2;
		
		for(Book book : books) {
			System.out.println(book.getId()+"\t"+book.getBookName()+"\t"+book.getPrice());
		}
		

	}

}

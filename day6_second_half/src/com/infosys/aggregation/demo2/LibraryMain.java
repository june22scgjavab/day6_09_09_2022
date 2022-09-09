package com.infosys.aggregation.demo2;

public class LibraryMain {

	public static void main(String[] args) {
	Book book1=new Book(1,"DOTNET","James","CompSc");
	Book book2=new Book(2,"JAVA","Patrick","CompSc");
	Book books[]=new Book[2];
	books[0]=book1;
	books[1]=book2;
	Library library=new Library("ABC Library",books);
	System.out.println(library.getName());
	for(Book book : books) {
		System.out.println(book.getId()+"\t"+book.getTitle()+"\t"+book.getAuthor());
	}

	}

}

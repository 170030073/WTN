package com.wipro.encapsulationandabstraction;

class Author {
	public static String name;
	public static String email;
	public static char gender;
	Author(String n,String e,char g ){
		name=n;
		email=e;
		gender=g;
	}
}
class Book{
	String name1,author;
	double price;
	int qtyInStock;
	Book(String n1){
		name1=n1;
	}
	void setPrice() {
		price=200.0;
	}
	void setqtyInStock() {
		qtyInStock=10;
	}
	double getPrice() {
		return price;
	}
	int getqtyInStock() {
		return qtyInStock;
	}
	String getName() {
		return name1;
	}
	void getAuthor() {
		System.out.println("Author name is: "+Author.name);
		System.out.println("Author email is: "+Author.email);
		System.out.println("Author gender: "+Author.gender);
	}	
}

public class Books {
	public static void main(String args[]) {
		Book b=new Book("Operating System");
		Author a=new Author("Peter","peter@gmail.com",'m');
		b.setPrice();
		b.setqtyInStock();
		System.out.println("The book name is: "+b.getName());
		System.out.println("The book price is: "+b.getPrice());
		System.out.println("The stock is: "+b.getqtyInStock());
		b.getAuthor();
		
	}

}

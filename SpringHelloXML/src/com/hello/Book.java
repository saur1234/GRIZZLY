package com.hello;

public class Book {
	int id;
	int price;
	String author;
	String title;
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", author=" + author + ", title=" + title + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Book(int id, int price, String author, String title) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
		this.title = title;
	}
	public Book(int price, String author, String title) {
		super();
		this.price = price;
		this.author = author;
		this.title = title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Book() {
		// TODO Auto-generated constructor stub
	}

}

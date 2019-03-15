package com.hello;

import java.util.List;

public class Book {
	int id;
	int price;
	List<String> author;
	public Book(int id, int price, List<String> author, String title, Publisher p) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
		this.title = title;
		this.p = p;
	}


	String title;
	Publisher p;
	

	public Publisher getP() {
		return p;
	}


	public void setP(Publisher p) {
		this.p = p;
	}


	


	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", author=" + author + ", title=" + title + ", p=" + p + "]";
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


	public List<String> getAuthor() {
		return author;
	}


	public void setAuthor(List<String> author) {
		this.author = author;
	}


	public Book(int id, int price, List<String> author, String title) {
		super();
		this.id = id;
		this.price = price;
		this.author = author;
		this.title = title;
	}
	public Book(int price, List<String> author, String title) {
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

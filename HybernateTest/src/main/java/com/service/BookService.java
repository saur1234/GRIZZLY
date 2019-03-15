package com.service;

import com.entity.Book;

public interface BookService {
	
	public void addBook(Book b);
	public void fetchBook(int id);
	public void updateBook(int id,float price);
	public void deleteBook(int id);
	public void getAllBooks();
}

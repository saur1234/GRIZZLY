package com.dao;

import java.util.List;

import com.entity.Book;

public interface BookDAO {
	
	public void addBook(Book b);
	public Book fetchBook(int id);
	public void updateBook(int id,float price);
	public void deleteBook(int id);
	public List<Book> getAllBooks();
}

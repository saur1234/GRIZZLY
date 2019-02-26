package com.dao;
import java.util.*;

import com.model.Book;

import java.sql.SQLException;

public interface BookDAO {
	
	List<Book> listBooks() throws SQLException;
	void connect() throws SQLException;
	//void updateBook(Book b);
	int deleteBook(int id)throws SQLException;
	int insertBook(Book b) throws SQLException;
	int updateBook(Book b) throws SQLException;
	//void disconnect() throws SQLException;
}

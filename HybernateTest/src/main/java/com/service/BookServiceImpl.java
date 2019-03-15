package com.service;

import java.util.Iterator;
import java.util.List;

import com.dao.BookDAO;
import com.dao.BookDAOImpl;
import com.entity.Book;

public class BookServiceImpl implements BookService{

	public void addBook(Book b) {
		// TODO Auto-generated method stub
		BookDAO ob = new BookDAOImpl();
		ob.addBook(b);
	}

	public void fetchBook(int id) {
		// TODO Auto-generated method stub
		BookDAO ob = new BookDAOImpl();
		Book b = ob.fetchBook(id);
		if(b!=null)
			System.out.println(b);
		else
			System.out.println("Book do not exist");
	}

	public void updateBook(int id, float price) {
		// TODO Auto-generated method stub
		BookDAO ob = new BookDAOImpl();
		ob.updateBook(id,price);
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		BookDAO ob = new BookDAOImpl();
		ob.deleteBook(id);
		
	}

	public void getAllBooks() {
		// TODO Auto-generated method stub
		BookDAO ob = new BookDAOImpl();
		List<Book> list = ob.getAllBooks();
		Iterator<Book> it = list.iterator();
		while(it.hasNext()){
			Book b = (Book)it.next();
			System.out.println("Book id: "+b.getId());
			System.out.println("Book title: "+b.getTitle());
			System.out.println("Book author: "+b.getAuthor());
			System.out.println("Book price: "+b.getPrice());
		}
		
	}
	

}

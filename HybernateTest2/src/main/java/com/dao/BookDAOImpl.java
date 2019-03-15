package com.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Book;
import com.util.HibernateUtil;

public class BookDAOImpl implements BookDAO {

	public void addBook(Book b) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Integer id = (Integer)ses.save(b);
		System.out.println("Book created with id: "+ id);
		ses.getTransaction().commit();
		
	}

	public Book fetchBook(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Book e = ses.get(Book.class, id);		
		return e;
	}

	public void updateBook(int id, float price) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Book b = ses.get(Book.class, id);
		if(b!=null){
			ses.beginTransaction();
			b.setPrice(500);
			ses.getTransaction().commit();
			ses.persist(b);
		}
		else
			System.out.println("Book not exist");
		
	}

	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Book b = fetchBook(id);
		ses.beginTransaction();
		if(b!=null){
			ses.delete(b);
			ses.getTransaction().commit();
		}
		else
			System.out.println("Book do not exist");
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Query qry = ses.createQuery("from Book b");
		List<Book> list = qry.list();
		
		return list;
	}
}

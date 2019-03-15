package com.model;

import javax.persistence.Query;

import org.hibernate.Session;

import com.entity.Person;
import com.util.HibernateUtil;

public class BookPersonClient 
{
public static void main(String[] args)
{
	Session ses = HibernateUtil.getSessionFactory().openSession();
	String HQL="FROM Book b LEFT JOIN FETCH b.p WHERE b.id=:b_Id";
	Query<Book> q=session.createQuery(HQL,Book.class);
}
}

package com.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;
import com.util.HibernateUtil;

public class BookClientCriteria {
	
	public static void main(String args[]){
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Criteria cr1 = ses.createCriteria(Book.class);
		cr1.setProjection(Projections.rowCount());
		List<Book> ct = cr1.list();
		System.out.println("Total Records "+ct.get(0));
		
		Criteria cr2 = ses.createCriteria(Book.class);
		cr2.add(Restrictions.gt("price", 1000f));
		List<Book> ct2 = cr2.list();
		Iterator<Book> it = ct2.iterator();
		while(it.hasNext()){
			System.out.println((Book)it.next());
		}
		
		
		Criteria cr3 = ses.createCriteria(Book.class);
		cr3.setProjection(Projections.max("price"));
		List<Book> ct3 = cr3.list();
		System.out.println("Maximum Price: "+ct3.get(0));
		
		Criteria cr4 = ses.createCriteria(Book.class);
		cr4.setProjection(Projections.min("price"));
		List<Book> ct4 = cr4.list();
		System.out.println("Maximum Price: "+ct4.get(0));
		
		Criteria cr5 = ses.createCriteria(Book.class);
		cr5.setProjection(Projections.avg("price"));
		List<Book> ct5 = cr5.list();
		System.out.println("Maximum Price: "+ct5.get(0));
		
		Criteria cr6 = ses.createCriteria(Book.class);
		cr6.setProjection(Projections.sum("price"));
		List<Book> ct6 = cr6.list();
		System.out.println("Maximum Price: "+ct6.get(0));
	}

}

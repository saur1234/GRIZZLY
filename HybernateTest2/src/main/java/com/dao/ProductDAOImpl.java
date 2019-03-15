package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Book;
import com.entity.Product;
import com.util.HibernateUtil;

public class ProductDAOImpl implements ProductDAO{

	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Integer id = (Integer)ses.save(p);
		System.out.println("Product created with id: "+ id);
		ses.getTransaction().commit();
	}

	public void updateProduct(int id, Product p) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Product product = ses.get(Product.class, id);
		if(product!=null){
			ses.beginTransaction();
			product.setRating(p.getRating());
			product.setName(p.getName());
			product.setCategory(p.getCategory());
			product.setBrand(p.getBrand());
			product.setPrice(p.getPrice());
			ses.getTransaction().commit();
			ses.persist(p);
		}
		else
			System.out.println("Product not exist");
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Product p = fetchProduct(id);
		ses.beginTransaction();
		if(p!=null){
			ses.delete(p);
			ses.getTransaction().commit();
		}
		else
			System.out.println("Product do not exist");
		
	}

	public Product fetchProduct(int id) {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Product e = ses.get(Product.class, id);		
		return e;
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session ses = HibernateUtil.getSessionFactory().openSession();
		Query qry = ses.createQuery("from Product p");
		List<Product> list = qry.list();
		
		return list;
		
	}
	

}

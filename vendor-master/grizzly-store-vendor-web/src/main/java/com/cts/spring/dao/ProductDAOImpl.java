package com.cts.spring.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.spring.entity.Product;

import javassist.compiler.ast.Symbol;

@Repository("bookDAO")
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(product);
		//System.out.println("Data Saved");
		
		
	}

	@Override
	
	public List<Product> listAllProduct() {
		// TODO Auto-generated method stub
		//System.out.println("from dao list");
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery=criteriaBuilder.createQuery(Product.class);
		Root<Product> root=criteriaQuery.from(Product.class);
		criteriaQuery.select(root);
		Query query =session.createQuery(criteriaQuery);
		return query.getResultList();
		
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Product product=session.get(Product.class, id);
		return product;
		
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		//System.out.println(id);
		Session session=sessionFactory.getCurrentSession();
		Product product=session.get(Product.class, id);
		session.delete(product);
		
		
	}

}

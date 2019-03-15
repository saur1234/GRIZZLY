package com.service;

import java.util.Iterator;
import java.util.List;

import com.dao.ProductDAO;
import com.dao.ProductDAOImpl;
import com.entity.Product;

public class ProductServiceImpl implements ProductService {

	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		ProductDAO ob = new ProductDAOImpl();
		ob.addProduct(p);
		
	}

	public void updateProduct(int id, Product newProduct) {
		// TODO Auto-generated method stub
		ProductDAO ob = new ProductDAOImpl();
		ob.updateProduct(id, newProduct);
	}

	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		ProductDAO ob = new ProductDAOImpl();
		ob.deleteProduct(id);
	}

	public void fetchProduct(int id) {
		// TODO Auto-generated method stub
		ProductDAO ob = new ProductDAOImpl();
		Product p = ob.fetchProduct(id);
		System.out.println(p);
	}

	public void getAllProduct() {
		// TODO Auto-generated method stub
		ProductDAO ob = new ProductDAOImpl();
		List<Product> list = ob.getAllProducts();
		Iterator<Product> it = list.iterator();
		while(it.hasNext()){
			Product p = (Product)it.next();
			System.out.println(p);
		}
	}

}

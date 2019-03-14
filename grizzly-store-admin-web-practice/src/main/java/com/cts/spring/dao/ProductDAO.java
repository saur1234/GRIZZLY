package com.cts.spring.dao;

import java.util.List;

import com.cts.spring.entity.*;

public interface ProductDAO  {
	public void saveProduct(Product product);
	public List<Product> listAllProduct();
	public Product getProduct(int id);
	public void deleteProduct(int id);
	
	

}

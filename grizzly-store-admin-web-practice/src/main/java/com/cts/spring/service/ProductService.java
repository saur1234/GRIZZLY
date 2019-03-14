package com.cts.spring.service;

import java.util.List;

import com.cts.spring.entity.Product;

public interface ProductService {
	void saveProduct(Product book);
	List<Product> listProduct();
	public Product getProduct(int id);
	public void deleteProduct(int id);
	
}

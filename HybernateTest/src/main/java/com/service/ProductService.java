package com.service;

import com.entity.Product;

public interface ProductService {
	
	public void addProduct(Product p);
	public void updateProduct(int id, Product newProduct);
	public void deleteProduct(int id);
	public void fetchProduct(int id);
	public void getAllProduct();

}

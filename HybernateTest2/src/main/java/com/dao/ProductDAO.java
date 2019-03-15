package com.dao;

import java.util.List;

import com.entity.Product;

public interface ProductDAO {
	public void addProduct(Product p);
	public void updateProduct(int id, Product p);
	public void deleteProduct(int id);
	public Product fetchProduct(int id);
	public List<Product> getAllProducts();

}

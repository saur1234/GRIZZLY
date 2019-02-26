package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Product;

public interface ProductDAO {
	
	List<Product> getAllProducts() throws SQLException;
	public int addProduct(Product p) throws SQLException;
	public int deleteProduct(Product p) throws SQLException;
}

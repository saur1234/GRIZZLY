package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.model.Login;
import com.model.Product;

public interface ProductDAO {
	
	List<Product> listProducts() throws SQLException;
	int insertProduct(Product b) throws SQLException;
	 int deleteProduct(Product b) throws SQLException;
	Product viewProduct(Product b) throws SQLException;
	List<Product> listInventory(String user) throws SQLException;
	

}

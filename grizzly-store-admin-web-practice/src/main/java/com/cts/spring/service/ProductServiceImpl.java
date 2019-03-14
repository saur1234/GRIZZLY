package com.cts.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.spring.dao.ProductDAO;
import com.cts.spring.entity.Product;

@Service("bookService")
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO bookDAO;
	
	@Override
	
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		bookDAO.saveProduct(product);
	}

	@Override
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		return bookDAO.listAllProduct();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return bookDAO.getProduct(id);
	}

	

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		 bookDAO.deleteProduct(id);
	}

	
	

}

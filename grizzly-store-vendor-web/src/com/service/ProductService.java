package com.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Product;

public interface ProductService {
public List<Product> getAllProducts(HttpServletRequest request,HttpServletResponse response) throws SQLException;
public void showAddForm(HttpServletRequest request,HttpServletResponse response);
public int addProduct(HttpServletRequest request,HttpServletResponse response);
public int removeProduct(HttpServletRequest request,HttpServletResponse response);
public void view(HttpServletRequest request,HttpServletResponse response);
public void goBack(HttpServletRequest request,HttpServletResponse response);
public List<Product> getInventory(HttpServletRequest request,HttpServletResponse response) throws SQLException;

}


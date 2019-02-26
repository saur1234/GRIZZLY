package com.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

import com.dao.ProductDAOImpl;
import com.model.Product;

public class ProductService {
	ProductDAOImpl p=new ProductDAOImpl();
	public void getAllProducts(HttpServletRequest request,HttpServletResponse response) throws SQLException, ServletException, IOException
	{
		List<Product> l=new ArrayList<Product>();
		
		l=p.getAllProducts();
	    
		javax.servlet.RequestDispatcher rd=request.getRequestDispatcher("ProductList.jsp");
		HttpSession session=request.getSession();
		session.setAttribute("productlist",l);
	   	rd.forward(request, response);
		
		
	}
	public void addProduct(HttpServletRequest request,HttpServletResponse response) throws SQLException, ServletException, IOException
	{
		
		 javax.servlet.RequestDispatcher dispatcher=request.getRequestDispatcher("AddProduct.jsp");
	  
		  try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		
	}
	public void addProductDatabase(HttpServletRequest request,HttpServletResponse response) throws IOException
	{  ProductDAOImpl pd=new ProductDAOImpl();
		String name=request.getParameter("name");
        float price=Float.parseFloat(request.getParameter("price"));
	String brand=request.getParameter("brand");
	String category=request.getParameter("category");
	Float rating=Float.parseFloat(request.getParameter("rating"));
	    Product p=new Product(name,price,brand,category,rating);
	    int i=-2;
	    try {
			    i=pd.addProduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(i==1) System.out.println("\n Succesfully updated");
	    response.sendRedirect("ProductController");
	    
	}
	public void delete(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		ProductDAOImpl pdaoi=new ProductDAOImpl();
		Product p=new Product(id);
		int i=pdaoi.deleteProduct(p);
		if(i==1)
			System.out.println("successful del");
		response.sendRedirect("ProductController");
	}
	
}

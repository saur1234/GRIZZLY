package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDAOImpl;
import com.dao.ProductDAOImpl;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */
//@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at here: ").append(request.getContextPath());
		String action=request.getServletPath();
		switch(action)
		{
		case "/ProductController":
		{
			
			try {
				ProductService p=new ProductService();
				p.getAllProducts(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		break;
		case "/add":
		{   System.out.println("inside add");
			ProductService p=new ProductService();
			try {
				p.addProduct(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		}
		case "/addDatabase":
		{
			System.out.println("inside adddatabase");
			ProductService p=new ProductService();
			p.addProductDatabase(request, response);
			break;
		}
		case "/delete":
		{
			System.out.println("inside delete");
			ProductService p=new ProductService();
			try {
				p.delete(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
		
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

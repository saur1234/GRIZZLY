package com.controller;


import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAOImpl;
import com.service.ProductServiceImpl;



public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String user;
	HttpSession session;
    
	ProductServiceImpl pd;
	LoginDAOImpl ld;
public void init() throws ServletException{
		pd=new ProductServiceImpl();
		
}
    public ProductController() {
           }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String action=request.getServletPath();
	//String user=String.valueOf(request.getAttribute("user"));
	session=request.getSession();
	String username=request.getParameter("user");
	session.setAttribute("username",username);
	
	switch(action){
		case "/Product":
		try {
			
			
			
			pd.getAllProducts(request,response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				break;
				
		case "/new":
			pd.showAddForm(request,response);
			break;
			
		case "/add":
			pd.addProduct(request,response);
			break;
			
		case "/remove":
			pd.removeProduct(request, response);
			break;
		case "/view":
			pd.view(request,response);
			break;
		case "/cancel":
			pd.goBack(request,response);
			
		case "/inventory":
		try {
			pd.getInventory(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		
	}
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

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

/**
 * Servlet implementation class GrizzlyController
 */
//@WebServlet("/GrizzlyController")
public class GrizzlyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	LoginDAOImpl ldaoi;
    public GrizzlyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("unique");
		String action=request.getServletPath();
		switch(action)
		{
		case "/":
		{
			boolean val=false;
			System.out.println("we are here/.....");
			ldaoi=new LoginDAOImpl();
			ldaoi.showLoginForm(request, response);
			break;
		}
		default :
		{
			ldaoi=new LoginDAOImpl();
			ldaoi.showLoginForm(request, response);
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

package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.LoginDAOImpl;



public class GrizzlyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	LoginDAOImpl gd;

  
    	public void init() throws ServletException {
    
    		gd=new LoginDAOImpl();
    		
    	}

    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action=request.getServletPath();
		switch(action){
		
		
		case "logout":
			gd.logout(request, response);
			break;
		default:
			gd.showLoginForm(request, response);
			break;
		
		}
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

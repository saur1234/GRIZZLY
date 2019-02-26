package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.BookServiceimpl;

/**
 * Servlet implementation class BookController
 */
//@WebServlet("/BookController")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	BookServiceimpl bsi;
	public void init(ServletConfig config) throws ServletException
	{
		super.init();
		String url=config.getInitParameter("url");
		String user=config.getInitParameter("username");
		String password=config.getInitParameter("password");
		
		bsi=new BookServiceimpl(url,user,password);
		
		
	}
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action=request.getServletPath();
		/*ServletConfig config=getServletConfig();
		String myuser=config.getinitParameter("username");
		String mypass=config*/
		switch(action)
		{
		 case "/" :
			 try {
				bsi.getAllBooks(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		 case "/new":
			bsi.showaddform(request, response);
			break;
		 case "/edit":
				try {
					bsi.showeditform(request, response);
					}
					
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 break;
		 case "/update" :
			 bsi.updateBook(request, response);
			 break;
			 
	     default :
	    	 try {
					bsi.getAllBooks(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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

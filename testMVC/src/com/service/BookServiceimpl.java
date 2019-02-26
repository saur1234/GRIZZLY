package com.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.BookDAOImp;
import com.model.Book;



public class BookServiceimpl implements BookService{
	public BookServiceimpl() {
		super();
	}


	public BookServiceimpl(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
		bdi=new BookDAOImp(username,password,url);;
	}


	String url;
	String username;
	String password;
	BookDAOImp bdi;
	


	public void getAllBooks(HttpServletRequest request,HttpServletResponse response) throws SQLException, ServletException, IOException
	{
		List<Book> l=new ArrayList<Book>();
		
		l=bdi.listBooks();
	    HttpSession session=request.getSession();
	    session.setAttribute("booklist",l);
	  
	    RequestDispatcher rd=request.getRequestDispatcher("table.jsp");
	   	rd.forward(request, response);
		
		
	}
	public void updateBook(HttpServletRequest request,HttpServletResponse response) throws IOException
	{   int i=-2;
		int id=Integer.parseInt(request.getParameter("ID"));
		String title=request.getParameter("title");
        String author=request.getParameter("author");
	    int price=Integer.parseInt(request.getParameter("price"));
	    Book b=new Book(id,price,author,title);
	    try {
			    i=bdi.updateBook(b);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(i==1) System.out.println("\n Succesfully updated");
	    response.sendRedirect("fghfhf");
	    
	}
//public void UpdateBook
  public void showaddform(HttpServletRequest request, HttpServletResponse response)
  {
	  RequestDispatcher rd=request.getRequestDispatcher("addform.jsp");
	  try {
		rd.forward(request, response);
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public void showeditform(HttpServletRequest request,HttpServletResponse response) throws SQLException
  {
	  int id=Integer.parseInt(request.getParameter("id"));
	  Book existingBook=bdi.findBook(id);
	  RequestDispatcher dispatcher=request.getRequestDispatcher("addform.jsp");
	  request.setAttribute("book",existingBook);
	  try {
		dispatcher.forward(request, response);
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}

package com.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println();
		String username=request.getParameter("userid");
		String password=request.getParameter("password");
		PrintWriter pw=response.getWriter();
		/*String jdbcURL="jdbc:mysql://localhost:3306/bookstore?useSSL=false";
		String jdbcUsername="root";
		String jdbcPassword="root";
		userDAO u=new userDAO(jdbcUsername,jdbcPassword,jdbcURL);
		user m=null;
		try {
			u.connect();
			m=u.getuser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("sql exception");
			
		}
		if(m.userid.equals(username) && m.password.equals(password) )
		{
			pw.write("success");
		}
		else
			pw.write("failure");
		*/
	   /* ServletConfig config=getServletConfig();
	    Enumeration<String> c=config.getInitParameterNames();
	    String str1="";
	    String str2;
	    boolean flag=true;
	    while(c.hasMoreElements())
	    {
	    	str1=c.nextElement();
	    	str2=config.getInitParameter(str1);
	    	if(str1.equals("userid"))
	    		if(!str2.equals(username))
	    			flag=false;
	        if(str1.equals("password"))
	        	if(!str2.equals(password))
	        		flag=false;
	    	
	    }
		if(flag)
		{
    pw.write("success");
		}
			
		else 
			{
			
			
			pw.write("failure");
			
			
			}*/
		if(username.equals("cts") && password.equals(password))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Success Servlet");
			rd.forward(request,response);
		}
		else 
			pw.write("failure");
		
			
	}

}

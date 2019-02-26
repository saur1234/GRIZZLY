package com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAOImpl;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/ProductController")
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
	static int count=3;
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

	System.out.println("in dofilter");
	
		LoginDAOImpl lb=new LoginDAOImpl();
		String password=request.getParameter("password");
		String username=request.getParameter("username");
		boolean flag=false;
		try {
			flag=lb.validateUser(username, password);
			System.out.println("Flag : "+flag);
			if(flag==true)
			{
				chain.doFilter(request, response);
		
				
			}
			else
			{
				count--;
				if(count==0)
				{
					count=3;
					RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
				    rd.forward(request, response);
				    System.out.println(count);
			
				}
				else
				{
					PrintWriter pw=response.getWriter();
			        RequestDispatcher rd=request.getRequestDispatcher("login2.jsp");
			    	rd.include(request, response);
				    pw.write("<h3><font color= red>You entered wrong userid or password</font></h3>");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}

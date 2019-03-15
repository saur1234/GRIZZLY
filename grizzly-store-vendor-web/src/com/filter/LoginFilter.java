package com.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.dao.LoginDAOImpl;
import com.util.ConnectionManager;


@WebFilter("/Vendor")
public class LoginFilter implements Filter {
static int count=3;
  
    public LoginFilter() {
    
    }

	public void destroy() {
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	

		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
	
		LoginDAOImpl ld=new LoginDAOImpl();
		String user=request.getParameter("user");
		String pass=request.getParameter("password");
		boolean flag=false;
	
		try {
			flag=ld.validateUser(user, pass);
			if(flag==true){
				System.out.println("I am in!");
				chain.doFilter(request, response);
			}
			else{
				count--;
			if(count==0){
				count=3;
				ConnectionManager cm=new ConnectionManager();
				Connection con=cm.connect();
				String sql="update Vendor set status='locked' where user=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1,user);
				ps.executeUpdate();
				RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
					rd.include(request, response);
			}
			else{
				RequestDispatcher rd=request.getRequestDispatcher("/");
				rd.include(request, response);
			}
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
	

}

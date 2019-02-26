package com.dao;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.ConnectionManager;

public class LoginDAOImpl implements LoginDAO
{   
	ConnectionManager cm=new ConnectionManager();
	public void showLoginForm(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("we are in login form");
	RequestDispatcher rd=request.getRequestDispatcher("login2.jsp");
	
		try {
			rd.forward(request, response);
			
		} catch (IOException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public boolean validateUser(String username,String password) throws SQLException
	{
		
		String sql="select user,password from user where user=? and password=?" ;
		Connection con=cm.connect();
		System.out.println(con);
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		System.out.println(rs);
		boolean ans;
		if(rs.next())
		{
			ans=true;
		}
		else
			ans=false;
		return ans;
	}
}

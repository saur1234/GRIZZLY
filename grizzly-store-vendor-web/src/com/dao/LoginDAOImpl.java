package com.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.util.ConnectionManager;

public class LoginDAOImpl implements LoginDAO {
	ConnectionManager cn=null;
	public LoginDAOImpl() {
		
		// TODO Auto-generated constructor stub
		cn=new ConnectionManager();
	}

	@Override
	public void showLoginForm(HttpServletRequest request,HttpServletResponse response) {
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean validateUser(String user, String password) throws SQLException {
		String sql="select user,password from Vendor where (user=? and password=?) and status='active';";
			Connection con=cn.connect();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
		boolean row=false;
		if(rs.next()){
			row=true;
		}
		else{
			row=false;
		}
		return row;
	}

	@Override
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession(false);
		hs.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("front");
		try {
			rd.include(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}

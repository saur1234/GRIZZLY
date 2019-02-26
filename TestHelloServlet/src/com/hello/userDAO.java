package com.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hello.user;;

public class userDAO {
	
	Connection con;
	String jdbcUsername;
	String jdbcPassword;
	String jdbcURL;
	public userDAO(String jdbcUsername, String jdbcPassword, String jdbcURL) {
		super();
		
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
		this.jdbcURL = jdbcURL;
	}
	public void connect() throws SQLException
	{
		if(con==null||con.isClosed())
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(jdbcURL, jdbcUsername,jdbcPassword);
				System.out.println(con);
			}catch(ClassNotFoundException e)
			{
				throw new SQLException(e);
			}
		}
   }
	public user getuser() throws SQLException
	{
		
		String sql="Select userid,pass from book";
		connect();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		user b=new user();
		while(rs.next())
		{
			
			String userid=rs.getString(1);
			String password=rs.getString(2);
			
			b=new user(userid,password);
			
			System.out.println(b);
		}
		rs.close();
		return b;
	}
}

package com.util;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionManager 
{  
	Connection con=null;
	String jdbcURL;
	String jdbcUsername;
	String jdbcPassword;
	
	public ConnectionManager()
	{
jdbcURL="jdbc:mysql://localhost:3306/grizzlystore";
 jdbcUsername="root";
 jdbcPassword="root";
 System.out.println(jdbcURL+jdbcUsername+jdbcPassword);
	}
	public Connection connect() throws SQLException 
	{
		System.out.println("in connect:"+jdbcURL+jdbcUsername+jdbcPassword);
		if(con==null||con.isClosed())
		{
			System.out.println("hi");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		con=(Connection) DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
		System.out.println("con obj"+con);
	}
	return con;
	}
}

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	  String jdbcUrl="jdbc:mysql://localhost:3306/grizzlystore?useSSL=false";
	  String jdbcUser="root";
	  String jdbcPassword="root";
		Connection con=null;
	
	public ConnectionManager() {
			jdbcUrl="jdbc:mysql://localhost:3306/grizzlystore?useSSL=false";
			jdbcUser="root";
			jdbcPassword="root";
			}
	
	public Connection connect() throws SQLException{
	
		if(con==null || con.isClosed()){
			try{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(ClassNotFoundException e){
				throw new SQLException(e);
			}
			con=DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			
		}
		//System.out.println(con);
		return con;
	}
	
	public void disconnect() throws SQLException {
		// TODO Auto-generated method stub
		
		if(con!=null || !con.isClosed()){
			con.close();
		}
		
	}
	

}

package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.model.*;
import java.sql.Statement;

public class BookDAOImp implements BookDAO {
	
	Connection con;
	String jdbcUsername;
	String jdbcPassword;
	String jdbcURL;
	
	
	public BookDAOImp(String jdbcUsername, String jdbcPassword, String jdbcURL) {
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
	public List<Book> listBooks() throws SQLException
	{
		List<Book> li=new ArrayList<>();
		String sql="Select * from book";
		connect();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery(sql);
		while(rs.next())
		{
			int id=rs.getInt(1);
			String title=rs.getString(2);
			String author=rs.getString(3);
			int price=rs.getInt(4);
			Book b=new Book(id,price,author,title);
			li.add(b);
			System.out.println(b);
		}
		rs.close();
		return li;
	}
	public int insertBook(Book b) throws SQLException
	{
		String sql="insert into book(title,author,price) values(?,?,?)";
		connect();
		PreparedStatement p=con.prepareStatement(sql);
		p.setString(1,b.getTitle());
		p.setString(2,b.getAuthor());
		p.setInt(3,b.getPrice());
		
		
		int rowInserted=p.executeUpdate();
		p.close();
		return rowInserted;
	}
	public int deleteBook(int id) throws SQLException
	{
		String sql="delete from book where book_id=?";
		connect();
		PreparedStatement p=con.prepareStatement(sql);
		p.setInt(1,id);
		
		
		int rowDeleted=p.executeUpdate();
		p.close();
		return rowDeleted;
		
		
		
	}
	public int updateBook(Book b) throws SQLException
	{
		String sql="update book set price=?,author=?,title=? where book_id=?";
		connect();
		PreparedStatement p=con.prepareStatement(sql);
		p.setInt(1,b.getPrice());
		p.setString(2,b.getAuthor());
		p.setString(3,b.getTitle());
		p.setInt(4,b.getId());
		
		
		int rowUpdated=p.executeUpdate();
		p.close();
		return rowUpdated;
		
		
		
	}
	public Book findBook(int id) throws SQLException
	{
		Book b=null;
	String sql="SELECT * FROM book WHERE book_id=?";
	connect();
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, id);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		int id1=rs.getInt(1);
		String title=rs.getString(2);
		String author=rs.getString(3);
		int price=rs.getInt(4);
	 b=new Book(id1,price,author,title);
	}
		rs.close();
       ps.close();
      return b;
	}
	
	
		
		
		
		
		
		
	
	
	
		
		
		
		
		
	

	public BookDAOImp() {
		// TODO Auto-generated constructor stub
	}

}

package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.model.Product;
import com.mysql.jdbc.Connection;
import com.util.ConnectionManager;

public class ProductDAOImpl implements ProductDAO {
	ConnectionManager cm=new ConnectionManager();
	public List<Product> getAllProducts() throws SQLException{
    
	List<Product> p=new ArrayList<>();

		Connection c=cm.connect();
	String sql="Select * from product";
Statement statement=c.createStatement();
	ResultSet rs=statement.executeQuery(sql);
	while(rs.next())
	{
		int id=rs.getInt(1);
		String product_name=rs.getString(2);
		float price=rs.getFloat(3);
		String brand=rs.getString(4);
		String category=rs.getString(5);
		float rating=rs.getFloat(6);
	p.add(new Product(id,product_name,price,brand,category,rating));
}
	System.out.println(p);
	rs.close();
	return p;
}
	public int addProduct(Product p) throws SQLException
	{
		String sql="insert into product(product_name,price,brand,category,rating) values(?,?,?,?,?)";
		Connection c=cm.connect();
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setString(1,p.getName());
		ps.setFloat(2,p.getPrice());
		ps.setString(3,p.getBrand_name());
		ps.setString(4,p.getCategory());
		ps.setFloat(5,p.getRating());
		
		int rowInserted=ps.executeUpdate();
		ps.close();
		return rowInserted;
	}
	public int deleteProduct(Product p) throws SQLException
	{
		String sql="delete from product where id=?";
	Connection c=cm.connect();
		PreparedStatement ps=c.prepareStatement(sql);
		ps.setInt(1,p.getId());
		
		
		int rowDeleted=ps.executeUpdate();
		ps.close();
		return rowDeleted;
	}

}


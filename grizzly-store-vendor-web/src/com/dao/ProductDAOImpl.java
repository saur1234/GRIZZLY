package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Login;
import com.model.Product;
import com.util.ConnectionManager;

public class ProductDAOImpl implements ProductDAO {
	ConnectionManager cn;
	public ProductDAOImpl() {
		cn=new ConnectionManager();
	}
	@Override
	public List<Product> listProducts() throws SQLException {
	Connection con=cn.connect();
	List<Product> list=new ArrayList<Product>();

	String sql="select id,prodname,brand,category,offer from VendorProduct";
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next()){
		String id=rs.getString("id");
		String name=rs.getString("prodname");
		String brand=rs.getString("brand");
		String category=rs.getString("category");
		int offer=rs.getInt("offer");
		
		Product p=new Product(id,name,brand,category,offer);
		list.add(p);
	}
	rs.close();
	stmt.close();
	return list;
	
	}
	@Override
	public List<Product> listInventory(String user) throws SQLException {
	Connection con=cn.connect();
	List<Product> list=new ArrayList<Product>();

	String sql="select id,prodname,brand,category,offer,stock,req,buffer,rating,price from VendorProduct where user=?";
	PreparedStatement stmt=con.prepareStatement(sql);
	stmt.setString(1, user);
	ResultSet rs=stmt.executeQuery();
	while(rs.next()){
		String id=rs.getString("id");
		String name=rs.getString("prodname");
		String brand=rs.getString("brand");
		String category=rs.getString("category");
		int offer=rs.getInt("offer");
		int stock=rs.getInt("stock");
		int req=rs.getInt("req");
		int buffer=rs.getInt("buffer");
		float rating=rs.getFloat("rating");
		float price=rs.getFloat("price");
		
		Product p=new Product(id,name,brand,category,rating,price,stock,req,buffer,offer);
		list.add(p);
	}
	rs.close();
	stmt.close();
	return list;
	
	}
	@Override
	public int insertProduct(Product b) throws SQLException {
		String i,u;
		String c,n,br,d;
		int s,r,buf,o;
		float p;
		i=b.getPid();
		u=b.getUser();
		c=b.getCategory();
		n=b.getName();
		br=b.getBrand();
		s=b.getStock();
		r=b.getReq();
		buf=b.getBuffer();
		o=b.getOffer();
		p=b.getPrice();
		int rn=0;;
		String sql="insert into VendorProduct(user,id,prodname,category,brand,stock,req,buffer,price,offer) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		try{
		Connection con=cn.connect();
		ps=con.prepareStatement(sql);
		ps.setString(1, u);
		ps.setString(2, i);
		ps.setString(3, n);
		ps.setString(4, c);
		ps.setString(5, br);
		ps.setInt(6, s);
		ps.setInt(7, r);
		ps.setInt(8, buf);
		ps.setFloat(9, p);
		ps.setInt(10,o);
		rn=ps.executeUpdate();
		//System.out.println("Record inserted successfully..");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
		ps.close();
	cn.disconnect();
		}
		return rn;
	
	}
	

	
	public int deleteProduct(Product b) throws SQLException {
		// TODO Auto-generated method stub
		String id=b.getPid();
		Connection con=null;
		int rn=0;
		PreparedStatement ps=null;;
		
		try {
			con = cn.connect();
	
		String sql="Delete from VendorProduct where id=?";
	
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
		
		
		
			rn = ps.executeUpdate();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
				cn.disconnect();
				ps.close();
		}
		return rn;
	}
	@Override
	public Product viewProduct(Product b) throws SQLException{
		// TODO Auto-generated method stub
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Product p=null;
		try{
		Connection con=cn.connect();
		String id=b.getPid();
		
		String sql="select prodname,brand,offer,price,rating from VendorProduct where id=?";
		stmt=con.prepareStatement(sql);
		stmt.setString(1,id);
		rs=stmt.executeQuery();
		while(rs.next()){
				int desc=rs.getInt("offer");
			String name=rs.getString("prodname");
			String brand=rs.getString("brand");
			float price=rs.getFloat("price");
			float rating=rs.getFloat("rating");
			
			 p=new Product(name,brand,rating,price,desc);
		
		}}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
		rs.close();
		stmt.close();
		cn.disconnect();
		}
		return p;
		
	}

	
}

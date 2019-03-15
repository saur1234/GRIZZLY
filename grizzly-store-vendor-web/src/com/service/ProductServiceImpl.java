package com.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDAO;
import com.dao.LoginDAOImpl;
import com.dao.ProductDAO;
import com.dao.ProductDAOImpl;
import com.model.Login;
import com.model.Product;

public class ProductServiceImpl implements ProductService {
	
	ProductDAO pd;
	HttpSession session;
	 public ProductServiceImpl() {
		pd=new ProductDAOImpl();
	
	}


	@Override
	public List<Product> getAllProducts(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		//Login lc=pd.getUserDetails(request.getParameter("user"));
		
		//Product ss=new Product(request.getParameter("user"),0);
	
				List<Product> lp=new ArrayList<Product>();
				try {
					lp=pd.listProducts();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
				HttpSession session=request.getSession();
				session.setAttribute("username",request.getParameter("user"));
				//session.setAttribute("userList",lc);
				session.setAttribute("ListProducts", lp);
				RequestDispatcher rd=request.getRequestDispatcher("listProduct.jsp");
				try {
					rd.forward(request,response);
				} catch (ServletException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		return lp;
	}
	@Override
	public List<Product> getInventory(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		//Login lc=pd.getUserDetails(request.getParameter("user"));
		
		//Product ss=new Product(request.getParameter("user"),0);
		String user=(String)session.getAttribute("username");
				System.out.println(user);
				List<Product> lp=new ArrayList<Product>();
				try {
					lp=pd.listInventory(user);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
				//session.setAttribute("username",username);
				//session.setAttribute("userList",lc);
				session.setAttribute("ListInventory", lp);
				RequestDispatcher rd=request.getRequestDispatcher("inventory.jsp");
				try {
					rd.forward(request,response);
				} catch (ServletException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		
		return lp;
	}

	@Override
	public void showAddForm(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		RequestDispatcher rd=request.getRequestDispatcher("productForm.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	@Override
	public int addProduct(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String name,brand,category,description;
		String id;
		int stock,req,offer,buffer;
		float price;
		id=request.getParameter("id");
		name=request.getParameter("name");
		brand=request.getParameter("brand");
		category=request.getParameter("category");
		stock=Integer.parseInt(request.getParameter("stock"));
		req=Integer.parseInt(request.getParameter("req"));
		offer=Integer.parseInt(request.getParameter("offer"));

String user=request.getParameter("vendor");
		buffer=req+offer;
		price=Float.parseFloat(request.getParameter("price"));
		Product p1=new Product(id,user,name,brand,category,price,stock,req,buffer,offer);
		try {
			int a=pd.insertProduct(p1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	RequestDispatcher rd=request.getRequestDispatcher("/Product");
	try {
	rd.forward(request, response);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return 0;
	}


	@Override
	public int removeProduct(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		Product b3=new Product(id);
		try {
			pd.deleteProduct(b3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=request.getRequestDispatcher("/Product");
		try {
		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return 0;
	}


	@Override
	public void view(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	Product pp=new Product();
String id=request.getParameter("id");
	Product b3=new Product(id);
		try {
			pp=pd.viewProduct(b3);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		HttpSession session=request.getSession(false);
		session.setAttribute("View", pp);
		RequestDispatcher rd=request.getRequestDispatcher("ViewProduct.jsp");
		try {
			rd.forward(request,response);
		} catch (ServletException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		}


	@Override
	public void goBack(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd=request.getRequestDispatcher("/Product");
		try {
		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

		
	}

	




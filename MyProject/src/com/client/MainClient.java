package com.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.BookDAOImp;
import com.model.Book;

public class MainClient {

	
	public static void main(String[] args) throws SQLException
	{
		String jdbcURL="jdbc:mysql://localhost:3306/bookstore?useSSL=false";
		String jdbcUsername="root";
		String jdbcPassword="root";
		BookDAOImp b=new BookDAOImp(jdbcUsername,jdbcPassword,jdbcURL);
		b.connect();
		System.out.println(b.findBook(3));;
	
//		
//		b.listBooks();
//		Scanner sc=new Scanner(System.in);
//		int price;
//		String author;
//		String title;
//		System.out.println("Enter title : ");
//		title=sc.nextLine();
//		System.out.println("Enter author : ");
//		author=sc.nextLine();
//		System.out.println("Enter price : ");
//		price=sc.nextInt();
//		Book bo=new Book(price,author,title);
//		int status=b.insertBook(bo);
//		System.out.println(status + " rows entered succesfully...!!! ");
//		sc.close();
//		
//		if(b.deleteBook(1000)==1)
//		System.out.println("Succesfully deleted");
//		else 
//			System.out.println("deletion failed");
//		Book bo1=new Book(2,1000,"ab","cd");
//		System.out.println(b.updateBook(bo1)+" rows updated");
		
	}

}

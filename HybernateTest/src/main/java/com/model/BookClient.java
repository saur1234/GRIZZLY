package com.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.entity.Book;
import com.service.BookService;
import com.service.BookServiceImpl;
import com.util.HibernateUtil;

public class BookClient {
	public static void main(String args[]){
		BookService ob = new BookServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter your choice:1.Insert 2.Update 3.Fetch 4.Delete 5.List all Books 6.Exit:");
			int ch = sc.nextInt();
			if(ch==1){
				Book b;
				System.out.println("Enter details of the book:");
				System.out.println("Title:");
				sc.next();
				String title = sc.nextLine();
				System.out.println("Author:");
				String author = sc.nextLine();
				System.out.println("Price:");
				float price = sc.nextFloat();
				b = new Book(title,author,price);
				ob.addBook(b);
			}else if(ch==2){
				System.out.println("Enter id and price of the book:");
				int id = sc.nextInt();
				float price = sc.nextFloat();
				ob.updateBook(id, price);
			}else if(ch==3){
				System.out.println("Enter id of the book:");
				int id = sc.nextInt();
				ob.fetchBook(id);
			}else if(ch==4){
				System.out.println("Enter id of the book:");
				int id = sc.nextInt();
				ob.deleteBook(id);

			}else if(ch==5){
				ob.getAllBooks();
			}else if(ch==6)
				break;
			else{
				System.out.println("wrong choice");
			}	
		}
	}
}

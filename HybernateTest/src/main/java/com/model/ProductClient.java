package com.model;

import java.util.Scanner;

import com.entity.Book;
import com.entity.Product;
import com.service.BookService;
import com.service.BookServiceImpl;
import com.service.ProductService;
import com.service.ProductServiceImpl;

public class ProductClient {
	public static void main(String args[]){
		ProductService ob = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter your choice:1.Insert 2.Update 3.Fetch 4.Delete 5.List all Books 6.Exit:");
			int ch = sc.nextInt();
			if(ch==1){
				Product p;
				System.out.println("Enter details of the Product:");
				System.out.println("Name:");
				sc.next();
				String name = sc.nextLine();
				System.out.println("Brand:");
				String brand = sc.nextLine();
				System.out.println("Category:");
				String category = sc.nextLine();
				System.out.println("Rating:");
				float rating = sc.nextFloat();
				System.out.println("Price:");
				float price = sc.nextFloat();
				p = new Product(brand,name,category,price,rating);
				ob.addProduct(p);
			}else if(ch==2){
				System.out.println("Enter id and details of the Product:");
				System.out.println("Id:");
				int id = sc.nextInt();
				System.out.println("Name:");
				sc.next();
				String name = sc.nextLine();
				System.out.println("Brand:");
				String brand = sc.nextLine();
				System.out.println("Category:");
				String category = sc.nextLine();
				System.out.println("Rating:");
				float rating = sc.nextFloat();
				System.out.println("Price:");
				float price = sc.nextFloat();
				Product newProduct = new Product(brand,name,category,price,rating);
				ob.updateProduct(id, newProduct);
			}else if(ch==3){
				System.out.println("Enter id of the product:");
				int id = sc.nextInt();
				ob.fetchProduct(id);
			}else if(ch==4){
				System.out.println("Enter id of the book:");
				int id = sc.nextInt();
				ob.deleteProduct(id);

			}else if(ch==5){
				ob.getAllProduct();
			}else if(ch==6)
				break;
			else{
				System.out.println("wrong choice");
			}	
		}
	}

}

package com.model;

public class Product {
	String pid,user;
	String name,brand,category;
	float rating,price;
	int stock,req,buffer,offer;
	public Product(String pid, String name, String brand, String category, int offer) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.offer = offer;
	}

	public Product(String name, String brand, float rating, float price, int offer) {
		this.name = name;
		this.brand = brand;
		this.rating = rating;
		this.price = price;
		this.offer = offer;
	}
	public Product(String pid) {
	
		this.pid = pid;
	}
	public Product(String user,int offer) {
		this.user = user;
		this.offer=offer;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String pid, String user, String name, String brand, String category, float price, int stock, int req,
			int buffer, int offer) {
		this.pid = pid;
		this.user = user;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.req = req;
		this.buffer = buffer;
		this.offer = offer;
	}
	public Product(String pid, String name, String brand, String category, float rating, float price, int stock,
			int req, int buffer, int offer) {
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.rating = rating;
		this.price = price;
		this.stock = stock;
		this.req = req;
		this.buffer = buffer;
		this.offer = offer;
	}

	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getReq() {
		return req;
	}
	public void setReq(int req) {
		this.req = req;
	}
	public int getBuffer() {
		return buffer;
	}
	public void setBuffer(int buffer) {
		this.buffer = buffer;
	}
	public int getOffer() {
		return offer;
	}
	public void setOffer(int offer) {
		this.offer = offer;
	}   
	
	
}


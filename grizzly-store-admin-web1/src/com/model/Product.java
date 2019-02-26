package com.model;

public class Product {
	public Product(int id) {
		super();
		this.id = id;
	}
	int id;
	String name;
	float price;
	String brand_name;
	String category;
	float rating;
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand_name=" + brand_name
				+ ", category=" + category + ", rating=" + rating + "]";
	}
	public Product(int id, String name, float price, String brand_name, String category, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand_name = brand_name;
		this.category = category;
		this.rating = rating;
	}
	public Product(String name, float price, String brand_name, String category, float rating) {
		super();
		this.name = name;
		this.price = price;
		this.brand_name = brand_name;
		this.category = category;
		this.rating = rating;
	}
	public Product() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
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
	
}

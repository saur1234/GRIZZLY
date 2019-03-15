package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tab")
public class Product {
	@Override
	public String toString() {
		return "Product [id=" + id + ", brand=" + brand + ", name=" + name + ", category=" + category + ", price="
				+ price + ", rating=" + rating + "]";
	}

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="brand", length = 50)
	String brand;
	
	@Column(name="name")
	String name;

	@Column(name="category")
	String category;
	
	@Column(name="price")
	float price;
	
	@Column(name="rating")
	float rating;

	public Product(String brand, String name, String category, float price, float rating) {
		super();
		this.brand = brand;
		this.name = name;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Product(int id, String brand, String category, float price, float rating) {
		super();
		this.id = id;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.rating = rating;
	}

	public Product() {
		super();
	}
	
	
	

}

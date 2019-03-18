package com.cts.spring.entity;
import javax.persistence.*;



@Entity
@Table(name="product_tab")
public class Product {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="name",length=50)
	String name;
	
	@Column(name="category")
	String category;

	@Column(name="description")
	String description;
	
	@Column(name="brand")
	String brand;
	
	@Column(name="price")
	float price;
	
	@Column(name="rating")
	float rating;
	
	@Column(name="inStock")
	int inStock;
	
	@Column(name="requirement")
	int requirement;
	
		
	public int getInStock() {
		return inStock;
	}

	public void setInStock(int inStock) {
		this.inStock = inStock;
	}

	public int getRequirement() {
		return requirement;
	}

	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}

	public Product() {
		
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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


	public Product(String name, String category, String description, String brand, float price, float rating,
			int inStock, int requirement) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
		this.inStock = inStock;
		this.requirement = requirement;
	}

	public Product(int id, String name, String category, String description, String brand, float price, float rating,
			int inStock, int requirement) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
		this.inStock = inStock;
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description
				+ ", brand=" + brand + ", price=" + price + ", rating=" + rating + "]";
	}
	

}

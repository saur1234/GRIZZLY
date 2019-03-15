package com.hello;

public class Publisher {
	String name;
	String id;
	public Publisher(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Publisher() {
		super();
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", id=" + id + "]";
	}
	

}

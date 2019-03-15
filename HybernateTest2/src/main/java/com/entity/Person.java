package com.entity;

import javax.persistence.*;

@Entity
@Table(name="Person_Tab")
public class Person {
	@Id
	@Column(name="pid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	

	@Column(name="p_name", length = 50)
	String name;


	public Person() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}

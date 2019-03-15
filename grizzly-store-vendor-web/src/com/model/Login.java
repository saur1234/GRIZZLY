package com.model;

public class Login {
	String user,password,fullname,contact,address;

	public Login(String fullname, String contact, String address) {
	
		this.fullname = fullname;
		this.contact = contact;
		this.address = address;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Login(String user) {
		super();
		this.user = user;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String Contact) {
		this.contact = Contact;
	}

	public String getAddress () {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Login [user=" + user + ", password=" + password + ", fullname=" + fullname + ", contact="
				+ contact + ", address=" + address + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

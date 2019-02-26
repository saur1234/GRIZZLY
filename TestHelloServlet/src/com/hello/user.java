package com.hello;

public class user {
	public user(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	String userid;
	String password;

	public user() {
		// TODO Auto-generated constructor stub
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "user [userid=" + userid + ", password=" + password + "]";
	}

}

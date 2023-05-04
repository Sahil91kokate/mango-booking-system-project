package com.model;

public class admin {

	
	private int id;
	 private String username,password ;
	 
	 
	 
	 
	public admin(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}




	public admin() {
		super();
	}




	@Override
	public String toString() {
		return "admin [id=" + id + ", usernsme=" + username + ", password=" + password + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}
	
}

package com.model;

public class customer {
	private int id;
	private String name,moblie,address,email,password;
	
	public customer() {
		super();
	}
	public customer(int id, String name, String moblie, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.moblie = moblie;
		this.address = address;
		this.email =email ;
		this.password = password;
	}
	@Override
	public String toString() {
		return "customer [id=" + id + ", name=" + name + ", moblie=" + moblie + ", address=" + address + ", eamil="
				+ email + ", password=" + password + "]";
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
	public String getMoblie() {
		return moblie;
	}
	public void setMoblie(String moblie) {
		this.moblie = moblie;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}

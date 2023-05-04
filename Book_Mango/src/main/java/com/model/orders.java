package com.model;

public class orders {
private String Name;
private String email;
private int Pd_id;
private String address;
private float total;
private int dozen;
private String category;
private String o_date;
private String quality;
private int o_id;


public int getO_id() {
	return o_id;
}
public void setO_id(int o_id) {
	this.o_id = o_id;
}
public String getO_date() {
	return o_date;
}
public void setO_date(String o_date) {
	this.o_date = o_date;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPd_id() {
	return Pd_id;
}
public void setPd_id(int pd_id) {
	Pd_id = pd_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
public int getDozen() {
	return dozen;
}
public void setDozen(int dozen) {
	this.dozen = dozen;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getQuality() {
	return quality;
}
public void setQuality(String quality) {
	this.quality = quality;
}
public orders() {
	super();
}
public orders(String name, String email, int pd_id, String address, float total, int dozen, String category,
		String quality ,String o_date, int o_id) {
	super();
	Name = name;
	this.email = email;
	Pd_id = pd_id;
	this.address = address;
	this.total = total;
	this.dozen = dozen;
	this.category = category;
	this.quality = quality;
	this.o_date=o_date;
	this.o_id=o_id;
	
}

}

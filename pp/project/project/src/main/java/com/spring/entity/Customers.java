package com.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customers {

	@Id
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="EMAIL")
	private String email;
	
	private String fname;
	
	private String lname;
	
	private String phone;

	public Customers() {
		super();
	}

	public Customers(String email, String fname, String lname, String phone) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}

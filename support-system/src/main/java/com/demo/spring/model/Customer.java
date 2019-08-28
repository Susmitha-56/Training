package com.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "CUSTOMERS")
public class Customer {

	@Id
	@NotBlank(message = "Email is mandatory")
	@Column(name = "email")
	private String email;

	@NotBlank(message = "First Name is mandatory")
	@Column(name = "fname")
	private String firstName;
	
	@NotBlank(message = "Last Name is mandatory")
	@Column(name = "lname")
	private String lastName;

	@NotBlank(message = "Mobile number is mandatory")
	@Column(name = "mobile")
	private String mobile;

	public Customer() {
	}

	public Customer(String email, String firstName, String lastName, String mobile) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}

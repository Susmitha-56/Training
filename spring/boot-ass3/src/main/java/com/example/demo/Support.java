package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Support {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int Request_ID;
	private String email;
	private String software;
	private String os;
	private String prblm;
	public int getRequest_ID() {
		return Request_ID;
	}
	public void setRequest_ID(int request_ID) {
		
		Request_ID = request_ID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoftware() {
		return software;
	}
	public void setSoftware(String software) {
		this.software = software;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getPrblm() {
		return prblm;
	}
	public void setPrblm(String prblm) {
		this.prblm = prblm;
	}
	
}

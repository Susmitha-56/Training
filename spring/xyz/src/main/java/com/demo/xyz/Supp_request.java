package com.demo.xyz;

import javax.persistence.Entity;

@Entity
public class Supp_request {
	private String email;
	private String software;
	private String os;
	private String prblm;
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

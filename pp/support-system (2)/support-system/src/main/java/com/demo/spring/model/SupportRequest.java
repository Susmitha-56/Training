package com.demo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "SUPPORT_REQUESTS")
public class SupportRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="request_id")
	private int requestId;
	
	@Column(name="email")
	@NotBlank(message = "Email is mandatory")
	private String email;
	
	@Column(name = "os")
	private String OS;
	
	@Column(name = "software")
	private String software;
	
	@Column(name="problem")
	@NotBlank(message = "Description is mnadatory")
	private String problem;

	
	public SupportRequest() {
		
	}

	public SupportRequest(String email, String os, String software, String problem) {
		this.email = email;
		this.OS = os;
		this.software = software;
		this.problem = problem;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public String getSoftware() {
		return software;
	}

	public void setSoftware(String software) {
		this.software = software;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

}

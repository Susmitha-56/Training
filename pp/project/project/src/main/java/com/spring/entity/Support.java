package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SUPP_REQUESTS")
public class Support {

	@Id
	@Column(name = "REQUEST_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	@ManyToOne
	private String email;

	@Column
	private String software;

	@Column
	private String os;

	@Column
	private String problem;

	public Support() {
		super();
	}

	public Support(int id, String email, String software, String os, String problem) {
		super();
		this.id = id;
		this.email = email;
		this.software = software;
		this.os = os;
		this.problem = problem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

}

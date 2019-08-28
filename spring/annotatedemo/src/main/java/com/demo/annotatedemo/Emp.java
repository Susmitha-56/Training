package com.demo.annotatedemo;

import org.springframework.beans.factory.annotation.Value;

public class Emp {

	@Value("${mycmp}")
	private String cmp;
	@Value("${myname}")
	private String name;
	
	private int age;
	public Emp()
	{
		System.out.println("emp created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCmp() {
		return cmp;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", cmp=" + cmp + ", age=" + age + "]";
	}
	
}

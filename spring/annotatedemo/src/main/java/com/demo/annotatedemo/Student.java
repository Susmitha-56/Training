package com.demo.annotatedemo;


public class Student {

	private String name="susmitha";
	
	public Student()
	{
		System.out.println("student created");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
}

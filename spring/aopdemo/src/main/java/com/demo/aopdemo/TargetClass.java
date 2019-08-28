package com.demo.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class TargetClass {

	public void insert()
	{
		System.out.println("inserting records");
	}
	public void delete()
	{
		System.out.println("deleting records");
	}
	public void demo()
	{
		System.out.println("just for demo ");
	}
}

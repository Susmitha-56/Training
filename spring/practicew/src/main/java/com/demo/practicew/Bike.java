package com.demo.practicew;

public class Bike implements Vehicle{

	private int cost;
	private String name;
	public Bike(int cost,String name)
	{
		this.cost=cost;
		this.name=name;
	}
	public void start()
	{
		System.out.println("Bike started");
	}
	public void stop()
	{
		System.out.println("bike stopped");
	}
	public void display()
	{
		System.out.println("cost"  +cost+"\n"+"name :"+name);
	}
}

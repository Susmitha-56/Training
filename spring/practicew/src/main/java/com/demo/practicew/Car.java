package com.demo.practicew;

public class Car implements Vehicle{
	private int cost;
	private String name;
	public void start()
	{
		System.out.println("car started");
	}
	public void stop()
	{
		System.out.println("car stopped");
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("cost:"+cost);
		System.out.println("name:"+name);

	}
	
}


package com.demo.ass1;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private int age;
	private int salary;
	private String designation;
	
	public Employee(int salary, String designation)
	{
	System.out.println("emp");
		//getDetails();
		this.salary=salary;
		this.designation=designation;
	}
	public void getDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		this.name=sc.next();
		System.out.println("enter age");
		this.age=sc.nextInt();
		/*System.out.println("enter sal");
		this.salary=sc.nextInt();
		System.out.println("enter designation");
		this.designation=sc.next();*/
	}
	public  void raisesalary()
	{
		System.out.println("enter the amount to be raised  " +this.name+":");
		Scanner sc= new Scanner(System.in);
		int amount=sc.nextInt();
		this.salary=salary+amount;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}

}

package com.demo.ass2;


import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Employee {
	private String name;
	private int age;
	private int salary;
	private String designation;
	private void inputAge() {
		while(true)
		{
			try
			{
				int num = new Scanner(System.in).nextInt();
				if(num>=21 && num<=60)
				{
					this.age=num;
					break;
				}
				else
				{
					System.out.println("Enter age between 21 and 60");
				}
			}
			catch(Exception e)
			{
				System.out.println("Please Enter a Valid value");
			}
		}
	}
	
	public Employee(int salary, String designation)
	{
	System.out.println("emp");
		//getDetails();
		this.salary=salary;
		this.designation=designation;
		Helper.empc++;
		Helper.l.add(this);
	}
	public void getDetails()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		this.name=sc.next();
		
		Helper.inval.reademp();
	
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
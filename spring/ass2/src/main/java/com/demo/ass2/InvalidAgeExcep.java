package com.demo.ass2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidAgeExcep  extends RuntimeException{
	/*public InvalidAgeExcep()
	{
		super();
	}*/
	public InvalidAgeExcep(String s)
	{
		super(s);
	}
	public static int reademp()
	{
		int age=0;
		while(true)
		{
			try
			{
				System.out.print("enter age");
				age= new Scanner(System.in).nextInt();
				if(age<21 ||age>60)
					throw new InvalidAgeExcep("Enter correct age between 21 and 60 :");
				else
					return age;
			}
			catch(InputMismatchException e)
			{
				System.out.println("enter number: ");
			}
			catch(InvalidAgeExcep ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}

}

package com.demo.ass2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Menuemp
{
	public static void main(String args[])
	{
		int ch1=0,ch2=0,count=0;
		//ArrayList<Employee> list=new ArrayList<Employee>();
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

		
		do
		{
			System.out.println("*******Menu********");
			
			System.out.println("1 => Create");
			System.out.println("2 => Display");
			System.out.println("3 => Riase salary");
			System.out.println("4 => Exit");
			System.out.println("********************");
			System.out.println(".....Enter your option........");
			ch1=new Scanner(System.in).nextInt();
		
			switch(ch1)
			{
            case 1:
            	do {
            	System.out.println("********************");
        		System.out.println("1 => Clerk");
        		System.out.println("2 => Programmer");
        		System.out.println("3 => Manager");
        		System.out.println("4 => Exit");
        		System.out.println("********************");
        		System.out.println(".....Enter your option........");
        		ch2=new Scanner(System.in).nextInt();
        		
        		switch(ch2)
        		{
        		case 1:
        			context.getBean("clerk",Employee.class);
        			
        			break;
        		case 2:
        			context.getBean("prg",Employee.class);
        			
        			 break;
        		case 3:
        			context.getBean("manager",Employee.class);
        			
        			  break;
        		 default:
        	            System.out.println("Invalid Choice");
        	            break;
        		}
        		
            }while(ch2!=4);
            	break;
            case 2:
            System.out.println("Display the details ");
            Iterator<Employee> i1=Helper.l.iterator();
            while(i1.hasNext()) {
            	System.out.println(i1.next());
            }
            break;
            
            case 3:
            	Iterator<Employee> i2=Helper.l.iterator();
                while(i2.hasNext()) {
                i2.next().raisesalary();
                }
                break;

            case 4:
            System.exit(0);

            default:
            System.out.println("Invalid Choice");
            break;
        }
		
		
	}while(ch1!=4);
		System.out.println("count "+count);
	}
}

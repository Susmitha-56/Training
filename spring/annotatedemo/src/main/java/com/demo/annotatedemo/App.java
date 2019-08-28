package com.demo.annotatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	ApplicationContext context= new AnnotationConfigApplicationContext(MyBeanConfig.class);
    			Emp e1=(Emp)context.getBean("emp");
    			System.out.println(e1);
    			Person e2=(Person)context.getBean("p1");
    			System.out.println(e2);	
    			Person e3=(Person)context.getBean("p2");
    			System.out.println(e3);	
    
    			}
}

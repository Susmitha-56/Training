package com.demo.practicew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	Vehicle v=(Vehicle)context.getBean("v1");
        v.stop();
        v.start();
        v.display();
    	Vehicle v3=(Vehicle)context.getBean("v9");
    	 v3.stop();
         v3.start();
         v3.display();
    
    }
}

package com.demo.aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new AnnotationConfigApplicationContext(MyConfig.class);
        TargetClass obj= context.getBean(TargetClass.class);
        obj.demo();
        obj.insert();
        obj.delete();
    }
}

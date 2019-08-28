package com.demo.aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class SomeLogic {

	@Before("execution(public void demo())")
	//@After("execution(public void demo())")
	public void some()
	{
		System.out.println("my suggestion");
	}
	@Before("execution(public void *())")
	public void connect()
	{
		System.out.println("data connect");
	}
	@After("execution(public void *())")
	public void disconnect()
	{
		System.out.println("data disconnect");
	}
	@AfterReturning("execution(public void demo())")//after completion of method 
	public void notifytome()
	{
		System.out.println("notify to mobile");
	}
	
	@AfterThrowing("execution(public void demo())") 
	public void notifytomail()
	{
		System.out.println("notify to mail");
	}
	@After("execution(public void demo())") //once the logic part is completed it gets executed
	public void notifyt()
	{
		System.out.println("before returning out of method");
	}
	
	
}

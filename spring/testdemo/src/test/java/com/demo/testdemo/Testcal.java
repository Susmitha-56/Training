package com.demo.testdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testcal {

	Calc c1=new Calc();
	@Test
	public void xyz() {
		System.out.println("xyz");
		assertEquals(30,c1.add(10, 20) );
	}
	@Test
 public void mno() {
		System.out.println("mno");
		assertEquals(40,c1.sub(60, 20) );
		//assertEquals(40,c1.add(60, 20) );
		
	}
	@Test
	public void cng() {
		System.out.println("cng");
		//assertTrue(c1.equals(10, 20) );//fail
		assertTrue(c1.equals(10, 10) );//pass 
	}
	@Test
	public void cndg() {
		System.out.println("cndg");
		assertFalse(c1.equals(10, 20) );
		//assertFalse(c1.equals(10, 10) );
	}
	@Before
	public void something()
	{
		System.out.println("before");
	}
	@After
	public void afterevry()
	{
		System.out.println("after");
	}
	@BeforeClass
	public static void first()
	{

		System.out.println("before allllllllllllllllllllllllll");
	}
	@AfterClass
	public static void last()
	{

		System.out.println("after allllllllllllllllllllllllll");
	}

}

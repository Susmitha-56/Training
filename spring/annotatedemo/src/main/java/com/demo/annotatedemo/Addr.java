package com.demo.annotatedemo;



public class Addr {
	private String state="fsdf";
	private String city="punr";
	private int pin=1233;
	public Addr()
	{
		System.out.println("address");
	}
	@Override
	
	public String toString() {
		return "Addr [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}

}

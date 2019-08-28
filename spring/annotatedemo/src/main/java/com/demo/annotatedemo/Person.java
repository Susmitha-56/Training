package com.demo.annotatedemo;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("human")
@Scope("prototype")
public class Person {
	@Value("sdcdf")
	private String name;
	private int age;
	@Autowired
	@Qualifier("myaddr")
	private Addr addr;
	
	
	public Addr getAddr() {
		return addr;
	}
	public void setAddr(Addr addr) {
		this.addr = addr;
	}
	public Person()
	{
		System.out.println("person created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	

}
*/
public class Person {
	
	private String name;
	private int age;
	
	private Addr addr;
	
	
	public Addr getAddr() {
		return addr;
	}
	public void setAddr(Addr addr) {
		this.addr = addr;
	}
	public Person()
	{
		System.out.println("person created");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	

}
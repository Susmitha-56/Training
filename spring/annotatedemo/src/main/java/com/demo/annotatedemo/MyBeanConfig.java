package com.demo.annotatedemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;


@Configuration
@PropertySource("myres.properties")
//@ComponentScan(basePackages="com.demo.annotatedemo")
public class MyBeanConfig {
	Addr addr= new Addr();
		@Bean
		//@Bean("myemp")
		//@Bean(name="myemp") 
		//multiple names @Bean(name={"myemp","uremp"})
		public Emp emp()//emp has to be in app.java
		{	
			return new Emp();
		}
		@Bean(name= {"p1","p2"})//use p1 or p2 in getbean method
		@Scope("prototype")
		public Person p()
		{	
			//return new Person();
			Person p1=new Person();
			p1.setAddr(addr);
			return p1;
		}
		/*@Bean*/
		public Addr getAddress()
		{
			return new Addr();
		}
		
}

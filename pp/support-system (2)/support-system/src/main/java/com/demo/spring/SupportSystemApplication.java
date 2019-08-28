package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class SupportSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupportSystemApplication.class, args);
	}


	@Bean
	public DriverManagerDataSource dataSourXce() {
		DriverManagerDataSource  ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springpj");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
		
	}
	
}

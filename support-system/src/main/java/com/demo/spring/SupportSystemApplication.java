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
	
}

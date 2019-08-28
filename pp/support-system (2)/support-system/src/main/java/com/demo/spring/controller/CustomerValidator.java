package com.demo.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.spring.model.Customer;

@Component
public class CustomerValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.equals(Customer.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
	
		Customer c = (Customer)target;
		if(c.getEmail().isEmpty()) {
			errors.rejectValue("email", "invalidId" ,"Mail cannot be empty" );	
		}
		if(c.getMobile().isEmpty()) {
			errors.rejectValue("mobile", "invalidNumber" ,"Mobile number  cannot be empty" );	
		}
		if(c.getMobile().length() < 10) {
			errors.rejectValue("mobile", "invalidNumber" ,"Mobile number  can't be less than 10 characters" );	
		}
		
	}
}


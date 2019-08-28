package com.demo.spring.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.demo.spring.model.SupportRequest;

@Component
public class RequestFromValidator  implements Validator  {

	
	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.equals(SupportRequest.class);
	}

	
	@Override
	public void validate(Object target, Errors errors) {
		
		SupportRequest sr = (SupportRequest) target;
		
		if(sr.getEmail().isEmpty()) {
			errors.rejectValue("email", "invalidId" ,"Mail cannot be empty" );
		}
		if(sr.getProblem().length() <10) {
			errors.rejectValue("problem", "invalidDesc" ,"please descibe issue in least possilbe words" );
		}
		if(sr.getOS().isEmpty()) {
			errors.rejectValue("OS", "invalidOS" ,"Select an Operating system" );
		}
		if(sr.getSoftware().isEmpty()) {
			errors.rejectValue("software", "invalidSoftware" ,"Select an software" );
		}
	}
	
}

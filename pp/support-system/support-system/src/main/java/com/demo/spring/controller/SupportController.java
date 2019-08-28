package com.demo.spring.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.spring.model.Customer;
import com.demo.spring.model.SupportRequest;
import com.demo.spring.repository.CustRepository;
import com.demo.spring.repository.SupportRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class SupportController {

	@Autowired
	CustRepository cr;
	
	@Autowired
	SupportRepository sr;
	
	@Autowired
	CustomerValidator cv;
	
	@Autowired
	RequestFromValidator rv;
	
	@RequestMapping(path = "register" , method = RequestMethod.GET)
	public String getFirstPage(Model model) {
		Customer c = new Customer();
		model.addAttribute("customer" , c);
		return "customer";
	}
	
	@RequestMapping(path = "/register" , method = RequestMethod.POST)
	public ModelAndView processForm(@Valid Customer c , BindingResult result) {
		ModelAndView mv = new ModelAndView();
		cv.validate(c, result);
		if(result.hasErrors()) {
			mv.setViewName("customer");
			return mv;
		}
		if(cr.existsById(c.getEmail())) {
			mv.addObject("errorMessage", "Email already registered");
			mv.setViewName("error");
		} else {
			cr.save(c);
			mv.setViewName("success");
			ObjectMapper om = new ObjectMapper();
			Map m = om.convertValue(c, Map.class);
			mv.addAllObjects(m);
			mv.addObject("successMessage", "Registration Successful!, You can raise a request now!");
			mv.addObject("navigateToRequest", true);
		}
//		mv.addObject("name" , e.getName());
		return mv;
	}
	
	@RequestMapping(path = "request" , method = RequestMethod.GET)
	public String getRequestPage(Model model) {
		SupportRequest sr = new SupportRequest();
		model.addAttribute("supportRequest" , sr);
		return "SupportRequest";
	}
	
	@RequestMapping(path = "/request" , method = RequestMethod.POST)
	public ModelAndView processRequest(@Valid SupportRequest s ,  BindingResult result) {
		
		ModelAndView mv = new ModelAndView();
		rv.validate(s, result);
		if(result.hasErrors()) {
				mv.setViewName("SupportRequest");
				return mv;
		}
		if(cr.existsById(s.getEmail())) {
			sr.save(s);
			mv.setViewName("success");
			ObjectMapper om = new ObjectMapper();
			Map m = om.convertValue(s, Map.class);
			mv.addAllObjects(m);			
			mv.addObject("successMessage", "Request recorded. Will try to resolve within 3 days");
//			mv.addObject("userData" , cr.findById(s.getEmail()).));
		} else {
			mv.addObject("errorMessage", "Email not registered ,can't process request");
			mv.setViewName("error");
		}
//		mv.addObject("name" , e.getName());
		return mv;
	}
}

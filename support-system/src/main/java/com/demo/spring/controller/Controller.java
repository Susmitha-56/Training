package com.demo.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring.model.Customer;
import com.demo.spring.repository.CustRepository;
import com.demo.spring.repository.SupportRepository;

@RestController
@RequestMapping(value="/customer")
public class Controller 
{
	@Autowired
	CustRepository cr;
	
	@Autowired
	SupportRepository sr;
	
	@GetMapping
	public List<Customer> list()
	{
		return cr.findAll();
	}
	
	@PostMapping
	public void create(@RequestBody Customer customer)
	{
		cr.save(customer);
	}
	
	@GetMapping("/{customerEmail}")
	public Customer get(@PathVariable("customerEmail")String mail)
	{
		return cr.getOne(mail);
	}
	
	@PostMapping("/{customerEmail}")
	public String delete(@PathVariable("customerEmail")String mail)
	{
		cr.delete(cr.getOne(mail));
		return "Customer Deleted";
	}
}

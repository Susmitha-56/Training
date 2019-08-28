package com.dbs.springmvcapp.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dbs.springmvcapp.model.Employee;
import com.dbs.springmvcapp.service.EmployeeService;

@Controller
@RequestMapping("/users")
public class EmployeeController
{

	@Autowired
	private EmployeeService employeeService;
    @GetMapping(value = "/login")
    public String login(Model model){
        System.out.println("Came inside the login method ");

        return "login";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam("username")String username, @RequestParam("password") String password,Model model)
    {
    	String flag= "Invalid UserName/Password";
        System.out.println("Inside the POST method of login user");
        System.out.println("Username is "+username + " password is "+ password);
        if(username.equalsIgnoreCase(password))
        {
        	model.addAttribute("user", username);
        	return "success";
        }
        else
        {
        model.addAttribute("failure", flag);
        return "login";
        }
    }
    @GetMapping(value= "/listAll")
    public String listAllEmployees(Model model)
    {
        List<String> employees = Arrays.asList("Vinay","Suresh");
        //this.employeeService.listAll();
        model.addAttribute("employees", employees);
        return "list";

    }
    
    @GetMapping(value= "/Register")
    public String showRegistrationForm(Model model) 
    {
    	model.addAttribute("employee",new Employee());
    	return "Register";
    }
    
    @PostMapping(value="/Register")
    public String userRegistration(@NotNull @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
    	
    	System.out.println(employee);
    	System.out.println("Entered User Registration");
    	if(bindingResult.hasErrors())
    	{
    		System.out.println("Having Errors");
    		return "Register";
    	}
    	else
    	{
    		System.out.println("Records saved");
    	this.employeeService.saveEmployee(employee);
    	return "success";
    	}
    }
    
}

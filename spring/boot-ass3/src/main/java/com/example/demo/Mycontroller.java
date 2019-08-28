package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {

	@Autowired
	SupportDao sdao;
	
	@Autowired
	CustomerDao cdao;
	@Autowired
	private HttpServletRequest req;
	
	@RequestMapping("/")
	public String register()
	{
		
		return "welcome.jsp";
	}
	
	@RequestMapping("/check")
	public String support(Support support)
	{
		
			sdao.save(support);
			return "register.jsp";

	}
	@RequestMapping("/add")

	public String insert(Customer customer)
	{
		
		cdao.save(customer);
		HttpServletRequest req = null;
		String FirstName = req.getParameter("fname");
		String LastName = req.getParameter("lname");
		
		HttpSession session = req.getSession();
    	session.setAttribute("FirstName", FirstName);
    	session.setAttribute("LastName", LastName);

		return "Confirm.jsp";
	}
	

}

	
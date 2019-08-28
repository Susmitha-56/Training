package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Support;

@Controller
public class SupportController {

	@Autowired
	SupportRepository sr;
	
	public String getFirstPage(Model model)
	{
		Support s = new Support();
		model.addAttribute("index",s);
		return "index";
	}
	
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public ModelAndView processForm(@ModelAttribute("index")Support s)
	{
		ModelAndView mv = new ModelAndView();
		if(sr.findAll(s.getEmail()))
		{
			
		}
		/*if (sr.existsById(sr.getEmpId())) {
			mv.setViewName("error");
		} else {
			repo.save(e);
			mv.setViewName("response");
			mv.addObject("name", e.getName());
		}*/
		return mv;
	}
}

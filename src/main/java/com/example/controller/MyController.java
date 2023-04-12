package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		
		System.out.println("Going to inside handler");
		return "about";
	}

}

package com.SpringProjOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorld {

	@RequestMapping("/welcome")
	
	
	public ModelAndView helloWorld(){
		
		String msg = "<br>this is a message from controller";
		
		return new ModelAndView("welcome", "message", msg);
	}
}

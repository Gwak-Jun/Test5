package com.gura.test5;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	


	@RequestMapping("/home")
	public String HomeController() {

		return "home";
	}
	
}

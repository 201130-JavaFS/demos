package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
@CrossOrigin //This will act as a CORS filter, allowing all requests if no attributes 
//are provided. You can specify specific origins.
public class HomeController {

	@GetMapping
	public String home() {
		return "home";
	}
}

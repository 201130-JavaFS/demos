package com.revature.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return ResponseEntity.status(200).body("Hello Spring Boot! Wow that was easy.");
	}

}

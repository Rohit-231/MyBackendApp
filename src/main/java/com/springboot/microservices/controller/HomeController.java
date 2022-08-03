package com.springboot.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String GetHomepage() {
		return "Hello World: Homepage";
	}
	
	@GetMapping("/hello")
	public String GetHello() {
		return "Hello World: inside My App";
	}
	
	@GetMapping("/cloud")
	public String GetCloud() {
		return "Hello Cloud: inside My App";
	}

}

package com.example.demo.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	
	
	@GetMapping("/sayhello")
	public String sayHello() {
		System.out.println("Request received");
		return "Hello World";
	}
}

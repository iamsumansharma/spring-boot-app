package com.test.akaash.testApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Test....");
		return "Welcome to Akaash Cloud!!!!!";
	}
}

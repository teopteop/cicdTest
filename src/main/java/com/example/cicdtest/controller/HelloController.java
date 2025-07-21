package com.example.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hi")
	public String hi() {
		return "hi";
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}

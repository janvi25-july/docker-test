package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping("/Read")
	public String getMessage() {
		return "hellow world";
	

	}
}

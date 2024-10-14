package com.ust.secure.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
	@GetMapping("/")
	public String welcome() {
		return "Welcome to UST@Trivandrum";
	}
	
}

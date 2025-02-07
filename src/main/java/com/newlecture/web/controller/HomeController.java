package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "이규호 home 경로이다.jasper설치";
	}	
	
	@GetMapping("/index")
	public String asdf() {
		return "이규호 index 경로이다.jasper설치";
	}
}

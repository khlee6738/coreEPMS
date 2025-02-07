package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		@GetMapping("/index")
		public String asdf() {
			return "이규호 화면이다.1111111";
		}
}

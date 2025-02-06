package com.newlecture.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
		@RequestMapping("/index")
		public String asdf() {
			return "이규호 화면이다.";
		}
}

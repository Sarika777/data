package com.ojas.homepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyhomeController {
	@RequestMapping("/hello")
  
	public String sayHello() {
		return "Index";
	}
}

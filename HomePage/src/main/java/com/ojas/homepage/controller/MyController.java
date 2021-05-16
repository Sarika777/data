package com.ojas.homepage.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/dispDate")
	public String greet(@RequestParam(name="user",required= false)String user, ModelMap  model) {
		if(user==null)
			model.put("user", "guest");
			else
				model.put("use", user);
		model.put("now", LocalDateTime.now().toString());
		return user;
		
		
	}
	
}

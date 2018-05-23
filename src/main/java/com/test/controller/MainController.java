package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class MainController {
	
	@Value("${page-index-welcome}")
	private String indexWelcome;
	
	@RequestMapping("/index")
	public String hello(ModelMap map) {
		System.out.println("======"+indexWelcome);
		map.put("msg", indexWelcome);
		return "index";
		
	}
	
	@RequestMapping("/helloWorld")
	@ResponseBody
	public String hello() {
		return "helloWorld";
		
	}
	
}

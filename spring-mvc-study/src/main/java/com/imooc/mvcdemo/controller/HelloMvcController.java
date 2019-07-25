package com.imooc.mvcdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloMvcController {
	
	@RequestMapping("/mvc")
	public String helloMvc() {
		
		return "home";
	}

}

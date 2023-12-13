package com.Alohcmute.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/login.html")
	public String home(){
		return "login";
	}
	
	@RequestMapping("/register.html")
	public String register(){
		return "register";
	}
	
	@RequestMapping("/post.html")
	public String post(){
		return "post";
	}
	@RequestMapping("/index.html")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/profile.html")
	public String profile(){
		return "profile";
	}
	
	@RequestMapping("/edit_profile.html")
	public String edit_profile(){
		return "edit_profile";
	}
}

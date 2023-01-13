package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.User;
import com.demo.service.service1;

@Controller
public class my_controller {
	
	@Autowired
	private service1 my_Service;
	
	@GetMapping("/register")
	public String  method1() {
		my_Service.startProcess();
		return "register";
	}

	@PostMapping("/adduser")
	public void   method2(@ModelAttribute("user") User user,ModelMap model) {
		my_Service.addinguser(user);
		
	}
}
	
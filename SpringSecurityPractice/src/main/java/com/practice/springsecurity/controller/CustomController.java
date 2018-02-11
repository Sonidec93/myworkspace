package com.practice.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomController {

	@RequestMapping("/")
	public String goToHomePage() {

		return "home";
	}

	@RequestMapping("/leaders")
	public String showLeaderInfo() {

		return "leader";
	}
}

package com.practice.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormVersionTwo")
	public String processFormInCaps(HttpServletRequest request, Model model) {

		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("message", name);
		return "helloworld";
	}

	@RequestMapping("/processFromVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String name, Model model) {

		model.addAttribute("studentName", name);
		return "helloworld";
	}
}

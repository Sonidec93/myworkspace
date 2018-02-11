package com.practice.springmvc.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.springmvc.entity.Customer;
import com.practice.springmvc.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostConstruct
	public void initialize() {

	}

	@GetMapping("/list")
	// by default browser will send get request
	public String showList(Model model) {

		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "show-list";
	}

	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		System.out.println(theCustomer.getId());
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@GetMapping("/updateCustomer")
	public String updateCustomer(@RequestParam("customerId") int customerId,
			Model model) {

		Customer customer = customerService.getCustomer(customerId);

		model.addAttribute("customer", customer);
		return "customer-form";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId")int customerId){
		
		customerService.deleteCustomer(customerId);
		return "redirect:/customer/list";
	}
}

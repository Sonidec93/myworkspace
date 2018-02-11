package com.practice.springaspect.service;

import org.springframework.stereotype.Component;

@Component
public class FortuneService {

	public String getFortune() {
		return "Have a great day";
	}

	public String getFortune(Boolean trip) {
		if (trip) {
			return "Have a nice day";
		} else {
			throw new RuntimeException("Error in fortune service");
		}
	}
}

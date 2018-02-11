package com.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketCoach implements Coach {

	private HappyFortune fortuneService;

	@Autowired
	public void settingFortuneService(HappyFortune fortuneService) {
		System.out
				.println("Setting values using a randm function in cricket class");
		this.fortuneService = fortuneService;
	}

	public HappyFortune getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Fielding for 30 mins";
	}

	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}

package com.practice.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {
	@Autowired
	private HappyFortune fortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub

		return "Practice keeping the ball in air";
	}

	public String getDailyFortune() {
		System.out
				.println("injecting field directly using autowired annotations");
		return fortuneService.getFortune();
	}

}

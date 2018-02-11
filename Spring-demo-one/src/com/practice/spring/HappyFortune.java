package com.practice.spring;

import java.util.Random;

public class HappyFortune implements FortuneService {

	private final String[] fortunes = { "You will havea great day",
			"Today will be awesome day", "Tough day so be tough" };

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Have a great day";
	}

	public String getRandomDailyFortune() {
		Random random = new Random();
		int x = random.nextInt(fortunes.length);

		return fortunes[x];
	}
}

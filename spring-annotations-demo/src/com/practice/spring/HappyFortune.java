package com.practice.spring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	private final String[] fortunes = { "Awesome day", "Bad Day", "Lucky day" };

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub

		Random random = new Random();
		int value = random.nextInt(fortunes.length);
		return fortunes[value];
	}

}

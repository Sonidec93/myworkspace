package com.practice.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
//@ComponentScan("com.practice.spring")
public class SportConfig {

	@Bean
	public FortuneService getFortuneService() {
		return new SadFortune();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(getFortuneService());
	}
}

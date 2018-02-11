package com.practice.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// if we don't mention the bean id explicitly it will use the default bean id
// which is same as the class name with camel casing
@Scope("prototype")
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${email}")
	private String email;
	@Value("${name}")
	private String name;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public BaseballCoach(
			@Qualifier("databaseFortuneService") FortuneService fortuneService) {

		this.fortuneService = fortuneService;
	}

	@PostConstruct
	public void afterExecution() {
		System.out.println("After execution");
	}

	@PreDestroy
	public void beforeDestroy() {
		System.out.println("Clean up code");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice batting for 30 minutes";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

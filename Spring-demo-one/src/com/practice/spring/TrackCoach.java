package com.practice.spring;

public class TrackCoach implements Coach {

	private HappyFortune FortuneService;
	private String emailAddress;
	private String name;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside email setter method");
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("inside name setter method");
		this.name = name;
	}

	public void setFortuneService(HappyFortune fortuneService) {
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getDailyFortune();
	}

	public String getRandomFortune() {
		return FortuneService.getRandomDailyFortune();
	}

	public void doMyStartupStuff() {
		System.out.println("Initialization stuff");
	}

	public void doMyCleanUp() {
		System.out.println("Cleaning up stuff");
	}
}

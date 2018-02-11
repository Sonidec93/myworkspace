package com.practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String arg[]) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		BaseballCoach coach = context.getBean("baseballCoach",
				BaseballCoach.class);

		TennisCoach tennisCoach = context.getBean("thatSillyCoach",
				TennisCoach.class);

		CricketCoach cricketCoach = context.getBean("cricket",
				CricketCoach.class);
		CricketCoach cricketCoach2 = context.getBean("cricket",
				CricketCoach.class);

		VolleyBallCoach volleyBallCoach = context.getBean("volleyBallCoach",
				VolleyBallCoach.class);

		System.out.println(volleyBallCoach.getDailyFortune());
		System.out.println(cricketCoach2.getDailyFortune());
		System.out.println(cricketCoach.getDailyFortune());

		System.out.println(cricketCoach.getFortuneService() == cricketCoach2
				.getFortuneService());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getName());
		context.close();
	}
}

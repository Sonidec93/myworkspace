package com.practice.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedApp {

	public static void main(String arg[]) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SportConfig.class);

		// BaseballCoach coach = context.getBean("baseballCoach",
		// BaseballCoach.class);
		//
		// TennisCoach tennisCoach = context.getBean("thatSillyCoach",
		// TennisCoach.class);
		//
		// CricketCoach cricketCoach = context.getBean("cricket",
		// CricketCoach.class);
		// CricketCoach cricketCoach2 = context.getBean("cricket",
		// CricketCoach.class);
		//
		// VolleyBallCoach volleyBallCoach = context.getBean("volleyBallCoach",
		// VolleyBallCoach.class);
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(swimCoach.getEmail());
		System.out.println(swimCoach.getName());
		// System.out.println(swimCoach.getDailyFortune());
		// System.out.println(volleyBallCoach.getDailyFortune());
		// System.out.println(cricketCoach2.getDailyFortune());
		// System.out.println(cricketCoach.getDailyFortune());
		//
		// System.out.println(cricketCoach.getFortuneService() == cricketCoach2
		// .getFortuneService());
		// System.out.println(tennisCoach.getDailyFortune());
		// System.out.println(coach.getDailyWorkout());
		// System.out.println(coach.getDailyFortune());
		// System.out.println(coach.getEmail());
		// System.out.println(coach.getName());
		context.close();
	}
}

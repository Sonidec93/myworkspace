package com.practice.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String arg[]) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		TrackCoach trackCoach = (TrackCoach) applicationContext.getBean(
				"Track", Coach.class);
		TrackCoach trackCoach2 = (TrackCoach) applicationContext
				.getBean("Track");

		System.out.println(trackCoach == trackCoach2);// By default the scope of
														// the bean is singleton
														// we can mention the
														// scope as an attribute
														// to prototype which
														// means that every time
														// a new instance will
														// be created

		// Important point to note-destroy callback methods are not called for
		// prototype scoped bean class as the spring container hands over the
		// prototype scoped bean class to they only have to take care about
		// these beans
		System.out.println(trackCoach.getEmailAddress());
		System.out.println(trackCoach.getName());
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(trackCoach.getRandomFortune());
		System.out.println(trackCoach.getFortune());
		applicationContext.close();
	}
}

package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoClass {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getLotto());
		//call out new methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.age());
		TrackCoach dupanietrener = context.getBean("myCoach", TrackCoach.class);
		boolean value = (theCoach.getFortuneService() == dupanietrener.getFortuneService());
		System.out.println("this is true? " + value);
		boolean value2 = (theCoach.getFortuneService() == dupanietrener.getFortuneService());
		System.out.println("fortuna service " + value2);
		
		//close the context
		context.close();
	}

}

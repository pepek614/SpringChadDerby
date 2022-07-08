package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach" , Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach" , Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nbouth objects are the same " + result);
		System.out.println("\nMemory location of theCoach" + theCoach);
		System.out.println("\nMemory location of alphaCoach" + alphaCoach);
		
		//close contextaaa
		context.close();
	}

}

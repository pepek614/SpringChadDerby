package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//define default constructor
	
	public TennisCoach() {
		System.out.println("Tenniscoach constructor");
	}
	/*
	//define a setter method
	@Autowired
	public void dosomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("inside doSomeCrazyStuff");
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	*/
	@Override
	public String getDailyWorkout() {
		return "Practise your backhand voley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
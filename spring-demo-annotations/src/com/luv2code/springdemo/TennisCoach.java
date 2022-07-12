package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
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
	
	//define my init method
	@PostConstruct
	public void doMyStartStuff() {
		System.out.println("domystart method");
	}
	
	@PreDestroy
	public void domyCleanUpStuff() {
		System.out.println("domyclean method");
	}
	//define my destroy method
	
	
	/*
	//define a setter method
	@Autowired
	public void dosomeCrazyStuff(@Qualifier("Danzel")FortuneService fortuneService) {
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
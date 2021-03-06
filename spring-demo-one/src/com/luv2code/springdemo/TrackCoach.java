package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it! " + fortuneService.getFortune();
	}
	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 45;
	}
	//add an init method
	public void doMyStartupsStuff() {
		System.out.println("Trackcoach: inside doMyStartupsStuff method");
	}
	//add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("Trackcoach: inside doMyCleanUpStuff method");
	}
}

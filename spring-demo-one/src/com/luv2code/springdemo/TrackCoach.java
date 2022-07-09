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
		System.out.println("hello, you just open age() method in TrackCoach class");
		return 45;
	}
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

}

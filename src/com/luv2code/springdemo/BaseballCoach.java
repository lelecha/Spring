package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneserviece to get a fortune
		return fortuneService.getFortune();
	}
	
	
}

package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

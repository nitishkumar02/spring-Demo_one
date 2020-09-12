package com.kunitish.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "run a hard 5k";
	}
	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
	
	/*
	 * 1.create an init method
	 * 2.create a destroy method
	 */
	public void doMyStartupStuff()
	{
		System.out.println("Startup Stuff");
	}
	public void doMyCleanupStuff()
	{
		System.out.println("Closing Stuff");
	}

}

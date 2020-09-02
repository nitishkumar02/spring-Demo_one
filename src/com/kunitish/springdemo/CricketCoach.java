package com.kunitish.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	public CricketCoach()
	{
		System.out.println("Inside No Arg Constructor");
	}
	
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println("Setting the Constructor");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() 
	{
		return "Do batting practice for two hours";
	}

	@Override
	public String getDailyFortune() 
	{
		
		return fortuneService.getFortune();
	}
	
}

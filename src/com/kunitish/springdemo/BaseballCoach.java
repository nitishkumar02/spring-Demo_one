package com.kunitish.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	/*
	 * Helper Object known as Dependency
	 * here FortuneService is Helper object
	 */
	public BaseballCoach(FortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}

	public String getDailyWorkout()
	{
		return "do daily workout";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
}

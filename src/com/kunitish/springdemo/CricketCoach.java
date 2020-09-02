package com.kunitish.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	private String email;
	private String name;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside Set Email:CricketCoach");
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Inside Set Name:CricketCoach");
		this.name = name;
	}

	
	
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

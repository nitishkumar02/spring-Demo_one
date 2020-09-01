package com.kunitish.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today Is Your Lucky Day";
	}

}

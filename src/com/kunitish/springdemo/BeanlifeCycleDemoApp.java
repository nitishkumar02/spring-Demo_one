package com.kunitish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanlifeCycleDemoApp {

	public static void main(String[] args) {
		/*
		 * 1. load the spring configuration file
		 * 2.retrieve the bean
		 * 3.call the method
		 * 4.close the context
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		
	}

}

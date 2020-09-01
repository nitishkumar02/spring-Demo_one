package com.kunitish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		/*
		 *  1.load the spring config file
		 *  2.retrive the bean from container
		 *  3.call methos on bean
		 *  4.close the context
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		/*
		 * fullay assembled object after dependency injection
		 */
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
		
		

	}

}

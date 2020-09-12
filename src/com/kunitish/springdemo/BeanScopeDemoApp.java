package com.kunitish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		/*
		 * 1. load the spring configuration file
		 * 2.retrieve the bean
		 * 3.call the method
		 * 4.close the context
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach aplphaCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.hashCode());
		
		System.out.println(aplphaCoach.hashCode());
		
		

	}

}

package com.mypackge.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApp {
	public static void main(String[] args) {
		
		// 1. Create the Spring Container and
		// load the Spring Container Java Configuration Class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// 2. Retrieve the Bean from the Spring Container
		Coach coach = context.getBean("theCoach", Coach.class);
		Coach coach2 = context.getBean("theCoach", Coach.class);
				
		// 3. Calling two of the Bean's methods
		// and printing the returned value to the Console
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		
		boolean coachesMemoryAddressComparison = (coach==coach2);
		System.out.println("\nDo coach and coach2 objects share the same memory address? \n"
		+ coachesMemoryAddressComparison);
		
		// 4. Closing the Spring Container
		context.close();
	}
}

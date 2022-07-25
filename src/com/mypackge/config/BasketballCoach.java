// Field Dependency Injection with Java Annotations example
	// IMPORTANT: Always try to stay away from Field Dependency Injection, 
	// unless it's absolutely required 
	// Instead, use Setter or Constructor Dependency Injection

package com.mypackge.config;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
	
	// The Dependency

	private FortuneService fortuneService;
	
	// Constructor
	public BasketballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice dribbling the ball";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}

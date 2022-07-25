package com.mypackge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.mypackge.config")
public class SportConfig {
	
	// Defining a Bean for the SadFortuneService class
	@Bean
	public FortuneService theFortune() {
		return new SadFortuneService();
	}
	
	// Defining a Bean for the BasketballCoach class
	// and performing Constructor Injection
	@Bean
	@Scope("prototype")
	public Coach theCoach() {
		return new BasketballCoach(theFortune());
	}
}

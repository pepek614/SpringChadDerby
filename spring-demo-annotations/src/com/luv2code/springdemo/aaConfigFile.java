package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class aaConfigFile {
	@Bean
	public FortuneService dupa() {
		return new DatabaseFortuneService();
	}
	@Bean
	public Coach baseballCoach() {
		BaseballCoach tadzio = new BaseballCoach(dupa()); 
		
		return tadzio;
	}
}

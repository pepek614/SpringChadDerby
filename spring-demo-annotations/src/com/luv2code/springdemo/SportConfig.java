package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:Lucky.Numbers")
public class SportConfig {
	
	//define bean for sad fortune service
	@Bean
	public FortuneService danzel() {
		return new Danzel();
	}
	
	//define bean for our swim coach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(danzel());
	}
	
}

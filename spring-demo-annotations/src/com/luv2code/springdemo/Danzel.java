package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Danzel implements FortuneService {
	
	@Value ("${app.lucky.numbers}")
	int[] abba;
	
@PostConstruct
public String getFortune() {
	Random random = new Random();
	int index = random.nextInt(abba.length);
	return "It's your lucky number: " + abba[index];
}
}


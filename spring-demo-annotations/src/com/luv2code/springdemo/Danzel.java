package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Danzel implements FortuneService {
	
	@Value ("${app.lucky.numbers}")
	private int[] numbers;
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(numbers.length);
		String fortuneWord = "Your lucky number is " + numbers[index];
		return fortuneWord;
	}

	/*
	public String geDailyWorkout() {
		// TODO Auto-generated method stub
		return "Don't you know pump it up? You got to pump it up!";
	}
	*/
	

}

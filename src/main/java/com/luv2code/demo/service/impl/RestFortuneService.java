package com.luv2code.demo.service.impl;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.luv2code.demo.service.FortuneService;

@Component
public class RestFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
				
		String theFortune = data[index];
				
		return theFortune;
	}

}

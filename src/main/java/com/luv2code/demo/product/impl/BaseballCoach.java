package com.luv2code.demo.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.luv2code.demo.product.Coach;
import com.luv2code.demo.service.FortuneService;

@Component
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}
	
	@Autowired
	@Qualifier("restFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

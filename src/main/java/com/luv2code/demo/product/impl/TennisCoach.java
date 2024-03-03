package com.luv2code.demo.product.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.demo.product.Coach;
import com.luv2code.demo.service.FortuneService;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	// Field Inject
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

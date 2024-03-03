package com.luv2code.demo.product.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.luv2code.demo.product.Coach;
import com.luv2code.demo.service.FortuneService;

@Component
@Scope("singleton")
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
		
	// Constructor Inject , but Autowired unnecessary you can put or not it's up to you
	public SwimCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

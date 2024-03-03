package com.luv2code.demo.service.impl;

import org.springframework.stereotype.Component;

import com.luv2code.demo.service.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Hello Every Body , Today Is Lucky!";
	}

}

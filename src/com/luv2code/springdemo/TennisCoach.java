package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("Inside TennisCoach Constructor no-args");
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside setFortuneService Method");
//		this.fortuneService = fortuneService;
//	}

	public void doMyStartupStuff() {
		System.out.println("Init Method");
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice your handball volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

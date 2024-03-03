package com.luv2code.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luv2code.demo.product.impl.BaseballCoach;
import com.luv2code.demo.product.impl.SwimCoach;
import com.luv2code.demo.product.impl.TennisCoach;

@SpringBootApplication
public class DemoApplication {

	private final static Logger LOGGER =
			LoggerFactory.getLogger(DemoApplication.class);
	
	
	public static void main(String[] args) {
		var context =  SpringApplication.run(DemoApplication.class, args);
		
		LOGGER.info("\n");
		
		LOGGER.info("Show Injection By Field");
		
		TennisCoach tennisCoach1 = (TennisCoach) context.getBean("tennisCoach");
		
		LOGGER.info(tennisCoach1.getDailyWorkout());
		LOGGER.info(tennisCoach1.getDailyFortune());
		
		LOGGER.info("\n");
		
		LOGGER.info("Show Injection By Constructor");
		
		SwimCoach swimCoach1 =  (SwimCoach) context.getBean("swimCoach");
		
		LOGGER.info(swimCoach1.getDailyWorkout());
		LOGGER.info(swimCoach1.getDailyFortune());
		
		LOGGER.info("\n");
		
		LOGGER.info("Show Injection By Setter");
		
        BaseballCoach baseBallCoach =  (BaseballCoach) context.getBean("baseballCoach");
		
		LOGGER.info(baseBallCoach.getDailyWorkout());
		LOGGER.info(baseBallCoach.getDailyFortune());
		
        LOGGER.info("\n");
		
		LOGGER.info("Show Difference Between Bean Scope ---> (Singleton , Prototype)");
		
        TennisCoach tennisCoach2 = (TennisCoach) context.getBean("tennisCoach");
        
	    boolean resultPrototype = (tennisCoach1 == tennisCoach2);
	    
	    LOGGER.info("Show Result Of Prototype Scope - " + resultPrototype);
	    
        SwimCoach swimCoach2 =  (SwimCoach) context.getBean("swimCoach");
		
        boolean resultSingleton = (swimCoach1 == swimCoach2);
	    
	    LOGGER.info("Show Result Of Singleton Scope - " + resultSingleton);
		
	}

}

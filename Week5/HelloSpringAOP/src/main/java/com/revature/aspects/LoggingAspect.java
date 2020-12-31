package com.revature.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.revature.models.Avenger;

@Component
@Aspect
public class LoggingAspect {
	
	private static Logger log = LogManager.getLogger(LoggingAspect.class);
	
	@Before("within(com.revature.models.*)")
	public void logModelMethods(JoinPoint jp) {
		log.info(jp.getTarget() + "invoked " + jp.getSignature());
	}
	
	@AfterReturning(pointcut="execution(String fight(..))", returning="returnedObject")
	public void logFight(JoinPoint jp, Object returnedObject) {
		log.info(jp.getTarget()+" invoked "+jp.getSignature()+" returning "+returnedObject);
	}

	@AfterThrowing(pointcut="execution(String fight(..))", throwing="ex")
	public void logFightException(JoinPoint jp, Exception ex) {
		log.warn(jp.getTarget()+" invoked "+jp.getSignature()+" throwing "+ex.getClass(), ex);
	}
	
	@Around("execution(String fight(..))")
	public String logException(ProceedingJoinPoint pjp) throws Throwable {
		Avenger a = (Avenger) pjp.getArgs()[0];
		log.info(a.getAveName()+" is about to throw down!");
		double distance = (double) pjp.getArgs()[2];
		if(distance<6) {
			log.warn(a.getAveName()+" is violating proper social distancing; so much for being a hero. :(");
			return "woops nothing here.";
		}else {
			String s = (String) pjp.proceed();//this will actually allow the fight method to run. 
			log.info("I am happening after the fight");
			return s;
		}
	}
	
	
	
}

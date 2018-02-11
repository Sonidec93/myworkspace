package com.practice.springmvc.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private Logger logger = Logger.getLogger(getClass().getName());

	@Pointcut("execution(* com.practice.springmvc.dao.*.*(..))")
	public void DAOmethods() {
	}

	@Pointcut("execution(* com.practice.springmvc.entity.*.*(..))")
	public void entityMethods() {
	}

	@Pointcut("execution(* com.practice.springmvc.service.*.*(..))")
	public void serviceMethods() {
	}

	@Pointcut("execution(* com.practice.springmvc.controller.*.*(..))")
	public void controllerMethods() {
	}

	@Pointcut("DAOmethods()||entityMethods()||serviceMethods()||controllerMethods()")
	public void allMethods() {
	}

	@Before("allMethods()")
	public void beforeMethods(JoinPoint joinPoint) {

		Signature signature = joinPoint.getSignature();

		logger.info("@Before " + signature.toShortString());

		for (Object a : joinPoint.getArgs()) {
			logger.info("@Before " + a.toString());
		}
	}

	@AfterReturning(pointcut = "allMethods()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		Signature signature = joinPoint.getSignature();

		logger.info("@AfterReturning " + signature.toShortString());

		for (Object a : joinPoint.getArgs()) {
			logger.info("@AfterReturning " + a.toString());
		}
		if(result!=null)
		logger.info(result.toString());

	}
}
package com.practice.springaspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class LoggingAspect {

	@Before("com.practice.springaspect.aspect.PointcutAspectFactory.forDAOPackage()")
	public void beforeLogging(JoinPoint joinPoint) {

		Signature signature = joinPoint.getSignature();
		System.out.println(signature.toShortString());
		for (Object arg : joinPoint.getArgs()) {
			System.out.println(arg);
		}
		System.out.println("==>Logging functionality");
	}

	@After("com.practice.springaspect.aspect.PointcutAspectFactory.forDAOPackage()")
	// after executes after the finally block whether exception occurs or not
	public void afterFinally(JoinPoint joinPoint) {
		Signature signature = joinPoint.getSignature();
		System.out.println("@After execution" + signature.toShortString());

	}

	@AfterReturning(pointcut = "execution(* com.practice.springaspect.dao.*.get*(..))", returning = "result")
	public void afterReturningExample(String result) {
		System.out.println("returned value: " + result);
	}

	@AfterThrowing(pointcut = "execution(* com.practice.springaspect.dao.*.*(..))", throwing = "excep")
	public void afterThrowingExample(JoinPoint joinPoint, Throwable excep)
			throws Throwable {

		Signature signature = joinPoint.getSignature();
		System.out.println(signature.toShortString());

		System.out.println("Exception occured:" + excep.getMessage());
		throw excep;
	}

	@Around("execution(* com.practice.springaspect.service.*.*(..))")
	public Object getFortune(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {

		Object result = null;
		Long start = System.currentTimeMillis();
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception exception) {
			result = "fortune service error";
		}
		Long end = System.currentTimeMillis();

		System.out.println("@After  Duration==>" + ((end - start) / 1000.0));

		return result;
	}

}

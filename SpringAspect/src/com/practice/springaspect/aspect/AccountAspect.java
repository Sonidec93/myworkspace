package com.practice.springaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {

	@Before("execution(public void addAccount())")
	// Pointcut expression
	public void beforeAddAccount() {
		System.out.println("==>excuting before method invokation");
	}

	@Before("execution(* com.practice.springaspect.dao.*.*(..))")
	public void matchingAllFunctionInDAO() {
		System.out.println("==>>executing code before every method in dao layer");
	}
}

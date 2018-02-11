package com.practice.springaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {

	@Pointcut("execution(* com.practice.springaspect.dao.*.*(..))")
	public void forDAOPackage() {
	}

	@Before("forDAOPackage()")
	public void doSomething() {
		System.out.println("==>executing some stuff");
	}

	@Before("forDAOPackage()")
	public void sillyFunction() {
		System.out.println("==>executing some more stuff");
	}

}

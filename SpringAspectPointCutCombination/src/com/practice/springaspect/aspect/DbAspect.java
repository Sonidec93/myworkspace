package com.practice.springaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DbAspect {

	@Before("com.practice.springaspect.aspect.PointcutAspectFactory.forDAOPackage()")
	public void beforeDB() {
		System.out.println("==>DB functionality");
	}

}

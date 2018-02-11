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

	@Pointcut("execution(* com.practice.springaspect.dao.*.get*(..))")
	public void getMethods() {
	}

	@Pointcut("execution(* com.practice.springaspect.dao.*.set*(..))")
	public void setMethods() {
	}

	@Pointcut("forDAOPackage() && !(getMethods()||setMethods())")
	public void excludingGetterSetter() {
	}

	@Before("getMethods()")
	public void beforeGetter() {
		System.out.println("==>executing before getter methods");
	}

	@Before("setMethods()")
	public void beforeSetter() {
		System.out.println("==>executing before setter methods");
	}

	@Before("excludingGetterSetter()")
	public void combiningPointcuts() {
		System.out.println("Performing stuff without getter and setterF");
	}
}

package com.practice.springaspect.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutAspectFactory {

	@Pointcut("execution(* com.practice.springaspect.dao.*.*(..))")
	public void forDAOPackage() {
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

}

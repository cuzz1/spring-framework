package com.cuzz.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class CuzzAspect {

	@Pointcut("within(com.cuzz.aop.Person)")
	public void point() {

	}

	@Before("point()")
	public void log() {
		System.out.println("before...");

	}
}

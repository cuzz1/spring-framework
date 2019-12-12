package com.cuzz.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/11 15:35
 */
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

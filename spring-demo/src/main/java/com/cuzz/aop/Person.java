package com.cuzz.aop;

import org.springframework.stereotype.Component;

@Component
public class Person implements Singer {
	public Person() {
		System.out.println("init Person...");
	}

	public void say() {
		System.out.println("Hello World!");
	}

	@Override
	public void singing() {
		System.out.println("singing...");
	}
}

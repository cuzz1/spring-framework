package com.cuzz.ioc;

import org.springframework.stereotype.Component;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/6 14:29
 */
@Component
public class Person implements Singer{
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

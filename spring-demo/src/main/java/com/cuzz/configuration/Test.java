package com.cuzz.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig bean = applicationContext.getBean(AppConfig.class);

	}
}

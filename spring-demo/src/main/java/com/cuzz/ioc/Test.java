package com.cuzz.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/6 14:29
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}

		 Singer bean = (Singer) applicationContext.getBean("person");
		 bean.singing();
		// Singer bean = applicationContext.getBean(Singer.class);
		// bean.singing();


	}
}

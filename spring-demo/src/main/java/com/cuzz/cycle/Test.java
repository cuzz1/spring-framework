package com.cuzz.cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/6 14:29
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.getBean(UserService.class).getIndexService();

	}
}

package com.cuzz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // 用来保证 bean 的作用域
public class AppConfig {

	@Bean
	public Y y() {
		return new Y();
	}

	@Bean
	public X x() {
		y();
		return new X();
	}


}

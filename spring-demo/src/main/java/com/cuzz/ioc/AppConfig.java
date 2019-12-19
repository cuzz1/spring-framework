package com.cuzz.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.cuzz.ioc"})
public class AppConfig {

	@Bean
	public Car getCar() {
		return new Car();
	}
}

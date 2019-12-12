package com.cuzz.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/9 10:25
 */
@Configuration
@ComponentScan(value = {"com.cuzz.ioc"})
public class AppConfig {

	@Bean
	public Car getCar() {
		return new Car();
	}
}

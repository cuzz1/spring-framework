package com.cuzz.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author cuzz@douyu.tv
 * @date 2019/12/9 10:25
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = {"com.cuzz.aop"})
public class AppConfig {


}

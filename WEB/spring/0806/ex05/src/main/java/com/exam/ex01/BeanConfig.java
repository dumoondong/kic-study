package com.exam.ex01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	
	@Bean
	public HelloBean1 helloBean1() {
		return new HelloBean1();
	}
	
	@Bean
	@Scope("prototype")
	public HelloBean2 helloBean2() {
		return new HelloBean2();
	}
	
	@Bean("helloBean")
	@Scope("prototype")
	public HelloBean2 helloBean3() {
		return new HelloBean2();
	}
}

package com.exam.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {
	@Bean
	public HelloBean2 helloBean2() {
		return new HelloBean2();
		
	}
}

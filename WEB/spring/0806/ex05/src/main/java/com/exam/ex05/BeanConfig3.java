package com.exam.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig3 {
	@Bean
	public HelloBean3 helloBean3() {
		return new HelloBean3();
		
	}
}

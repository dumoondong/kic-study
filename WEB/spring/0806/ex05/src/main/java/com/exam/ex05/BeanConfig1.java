package com.exam.ex05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({BeanConfig2.class,BeanConfig3.class})
public class BeanConfig1 {
	@Bean
	public HelloBean1 helloBean1() {
		return new HelloBean1();
		
	}
}

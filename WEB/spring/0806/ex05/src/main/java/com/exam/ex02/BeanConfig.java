package com.exam.ex02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exam.ex01.HelloBean1;

@Configuration
public class BeanConfig {
	
	@Bean
	public HelloBean helloBean1(){
		return new HelloBean();
	}
	
	@Bean
	public HelloBean helloBean2(){
		return new HelloBean("박문수");
	}
}

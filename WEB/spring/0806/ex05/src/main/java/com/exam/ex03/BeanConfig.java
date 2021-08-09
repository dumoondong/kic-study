package com.exam.ex03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public BoardTO boardTO() {
		BoardTO to = new BoardTO();
		to.setSeq(1);
		to.setSubject("제목1");
		return to;
	}
}

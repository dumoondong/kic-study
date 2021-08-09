package com.exam.ex04;

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
	@Bean
	public WriteAction writeAction() {
		WriteAction action = new WriteAction();
		action.setTo(boardTO());
		return action;
	}
}

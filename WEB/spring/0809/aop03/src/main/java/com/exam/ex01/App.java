package com.exam.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex01/context.xml");
		
		BoardAction action = (BoardAction)ctx.getBean("action");
		action.execute();
		
		ctx.close();
	}

}

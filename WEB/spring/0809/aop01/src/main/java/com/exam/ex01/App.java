package com.exam.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex01/context.xml");
		
		//BoardAction action = (BoardAction)ctx.getBean("action");
		BoardAction action = (BoardAction)ctx.getBean("proxy");
		
		System.out.println("전처리");
		action.execute();
		System.out.println("후처리");
		
		ctx.close();
	}

}

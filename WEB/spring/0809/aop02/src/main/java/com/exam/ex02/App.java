package com.exam.ex02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex02/context.xml");
		
		BoardAction action1 = (BoardAction)ctx.getBean("action1");
		action1.execute();
		
		ctx.close();
	}

}

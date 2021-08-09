package com.exam.ex04;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex04/context.xml");
		
		WriteAction action1 = (WriteAction)ctx.getBean("action3");
		action1.execute();
		
		ctx.close();
	}

}

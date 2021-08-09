package com.exam.ex03;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.exam.model2.BoardAction;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex03/context.xml");
		
		BoardAction action = (BoardAction)ctx.getBean("action");
		action.execute();
		
		ctx.close();
	}

}

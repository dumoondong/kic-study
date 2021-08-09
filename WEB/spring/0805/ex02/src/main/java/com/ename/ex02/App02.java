package com.ename.ex02;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/ename/ex02/context.xml");
		
		BoardTO to = (BoardTO)ctx.getBean("to");
		
		System.out.println(to.getSeq());
		System.out.println(to.getSubject());
		
		ctx.close();
	}

}

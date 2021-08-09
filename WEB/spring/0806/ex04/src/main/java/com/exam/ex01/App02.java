package com.exam.ex01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex01/context.xml");
		
		BoardListTO listTO = (BoardListTO)ctx.getBean("listTO");
		
		for(String user : listTO.getUserList()) {
			System.out.println(user);
		}
		
		for(BoardTO to : listTO.getBoardList()) {
			System.out.println(to.getSeq());
			System.out.println(to.getSubject());
		}
		
		ctx.close();
	}

}

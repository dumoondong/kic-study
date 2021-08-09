package com.exam.ex03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		BoardTO to = (BoardTO)ctx.getBean("boardTO");
		System.out.println(to.getSeq());
		System.out.println(to.getSubject());
		
		ctx.close();
	}

}

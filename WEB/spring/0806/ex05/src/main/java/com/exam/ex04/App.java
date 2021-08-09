package com.exam.ex04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		WriteAction boAction = (WriteAction)ctx.getBean("writeAction");
		boAction.execute();
		
		ctx.close();
	}

}

package com.exam.ex02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		//HelloBean helloBean1 = (HelloBean)ctx.getBean("helloBean1");
		HelloBean helloBean1 = ctx.getBean("helloBean1", HelloBean.class);
		HelloBean helloBean2 = (HelloBean)ctx.getBean("helloBean2");
		
		helloBean1.sayHello();
		helloBean2.sayHello();
		
		ctx.close();
	}

}

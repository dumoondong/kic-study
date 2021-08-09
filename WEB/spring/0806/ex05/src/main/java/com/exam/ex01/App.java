package com.exam.ex01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx
		= new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
		helloBean1.sayHello("홍길동");
		
		Hello hello = (Hello)ctx.getBean("helloBean1");
		hello.sayHello("박문수");
		
		HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean2.sayHello("임꺽정 1 : " + helloBean2);
		
		HelloBean2 helloBean3 = (HelloBean2)ctx.getBean("helloBean2");
		helloBean3.sayHello("임꺽정 2 : " + helloBean3);
		
		//HelloBean2 helloBean4 = (HelloBean2)ctx.getBean("helloBean3");
		HelloBean2 helloBean4 = (HelloBean2)ctx.getBean("helloBean");
		helloBean4.sayHello("임꺽정 3 : " + helloBean4);
		
		ctx.close();
	}

}

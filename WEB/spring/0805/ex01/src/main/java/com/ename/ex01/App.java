package com.ename.ex01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		GenericApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/ename/ex01/context.xml");
		
		Hello hello = (Hello)ctx.getBean("helloBean1");
		hello.sayHello("홍길동");
		
		hello = (Hello)ctx.getBean("helloBean2");
		hello.sayHello("박문수");
		
		ctx.close();
    }
}

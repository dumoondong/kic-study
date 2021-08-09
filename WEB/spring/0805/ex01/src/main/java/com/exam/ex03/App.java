package com.exam.ex03;

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
		= new GenericXmlApplicationContext("classpath:com/exam/ex03/context.xml");
		
		Hello hello = (Hello)ctx.getBean("helloBean3");
		//Hello hello1 = (Hello)ctx.getBean("helloBean2");
		System.out.println(hello);
		hello.sayHello();
		
		ctx.close();
    }
}

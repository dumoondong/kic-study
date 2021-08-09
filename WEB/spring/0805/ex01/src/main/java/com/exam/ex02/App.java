package com.exam.ex02;

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
		= new GenericXmlApplicationContext("classpath:com/exam/ex02/context.xml");
		
		Hello hello31 = (Hello)ctx.getBean("helloBean3");
		Hello hello32 = (Hello)ctx.getBean("helloBean3");
		
		//참조주소
		System.out.println(hello31);
		System.out.println(hello32);
		
		Hello hello21 = (Hello)ctx.getBean("helloBean2");
		Hello hello22 = (Hello)ctx.getBean("helloBean2");
		
		//참조주소
		System.out.println(hello21);
		System.out.println(hello22);
		
		Hello hello11 = (Hello)ctx.getBean("helloBean1");
		Hello hello12 = (Hello)ctx.getBean("helloBean1");
		
		//참조주소
		System.out.println(hello11);
		System.out.println(hello12);
		
		ctx.close();
    }
}

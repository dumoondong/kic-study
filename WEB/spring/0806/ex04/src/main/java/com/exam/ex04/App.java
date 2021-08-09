package com.exam.ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		GenericXmlApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:com/exam/ex04/context.xml");
		
		BoardAction action = (BoardAction)ctx.getBean("action");
		action.execute();
		
		ctx.close();
    	
    }
}

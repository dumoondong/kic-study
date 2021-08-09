package com.exam.ex05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //AnnotationConfigApplicationContext ctx
       //= new AnnotationConfigApplicationContext(BeanConfig1.class,BeanConfig2.class);
       
       AnnotationConfigApplicationContext ctx
       = new AnnotationConfigApplicationContext(BeanConfig1.class);
       
       HelloBean1 helloBean1 = (HelloBean1)ctx.getBean("helloBean1");
       helloBean1.sayHello("홍길동");
       
       HelloBean2 helloBean2 = (HelloBean2)ctx.getBean("helloBean2");
       helloBean2.sayHello("홍길동");
       
       HelloBean3 helloBean3 = (HelloBean3)ctx.getBean("helloBean3");
       helloBean3.sayHello("홍길동");
       ctx.close();
    }
}

package spring2;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericApplicationContext ctx
		= new GenericXmlApplicationContext("classpath:spring2/context.xml");
		
		Hello hello = (Hello)ctx.getBean("helloBean1");
		hello.sayHello("홍길동");
		
		hello = (Hello)ctx.getBean("helloBean2");
		hello.sayHello("박문수");
		
		ctx.close();
	}

}

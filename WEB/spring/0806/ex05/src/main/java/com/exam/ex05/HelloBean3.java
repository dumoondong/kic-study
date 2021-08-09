package com.exam.ex05;

public class HelloBean3 implements Hello {
	public HelloBean3() {
		// TODO Auto-generated constructor stub
		System.out.println("HelloBean3() 호출");
	}
	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hi " + name );
	}

}

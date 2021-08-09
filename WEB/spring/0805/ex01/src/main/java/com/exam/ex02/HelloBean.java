package com.exam.ex02;

public class HelloBean implements Hello {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "님 안녕하세요");
	}

}

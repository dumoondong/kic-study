package com.exam.ex02;

public class HelloBean {
	private String name;
	
	public HelloBean() {
		// TODO Auto-generated constructor stub
		this.name = "홍길동";
		System.out.println("HelloBean() 호출");
	}
	
	public HelloBean(String name) {
		this.name = name;
		System.out.println("HelloBean(String name) 호출");
	}
	
	public void sayHello() {
		System.out.println(name + "님 안녕하세요");
	}
}

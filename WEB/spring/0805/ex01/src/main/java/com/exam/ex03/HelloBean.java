package com.exam.ex03;

public class HelloBean implements Hello {
	private String name;
	//디폴트 생성자
	public HelloBean() {
		// TODO Auto-generated constructor stub
		this.name = "박문수";
		System.out.println("HellogBean() 호출");
	}
	
	public HelloBean(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		System.out.println("HellogBean(String name) 호출");
	}
	
	public HelloBean(String firstname, String lastname) {
		// TODO Auto-generated constructor stub
		this.name = lastname + firstname;
		System.out.println("HellogBean(String firstname, String lastname) 호출");
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "님 안녕하세요");
	}

}

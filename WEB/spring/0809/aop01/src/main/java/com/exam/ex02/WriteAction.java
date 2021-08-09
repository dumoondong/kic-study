package com.exam.ex02;

public class WriteAction implements BoardAction{
	private String writer;
	
	public WriteAction() {
		// TODO Auto-generated constructor stub
		this.writer = "홍길동";
		System.out.println("WriterAction() 호출");
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
		System.out.println("setWriter(String writer) 호출");
	}
	
	@Override
	public void execute() {
		System.out.println("execute() 시작");
		System.out.println("Hello " + writer);
		System.out.println("execute() 끝");
	}
}

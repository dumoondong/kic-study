package com.exam.ex04;

public class WriteAction {
	private BoardTO to;
	
	public WriteAction() {
		// TODO Auto-generated constructor stub
		this.to = new BoardTO();
		System.out.println("WriteAction()");
	}
	
	public WriteAction(BoardTO to) {
		this.to = to;
		System.out.println("WriteAction(BoardTO to)");
	}
	
	public WriteAction(BoardTO to, String writer) {
		this.to = to;
		System.out.println("WriteAction(BoardTO to, String writer)");
	}
	
	public void execute() {
		System.out.println("execute() : " + to);
	}
}

package com.exam.ex03;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardTO to = new BoardTO();
		to.setSeq(1);
		to.setSubject("제목");
		
		WriteAction writeAction = new WriteAction();
		writeAction.setTo(to);
		
		writeAction.execute();
	}

}

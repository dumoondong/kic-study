package com.exam.ex04;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//디폴트 생성자
		WriteAction writeAction1 = new WriteAction();
		writeAction1.execute();
		
		//오버로딩된 생정자
		BoardTO to = new BoardTO();
		WriteAction writeAction2 = new WriteAction(to);
		writeAction2.execute();
	}

}

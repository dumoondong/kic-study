package com.exam.ex01;

import java.util.ArrayList;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 초기화를 위한 데이터
		ArrayList<String> userLists = new ArrayList();
		userLists.add("홍길동");
		userLists.add("박문수");
		
		// 객체생성과 초기화
		BoardListTO listTO = new BoardListTO();
		listTO.setUserList(userLists);
		
		for( String user : listTO.getUserList()) {
			System.out.println(user);
		}
		
		BoardTO to1 = new BoardTO();
		to1.setSeq(1);
		to1.setSubject("제목1");
		
		BoardTO to2 = new BoardTO();
		to2.setSeq(2);
		to2.setSubject("제목2");
		
		ArrayList<BoardTO> boardLists = new ArrayList();
		boardLists.add(to1);
		boardLists.add(to2);
		listTO.setBoardList(boardLists);
		//
		
		for(BoardTO to : listTO.getBoardList()) {
			System.out.println(to.getSeq());
			System.out.println(to.getSubject());
		}
	}

}

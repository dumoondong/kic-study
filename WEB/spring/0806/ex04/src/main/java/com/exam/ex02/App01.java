package com.exam.ex02;

import java.util.HashMap;

public class App01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BoardTO to1 = new BoardTO();
		to1.setSeq(1);
		to1.setSubject("제목1");
		
		BoardTO to2 = new BoardTO();
		to2.setSeq(2);
		to2.setSubject("제목2");
		
		HashMap<String, BoardTO> boardMaps = new HashMap();
		boardMaps.put("to1",to1);
		boardMaps.put("to2",to2);
		
		BoardListTO listTO = new BoardListTO();
		listTO.setBoardMaps(boardMaps);
		
		for( BoardTO to : listTO.getBoardMaps().values()) {
			System.out.println(to.getSeq());
			System.out.println(to.getSubject());
		}
	}

}

package com.exam.ex01;

import java.util.ArrayList;

public class BoardListTO {
	private ArrayList<String> userList;
	private ArrayList<BoardTO> boardList;
	
	public ArrayList<String> getUserList() {
		return userList;
	}
	public void setUserList(ArrayList<String> userList) {
		this.userList = userList;
	}
	public ArrayList<BoardTO> getBoardList() {
		return boardList;
	}
	public void setBoardList(ArrayList<BoardTO> boardList) {
		this.boardList = boardList;
	}

	
}

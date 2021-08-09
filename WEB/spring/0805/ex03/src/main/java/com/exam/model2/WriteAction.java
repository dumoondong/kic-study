package com.exam.model2;

import com.exam.model1.BoardDAO;

public class WriteAction implements BoardAction {

	private BoardDAO dao;
	
	public WriteAction(BoardDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		dao.boardList();
	}
}
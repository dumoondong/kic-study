package com.exam.ex03;

import com.exam.model1.BoardDAO;
import com.exam.model2.BoardAction;
import com.exam.model2.WriteAction;

public class App 
{
	public static void main(String[] args) 
	{
		BoardDAO dao = new BoardDAO();
		
		BoardAction action = new WriteAction(dao);
		action.execute();
	}

}

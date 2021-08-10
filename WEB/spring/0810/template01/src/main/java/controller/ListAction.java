package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class ListAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println( "ListAction 호출" );
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardTO> datas = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_list1" );
		modelAndView.addObject( "datas", datas );	
		return modelAndView;
	}

}

package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model1.BoardDAO;
import model1.BoardTO;

@Controller
public class BoardController {
	@Autowired
	private BoardDAO dao;
	
	@RequestMapping( "/list.do" )
	public ModelAndView list(HttpServletRequest request) {
		System.out.println( "list() 호출" );
		
		ArrayList<BoardTO> datas = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView( "board_list1" );
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
	
	@RequestMapping( "view.do" )
	public ModelAndView view(HttpServletRequest request) {
		System.out.println( "view() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );

		to = dao.boardView( to );
		
		ModelAndView modelAndView = new ModelAndView( "board_view1" );
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
}

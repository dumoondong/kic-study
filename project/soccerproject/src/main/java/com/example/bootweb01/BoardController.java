package com.example.bootweb01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@Autowired
	private BoardDAO dao;

	@RequestMapping( "/list.do" )
	public ModelAndView list(HttpServletRequest request) {
		System.out.println( "list() 호출" );
		
		ArrayList<BoardTO> datas = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView( "model2/board_list1" );
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
	@RequestMapping( "select.do" )
	public ModelAndView select02(HttpServletRequest request) {
		return new ModelAndView("select02");
	}
	@RequestMapping( "main.do" )
	public ModelAndView main(HttpServletRequest request) {
		return new ModelAndView("menu/main");
	}
	@RequestMapping( "league.do" )
	public ModelAndView leauge(HttpServletRequest request) {
		return new ModelAndView("menu/league");
	}

	@RequestMapping( "/testboard.do" )
	public ModelAndView testboard(HttpServletRequest request) {
		System.out.println( "list() 호출" );
		
		ArrayList<BoardTO> datas = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView( "menu/testboard" );
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
}

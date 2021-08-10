package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class ModifyOkAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println( "ModifyOkAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		to.setSubject( request.getParameter( "subject" ) );
		to.setMail( "" );
		if(!request.getParameter( "mail1" ).equals( "" ) && !request.getParameter( "mail2" ).equals( "" )) {
			to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
		}
		to.setPassword( request.getParameter( "password" ) );
		to.setContent( request.getParameter( "content" ) );
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardModifyOk( to );

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board_modify1_ok");
		modelAndView.addObject("flag", flag);
		modelAndView.addObject("seq", to.getSeq());
		return modelAndView;
	}

}

package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.BoardDAO;
import model1.BoardTO;

public class DeleteAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println( "DeleteAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter( "seq" ) );

		BoardDAO dao = new BoardDAO();
		to = dao.boardDelete( to );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board_delete1");
		modelAndView.addObject("to", to);
		return modelAndView;
	}

}

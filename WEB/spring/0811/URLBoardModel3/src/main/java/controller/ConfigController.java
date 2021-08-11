package controller;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model1.BoardDAO;
import model1.BoardTO;

@Controller
public class ConfigController {
	
	@RequestMapping("/list.do")
	public ModelAndView list(HttpServletRequest request) {
		System.out.println( "list() 호출" );
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardTO> datas = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView("board_list1");
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
	
	@RequestMapping("view.do")
	public ModelAndView view(HttpServletRequest request) {
		System.out.println( "view() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );

		BoardDAO dao = new BoardDAO();
		to = dao.boardView( to );
		
		ModelAndView modelAndView = new ModelAndView("board_view1");
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
	
	@RequestMapping("delete.do")
	public ModelAndView delete(HttpServletRequest request) {
		System.out.println( "delete() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq(request.getParameter( "seq" ) );

		BoardDAO dao = new BoardDAO();
		to = dao.boardDelete( to );

		ModelAndView modelAndView = new ModelAndView("board_delete1");
		modelAndView.addObject( "to", to );
		return modelAndView;
	}

	@RequestMapping("delete_ok.do")
	public ModelAndView delete_ok(HttpServletRequest request) {
		System.out.println( "deletok() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		to.setPassword( request.getParameter( "password" ) );
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardDeleteOk(to);

		ModelAndView modelAndView = new ModelAndView("board_delete1_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	
	@RequestMapping("modify.do")
	public ModelAndView modify(HttpServletRequest request) {
		System.out.println( "modify() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		
		BoardDAO dao = new BoardDAO();
		to = dao.boardModify( to );

		ModelAndView modelAndView = new ModelAndView("board_modify1");
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
	@RequestMapping("modify_ok.do")
	public ModelAndView modify_ok(HttpServletRequest request) {
		System.out.println( "modify_ok() 호출" );
		
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
		
		ModelAndView modelAndView = new ModelAndView("board_modify1_ok");
		modelAndView.addObject("flag", flag);
		modelAndView.addObject("seq", to.getSeq());
		return modelAndView;
	}
	
	@RequestMapping("/write.do")
	public ModelAndView write() {
		System.out.println( "Write() 호출" );
		
		return new ModelAndView("board_write1");
	}
	
	@RequestMapping("write_ok.do")
	public ModelAndView write_ok(HttpServletRequest request) {
		System.out.println( "WriteOk() 호출" );
		
		BoardTO to = new BoardTO();
		to.setSubject( request.getParameter( "subject" ) );
		to.setWriter( request.getParameter( "writer" ) );
		to.setMail( "" );
		if( !request.getParameter( "mail1" ).equals("") && !request.getParameter( "mail2" ).equals("") ) {
			to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
		}
		to.setPassword( request.getParameter( "password" ) );
		to.setContent( request.getParameter( "content" ) );
		to.setWip( request.getRemoteAddr() );
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardWriteOk(to);

		ModelAndView modelAndView = new ModelAndView("board_write1_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	
}

package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model2.BoardAction;
import model2.BoardDeleteAction;
import model2.BoardDeleteOkAction;
import model2.BoardListAction;
import model2.BoardModifyAction;
import model2.BoardModifyOkAction;
import model2.BoardViewAction;
import model2.BoardWriteAction;
import model2.BoardWriteOkAction;
import model2.CommentWriteOkAction;

/**
 * Servlet implementation class ControllerEx01
 */
@WebServlet("*.do")
public class ControllerEx01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			request.setCharacterEncoding( "utf-8" );
			
			String path = request.getRequestURI().replaceAll( request.getContextPath(), "" );
			
			String url = "";
			BoardAction boardAction = null;
			
			if( path.equals( "/*.do" ) || path.equals( "/board_list.do" ) ) {
				boardAction = new BoardListAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_list1.jsp";
			} else if( path.equals( "/board_view.do" ) ) {
				boardAction = new BoardViewAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_view1.jsp";
			} else if( path.equals( "/board_write.do" ) ) {
				boardAction = new BoardWriteAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_write1.jsp";
			} else if( path.equals( "/board_write_ok.do" ) ) {
				boardAction = new BoardWriteOkAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_write1_ok.jsp";
			} else if( path.equals( "/board_modify.do" ) ) {
				boardAction = new BoardModifyAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_modify1.jsp";
			} else if( path.equals( "/board_modify_ok.do" ) ) {
				boardAction = new BoardModifyOkAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_modify1_ok.jsp";
			} else if( path.equals( "/board_delete.do" ) ) {
				boardAction = new BoardDeleteAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_delete1.jsp";
			} else if( path.equals( "/board_delete_ok.do" ) ) {
				boardAction = new BoardDeleteOkAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/board_delete1_ok.jsp";
			} else if( path.equals( "/comment_write_ok.do" ) ) {
				boardAction = new CommentWriteOkAction();
				boardAction.execute(request, response);
				
				url = "/WEB-INF/views/model2/comment_write1_ok.jsp";
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

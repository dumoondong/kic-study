package model2;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model1.CommentDAO;
import model1.CommentTO;

public class CommentListAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println( "CommentListAction 호출" );
		
		CommentTO cto = new CommentTO();
		cto.setPseq( request.getParameter( "seq" ) );
		
		CommentDAO cdao = new CommentDAO();
		ArrayList<CommentTO> commentLists = cdao.commentList( cto ); 
		
		request.setAttribute( "commentLists", commentLists );
	}
}

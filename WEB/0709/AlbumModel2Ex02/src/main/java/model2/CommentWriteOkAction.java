package model2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model1.CommentDAO;
import model1.CommentTO;

public class CommentWriteOkAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println( "CommentWriteOkAction 호출" );
		
		CommentTO cto = new CommentTO();
		cto.setPseq( request.getParameter( "seq" ) );
		cto.setWriter( request.getParameter( "cwriter" ) );
		cto.setPassword( request.getParameter( "cpassword" ) );
		cto.setContent( request.getParameter( "ccontent" ) );

		CommentDAO dao = new CommentDAO();
		int flag = dao.commentWriteOk( cto );
		
		request.setAttribute( "flag", flag );
	}
}

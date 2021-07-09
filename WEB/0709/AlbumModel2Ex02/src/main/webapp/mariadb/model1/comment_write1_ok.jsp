<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model1.CommentTO" %>
<%@ page import="model1.CommentDAO" %>

<%
	request.setCharacterEncoding( "utf-8" );
	
	CommentTO cto = new CommentTO();
	cto.setPseq( request.getParameter( "seq" ) );
	cto.setWriter( request.getParameter( "cwriter" ) );
	cto.setPassword( request.getParameter( "cpassword" ) );
	cto.setContent( request.getParameter( "ccontent" ) );

	String cpage = request.getParameter( "cpage" );
	String seq = cto.getPseq();
	
	CommentDAO dao = new CommentDAO();
	int flag = dao.commentWriteOk( cto );
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert('댓글쓰기에 성공했습니다.');" );
		out.println( "location.href='board_view1.jsp?cpage=" + cpage + "&seq=" + seq + "';" );
	} else {
		out.println( "alert('댓글쓰기에 실패했습니다.');" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );
%>
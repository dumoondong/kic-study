<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model1.simple.BoardTO" %>
<%@ page import="model1.simple.BoardDAO" %>


<%
	request.setCharacterEncoding( "utf-8" );

	BoardTO to = new BoardTO();
	BoardDAO dao = new BoardDAO();
	int flag = dao.boardModifyOk(to);
	
	String seq = to.getSeq();
	String subject = to.getSubject();
	
	String mail = "";
	if(!request.getParameter( "mail1" ).equals( "" ) && !request.getParameter( "mail2" ).equals( "" )) {
		mail = request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" );
	}
	
	String password = to.getPassword();
	String content = to.getContent();
		
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert('글수정에 성공했습니다.');" );
		out.println( "location.href='board_view1.jsp?seq=" + seq + "';" );
	} else if( flag == 1 ) {
		out.println( "alert('비밀번호가 잘못되었습니다.');" );
		out.println( "history.back();" );
	} else if( flag == 2 ) {
		out.println( "alert('글수정에 실패했습니다.');" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );
%>

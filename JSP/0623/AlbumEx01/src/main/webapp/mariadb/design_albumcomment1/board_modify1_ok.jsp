<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model1.BoardTO" %>
<%@ page import="model1.BoardDAO" %>

<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>

<%@ page import="java.io.File" %>

<%
	String uploadPath = "C:/JSP/eclipse-workspace/PDSBoardModel2/src/main/webapp/upload";
	int maxFileSize = 1024 * 1024 * 2;
	String encType = "utf-8";
	
	MultipartRequest multi
	= new MultipartRequest( request, uploadPath, maxFileSize, encType, new DefaultFileRenamePolicy() );

	BoardTO to = new BoardTO();
	to.setSeq( multi.getParameter( "seq" ) );
	
	to.setSubject( multi.getParameter( "subject" ) );
	if( !multi.getParameter( "mail1" ).equals( "" ) && !multi.getParameter( "mail2" ).equals( "" ) ) {
		to.setMail( multi.getParameter( "mail1" ) + "@" + multi.getParameter( "mail2" ) );
	}
	to.setPassword( multi.getParameter( "password" ) );
	to.setContent( multi.getParameter( "content" ) );
	
	to.setFilename( multi.getFilesystemName( "upload" ) );
	File newFile = multi.getFile( "upload" );
	long newFilesize = 0;
	if( newFile != null ) {
		to.setFilesize( newFile.length() );
	}
	to.setLongitude(multi.getParameter("longitude"));
	to.setLatitude(multi.getParameter("latitude"));
	
	BoardDAO dao = new BoardDAO();

	int flag = dao.boardModifyOk( to );
	String seq = to.getSeq();
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert( '글수정에 성공했습니다.' );" );
		out.println( "location.href='board_view1.jsp?seq=" + seq + "';" );
	} else if( flag == 1 ) {
		out.println( "alert( '비밀번호가 잘못되었습니다.' );" );
		out.println( "history.back();" );
	} else {
		out.println( "alert( '글수정에 실패했습니다.' );" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );
	
%>

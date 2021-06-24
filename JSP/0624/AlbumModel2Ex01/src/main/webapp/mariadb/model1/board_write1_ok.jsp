<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="model1.BoardTO" %>    
<%@ page import="model1.BoardDAO" %>

<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>

<%@ page import="java.io.File" %>

<%
	String uploadPath = "C:/JSP/eclipse-workspace/AlbumModel2Ex01/src/main/webapp/upload";
	int maxFileSize = 1024 * 1024 * 10;
	String encoding = "utf-8";
	
	MultipartRequest multi = new MultipartRequest(request, uploadPath, maxFileSize, encoding, new DefaultFileRenamePolicy());
	
	BoardTO to = new BoardTO();
	to.setSubject( multi.getParameter( "subject" ) );
	to.setWriter( multi.getParameter( "writer" ) );
	if( !multi.getParameter( "mail1" ).equals( "" ) && !multi.getParameter( "mail2" ).equals( "" ) ) {
		to.setMail( multi.getParameter( "mail1" ) + "@" + multi.getParameter( "mail2" ) );
	}
	to.setPassword( multi.getParameter( "password" ) );
	to.setContent( multi.getParameter( "content" ) );
	
	to.setWip( request.getRemoteAddr() );
	
	to.setFilename( multi.getFilesystemName( "upload" ) );
	File file = multi.getFile( "upload" ); 
	if( file != null ) {
		to.setFilesize( file.length() );
	}
	
	to.setLatitude( multi.getParameter( "latitude" ) );
	to.setLongitude( multi.getParameter( "longitude" ) );
	
	BoardDAO dao = new BoardDAO();
	int flag = dao.boardWriteOk( to );
		
	out.println("<script type='text/javascript'>");
	if(flag == 0) {
		out.println( "alert('글쓰기에 성공했습니다.');" );
		out.println( "location.href='board_list1.jsp';" );
	} else {
		out.println( "alert('글쓰기에 실패했습니다.');" );
		out.println( "history.back();");
	}
	out.println( "</script>" );
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding( "utf-8" );

	String cpage = request.getParameter( "cpage" );
	String seq =  request.getParameter( "seq" );
	
	String writer =	 request.getParameter( "cwriter" );
	String password = request.getParameter( "cpassword" );
	String content = request.getParameter( "ccontent" );
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	int flag = 1;
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
	
		conn = dataSource.getConnection();
		
		String sql = "insert into album_comment1 values (0, ?, ?, ?, ?, now())";
		pstmt = conn.prepareStatement( sql );
		pstmt.setString( 1, seq );
		pstmt.setString( 2, writer );
		pstmt.setString( 3, password );
		pstmt.setString( 4, content );
		
		int result = pstmt.executeUpdate();
		if( result == 1 ) {
			pstmt.close();
			
			sql = "update album_board1 set cmt=cmt+1 where seq=?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, seq );
			
			pstmt.executeUpdate();
			
			flag = 0;
		}
	} catch( NamingException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} finally {
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
	
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding("utf-8");

	String cpage = request.getParameter( "cpage" );
	String seq = request.getParameter( "seq" );

	String subject = request.getParameter( "subject" );
	String writer = request.getParameter( "writer" );
	String mail = "";
	if( !request.getParameter( "mail1" ).equals("") && !request.getParameter( "mail2" ).equals("") ) {
		mail = request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ); 
	}
	String password = request.getParameter( "password" );
	String content = request.getParameter( "content" );
	
	String wip = request.getRemoteAddr();
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	int flag = 1;
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		
		conn = dataSource.getConnection();
		
		String sql = "select grp, grps, grpl from rep_board1 where seq=?";
		pstmt = conn.prepareStatement( sql );
		pstmt.setString( 1, seq );
		
		rs = pstmt.executeQuery();
		
		int grp = 0;
		int grps = 0;
		int grpl = 0;
		if( rs.next() ) {
			grp = rs.getInt( "grp" );
			grps = rs.getInt( "grps" );
			grpl = rs.getInt( "grpl" );
		}
		
		sql = "update rep_board1 set grps=grps+1 where grp=? and grps>?";
		pstmt = conn.prepareStatement( sql );
		pstmt.setInt( 1, grp );
		pstmt.setInt( 2, grps );
		
		pstmt.executeUpdate();
		
		sql = "insert into rep_board1 values ( 0, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, now() ) ";
		pstmt = conn.prepareStatement( sql );
		pstmt.setInt( 1, grp );
		pstmt.setInt( 2, grps + 1 );
		pstmt.setInt( 3, grpl + 1 );
		pstmt.setString( 4, subject );
		pstmt.setString( 5, writer );
		pstmt.setString( 6, mail );
		pstmt.setString( 7, password );
		pstmt.setString( 8, content );
		pstmt.setString( 9, wip );	
			
		int result = pstmt.executeUpdate();
		if( result == 1 ) {
			flag = 0;
		}
	} catch( NamingException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert( '답글쓰기에 성공했습니다.' );" );
		out.println( "location.href='board_view1.jsp?cpage=" + cpage + "&seq=" + seq + "';" );
	} else {
		out.println( "alert( '답글쓰기에 실패했습니다.' );" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );
%>


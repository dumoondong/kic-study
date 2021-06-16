<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>
<!--  dept1.jsp
	dept ..
 -->
 <%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer result = new StringBuffer();
	
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb2" );
		
		conn = dataSource.getConnection();
		
		String sql = "select * from dept";
		pstmt = conn.prepareStatement( sql );
		
		rs = pstmt.executeQuery();
		result.append( "<table>" );
		while( rs.next() ) {
			result.append( "<tr>" );
			result.append( "	<td>" + rs.getString( "deptno" ) + "</td>" );
			result.append( "	<td>" + rs.getString( "dname" ) + "</td>" );
			result.append( "	<td>" + rs.getString( "loc" ) + "</td>" );
			result.append( "</tr>" );	
		}
		result.append( "</table>" );
		
	} catch( NamingException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=result %>
</body>
</html>
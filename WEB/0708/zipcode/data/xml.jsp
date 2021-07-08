<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="javax.naming.Context"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.NamingException"%>

<%@ page import="javax.sql.DataSource"%>

<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.SQLException"%>
<%
	request.setCharacterEncoding( "utf-8" );

	String strDong = request.getParameter( "dong" );
	//strDong = "대치"; 

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StringBuffer result = new StringBuffer();
	
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource) envCtx.lookup( "jdbc/mariadb2" );

		conn = dataSource.getConnection();
		
		String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
		pstmt = conn.prepareStatement( sql );
		pstmt.setString(1, strDong + "%" );
		rs = pstmt.executeQuery();
		
		result.append( "<addresses>" );
		while( rs.next() ) {
			result.append( "<address>" );
			result.append( "	<zipcode>" ).append( rs.getString( "zipcode" ) ).append( "</zipcode>" );
			result.append( "	<sido>" ).append( rs.getString( "sido" ) ).append( "</sido>" );
			result.append( "	<gugun>" ).append( rs.getString( "gugun" ) ).append( "</gugun>" );
			result.append( "	<dong>" ).append( rs.getString( "dong" ) ).append( "</dong>" );
			result.append( "	<ri>" ).append( rs.getString( "ri" ) ).append( "</ri>" );
			result.append( "	<bunji>" ).append( rs.getString( "bunji" ) ).append( "</bunji>" );
			result.append( "</address>" );
		}
		result.append( "</addresses>" );
		
	} catch( NamingException e ) {
		System.out.println( "[에러] : " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] : " + e.getMessage() );
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
	
	out.println( result );
%>

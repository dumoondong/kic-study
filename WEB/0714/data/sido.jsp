<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="javax.naming.Context"  %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource"  %>

<%@ page import="java.sql.Connection"  %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException"  %>

<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>

<%
	request.setCharacterEncoding("utf-8");

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
   
	JSONArray jsonArray = new JSONArray();
   
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb2" );
     
		conn = dataSource.getConnection();
	     
		String sql = "select distinct sido from zipcode";
		pstmt = conn.prepareStatement( sql );
	     
		rs = pstmt.executeQuery();
	     
		while( rs.next() ) {
			String sido = rs.getString( "sido" );

			JSONObject jsonObject = new JSONObject();
			jsonObject.put( "sido", sido );
		        
			jsonArray.add( jsonObject );
		}
	} catch( NamingException e )  {
		System.out.println( "[에러] : " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println("[에러] : " + e.getMessage());
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
%>
<%=jsonArray %>
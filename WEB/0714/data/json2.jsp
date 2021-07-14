<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>

<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>	

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	JSONArray jsonArray= new JSONArray();
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		conn = dataSource.getConnection();

		String sql = "select * from london";
		pstmt = conn.prepareStatement( sql );
		rs = pstmt.executeQuery();

		while( rs.next() ) {
			String seq = rs.getString("seq");
			String name = rs.getString("name");
			String lat = rs.getString("lat");
			String lng = rs.getString("lng");
			String geonameid = rs.getString("geonameid");
			String countrycode = rs.getString("countrycode");
			String fcl = rs.getString("fcl");
			String fcode = rs.getString("fcode");
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("seq", seq);
			jsonObject.put("name", name);
			jsonObject.put("lat", lat);
			jsonObject.put("lng", lng);
			jsonObject.put("geonameid", geonameid);
			jsonObject.put("countrycode", countrycode);
			jsonObject.put("fcl", fcl);
			jsonObject.put("fcode", fcode);
			
			jsonArray.add(jsonObject); 
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
	out.println(jsonArray);
%>
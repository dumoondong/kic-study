<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="org.json.simple.JSONArray"%>
<%@ page import="org.json.simple.JSONObject"%>

<%@ page import="javax.naming.Context"%>
<%@ page import="javax.naming.InitialContext"%>
<%@ page import="javax.naming.NamingException"%>

<%@ page import="javax.sql.DataSource"%>

<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

<%
	request.setCharacterEncoding("utf-8");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String sido = request.getParameter("sido");
	String gugun = request.getParameter("gugun");
	//String sido = "경기";
	//String gugun = "고양시 일산동구";
	
	JSONArray jsonArray = new JSONArray();
	
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource dataSource = (DataSource) envCtx.lookup("jdbc/mariadb2");
	
		conn = dataSource.getConnection();
	
		String sql = "select distinct dong from zipcode where sido = ? and gugun = ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sido);
		pstmt.setString(2, gugun);
		rs = pstmt.executeQuery();
	
		while (rs.next()) {
			JSONObject zip = new JSONObject();
			
			zip.put("dong",rs.getString("dong"));
			
			jsonArray.add(zip);
		}
	
	} catch (NamingException e) {
		System.out.println("[에러] : " + e.getMessage());
	} catch (SQLException e) {
		System.out.println("[에러] : " + e.getMessage());
	} finally {
		if (rs != null) rs.close();
		if (pstmt != null) pstmt.close();
		if (conn != null) conn.close();
	}
	
	out.println(jsonArray);
%>
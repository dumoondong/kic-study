<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jdbc01.jsp -->
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>

<%
	Connection conn = null;

	try{
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup("java:comp/env");
		DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb");
		
		conn = dataSource.getConnection();
		System.out.println("데이터베이스 연결 성공");
	}catch(NamingException e){
		System.out.println("에러" +e.getMessage());
	}catch(SQLException e){
		System.out.println("에러" +e.getMessage());
	}finally{
		if(conn!= null) conn.close();
	}
%>
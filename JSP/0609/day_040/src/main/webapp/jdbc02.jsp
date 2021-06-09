<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String url = "jdbc:mysql://localhost:3306/sample";
	String user = "root";
	String password = "123456";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		
		String sql = "select deptno,dname,loc from dept";
		pstmt = conn.prepareStatement(sql);
		
		rs=pstmt.executeQuery();
		out.println("<table border='1' width='1'>");
		while(rs.next()){
			out.println("<tr>");
			out.println("<td>" +rs.getString("deptno")+"<br />" + "</td>");
			out.println("<td>" +rs.getString("dname")+"<br />" + "</td>");
			out.println("<td>" +rs.getString("loc")+"<br />" + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		//out.println("데이터베이스 연결 성공");
		System.out.println("데이터베이스 연결 성공");
	}catch(ClassNotFoundException e){
		System.out.println("[에러]"+e.getMessage());
	}catch(SQLException e){
		System.out.println("[에러]"+e.getMessage());
	}finally{
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	}
	conn.close();
%>
</body>
</html>
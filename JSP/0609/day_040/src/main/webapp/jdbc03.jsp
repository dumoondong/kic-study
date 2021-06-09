<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

<%
	String url = "jdbc:mysql://localhost:3306/sample";
	String user = "root";
	String password = "123456";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StringBuilder sbHtml = new StringBuilder();
	try{
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, user, password);
		
		String sql = "select deptno,dname,loc from dept";
		pstmt = conn.prepareStatement(sql);
		
		rs=pstmt.executeQuery();
		sbHtml.append("<table border='1' width='1'>");
		while(rs.next()){
			sbHtml.append("<tr>");
			//sbHtml.append("<td>" +rs.getString("deptno")+"<br />" + "</td>");
			sbHtml.append("<td>").append(rs.getString("deptno")).append("</td>");
			sbHtml.append("<td>" +rs.getString("dname")+"<br />" + "</td>");
			sbHtml.append("<td>" +rs.getString("loc")+"<br />" + "</td>");
			sbHtml.append("</tr>");
		}
		sbHtml.append("</table>");
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
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=sbHtml.toString() %>
</body>
</html>
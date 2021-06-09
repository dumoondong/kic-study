<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 자바 코드
	// 주석
	// 출력
	// new가 필요없이 객체변수가 생성된 클래스 - 기본 객체
	// out ...
	out.println("<b>Hello</b> JSP<br />");
	out.println("Hellog JSP<br />");
	//디버깅용
	System.out.println("Hello JSP");
%>
<%
	out.println("<b>Hello</b> JSP2<br />");
	out.println("Hellog JSP 2<br />");
	//디버깅용
	System.out.println("Hello JSP 2");
%>
</body>
</html>
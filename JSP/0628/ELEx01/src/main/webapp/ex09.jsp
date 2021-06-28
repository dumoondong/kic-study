<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.FormatUtil" %>
<%
	pageContext.setAttribute("price", 12345L);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가격은 ${price }원 입니다.<br />
가격은 ${FormatUtil.changeFormat(price, '#,##0') }원 입니다.<br />
</body>
</html>
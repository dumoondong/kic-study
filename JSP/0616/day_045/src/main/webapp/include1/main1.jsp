<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- main1.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int i= 10;
%>

Hello.jsp 1<br />
<!-- 액션태그 - java => tag 변경 -->
<jsp:include page="sub.jsp">
	<jsp:param name="data1" value="value1" />
	<jsp:param name="data2" value="<%= i %>" />
</jsp:include>
Hello.jsp 4<br />
<%= "i :" + i %>
</body>
</html>
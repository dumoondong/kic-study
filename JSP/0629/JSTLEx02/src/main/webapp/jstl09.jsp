<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="strArr" value='<%= new String[] {"AA","BB","CC","DD"} %>' />
<c:forEach var="data" items="${strArr }">
	${data }<br />
</c:forEach>

<c:set var="hm" value="<%= new java.util.HashMap() %>" />
<c:set target="${hm }" property="name" value="홍길동" />
<c:set target="${hm }" property="today" value="<%= new java.util.Date() %>" />

<c:forEach var="data" items="${hm }">
	${data.key } - ${data.value }<br />
</c:forEach>

<c:set var="hm2" value="${hm }" />
<c:forEach var="data" items="${hm2 }">
	${data.key } - ${data.value }<br />
</c:forEach>

<c:set var="to1" value="<%= new model1.BoardTO() %>" />
<c:set target="${to1 }" property="subject" value ="제목1"/>
<c:set target="${to1 }" property="writer" value ="작성자1"/>
<c:set var="to2" value="<%= new model1.BoardTO() %>" />
<c:set target="${to2 }" property="subject" value ="제목2"/>
<c:set target="${to2 }" property="writer" value ="작성자2"/>

<c:set var="lists" value="<%= new java.util.ArrayList() %>" />
<c:set var="noUser" value="${ lists.add(to1)}" />
<c:set var="noUser" value="${ lists.add(to2)}" />

<c:forEach var="to" items="${lists }">
	${to.subject } - ${to.writer }<br />
</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="to1" value="<%= new model1.BoardTO() %>" scope="page" />
<c:set target="${to1 }" property="subject" value="제목1" />
<c:set target="${to1 }" property="writer" value="작성자1" />

<c:set var="to2" value="<%= new model1.BoardTO() %>" scope="page" />
<c:set target="${to2 }" property="subject" value="제목2" />
<c:set target="${to2 }" property="writer" value="작성자2" />

<c:set var="hm" value="<%= new java.util.HashMap() %>" scope="page" />
<c:set target="${hm }" property="to1" value="${to1 }" />
<c:set target="${hm }" property="to2" value="${to2 }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${hm.to1.subject }<br />
${hm.to1.writer }<br />

${hm.to2.subject }<br />
${hm.to2.writer }<br />
</body>
</html>
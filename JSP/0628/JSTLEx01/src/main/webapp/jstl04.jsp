<%@page import="model1.BoardTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="to" value="<%=new model1.BoardTO() %>" scope="page" />
<c:set target="${to }" property="subject" value="제목" />
<c:set target="${to }" property="writer" value="저자" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${to.subject }<br />
${to.writer }<br />

</body>
</html>
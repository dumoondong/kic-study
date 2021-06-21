<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./servlet03" method="get">
데이터 <input type ="text" name = "data" />
<input type="submit" value="전송" />
</form>

<hr/>
<form action="./servlet03" method="post">
데이터 <input type ="text" name = "data" />
<input type="submit" value="전송" />
</form>
</body>
</html>
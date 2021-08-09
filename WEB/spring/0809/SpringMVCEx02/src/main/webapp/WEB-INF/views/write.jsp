<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="write_ok.do" method="get">
data <input type="text" name="data" />
<input type="submit" value="전송" />
</form>

<form action="write_ok.do" method="post">
data <input type="text" name="data" />
<input type="submit" value="전송" />
</form>
</body>
</html>
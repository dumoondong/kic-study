<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="./controller" method="post">
<input type="hidden" name="action" value="form_ok" />
데이터 <input type="text" name="data" />
<input type="submit" value="전송" />
</form>

</body>
</html>
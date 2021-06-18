<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	1. method = "post"
	2. enctype="multipart/form-data"
	3. type = "file"
 -->
<form action="form_ok.jsp" method = "post" enctype="multipart/form-data">
파일1<input type="file" name="upload1" /> <br /><br />
아이디<input type="test" name="id" />	 <br /><br />
<input type="submit" value = "파일 업로드" />

</form>
</body>
</html>
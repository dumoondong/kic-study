<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	//메서드의 선언
	public int multiplay(int a, int b){
		int result = a * b;
		return result;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int a = 10;
	int b = 20;
	int result = multiplay(a, b);
	out.println("결과 :" + result);
%>

</body>
</html>
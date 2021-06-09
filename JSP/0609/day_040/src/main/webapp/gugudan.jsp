<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("<table border='1' width='800'>");
	for(int i=0; i<=9; i++){
		out.println("<tr>");
		for(int j=0; j<=9; j++){
			if(i==0 && j ==0){
				out.println("<td></td>");
			}else if (i == 0){
				out.println("<td>X" +j + "</td>");
			}else if(j == 0){
				out.println("<td>"+i+"단</td>");
			}else{
				out.println("<td>" + i + " X " +j + " = " + (i*j) + "</td>");
			}
		}
		out.println("</tr>");
	}
	out.println("</table>");
%>
</body>
</html>
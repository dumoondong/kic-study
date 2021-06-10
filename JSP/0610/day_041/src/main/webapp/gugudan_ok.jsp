<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- guguda_ok -->
<%
	request.setCharacterEncoding("utf-8");
	int startdan = Integer.parseInt(request.getParameter("startdan"));
	int enddan = Integer.parseInt(request.getParameter("enddan"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("<table border='1' width='800'>");
	for(int i=startdan; i<=enddan; i++){
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
</form>
</body>
</html>
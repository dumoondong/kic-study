<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model1.DeptTO" %>
<%@ page import="model1.DeptDAO" %>
<%@ page import="java.util.ArrayList" %>

<!--  dept1.jsp
	dept ..
 -->
 <%
 	request.setCharacterEncoding("utf-8");
 
 	DeptDAO dao = new DeptDAO();
 	ArrayList<DeptTO> datas = dao.listDept();
	StringBuffer result = new StringBuffer();
	
	result.append( "<table>" );
	
	for( DeptTO to : datas ) {
		result.append( "<tr>" );
		result.append( "	<td>" + to.getDeptno() + "</td>" );
		result.append( "	<td>" + to.getDname() + "</td>" );
		result.append( "	<td>" + to.getLoc() + "</td>" );
		result.append( "</tr>" );	
	}
	result.append( "</table>" );
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=result %>
</body>
</html>
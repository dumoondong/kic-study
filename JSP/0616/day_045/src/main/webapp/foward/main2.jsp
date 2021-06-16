<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- main2.jsp -->
<%
	request.setCharacterEncoding("utf-8");

	String url = request.getParameter("url");
	
	RequestDispatcher dispatcher = null;
	
	if(url == null || url.equals("")){
		dispatcher = request.getRequestDispatcher("a.jsp");
	}else{
		dispatcher = request.getRequestDispatcher("b.jsp");
	}
	
	dispatcher.forward(request, response);
%>
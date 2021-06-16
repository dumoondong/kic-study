<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- sub.jsp -->
<%
	String data1 = request.getParameter( "data1" );
	String data2 = request.getParameter( "data2" );
%>

Hello.jsp 2<br />
Hello.jsp 3<br />
<%= "data1 : " + data1 %><br />
<%= "data2 : " + data2 %><br />
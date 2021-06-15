<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	out.println(out.getRemaining() +"<br />");
	out.println("1<br/>");
	out.println("2<br/>");
	out.println("3<br/>");
	
	out.clearBuffer();
	out.println(out.getRemaining() +"<br />");
	
	out.println("4<br/>");
	out.println("5<br/>");
	out.println("6<br/>");
	
	out.flush();
	out.println(out.getRemaining() +"<br />");
	
	
	out.println("7<br/>");
	out.println("8<br/>");
	
	out.close();
	
	out.println("9<br/>");
	out.println("10<br/>");
	
%>
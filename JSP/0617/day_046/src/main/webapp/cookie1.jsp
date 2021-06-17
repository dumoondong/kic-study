<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//쿠키의 생성
	Cookie cookie1 = new Cookie("data1","value1");
	response.addCookie(cookie1);
	
	//쿠키의 생성
	Cookie cookie2 = new Cookie("data2","value2");
	response.addCookie(cookie1);
	
	//확인
	out.println(cookie1.getName() + "<br/>");
	out.println(cookie1.getValue() + "<br/>");
	
%>
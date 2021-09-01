<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.bootweb01.MemberTO" %>    

<%	
	session.removeAttribute("loginUser"); //세션에 값 저장
	out.println( "<script type='text/javascript'>" );
	out.println( "location.href='./login.do';" );
	out.println( "</script>" );

%>


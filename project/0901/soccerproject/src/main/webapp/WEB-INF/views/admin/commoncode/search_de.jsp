<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.bootweb01.SmallcodeTO"%>
<%	
	ArrayList<SmallcodeTO> datas = (ArrayList)request.getAttribute( "datas" );

	out.println( "<script type='text/javascript'>" );
	session.setAttribute("dedatas", datas);  //세션에 값 저장
	out.println( "location.href='./commoncode.do';" );
	
	out.println( "</script>" );

%>
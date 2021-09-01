<%@page import="com.example.bootweb01.MemberTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%	
	ArrayList<MemberTO> datas = (ArrayList)request.getAttribute( "datas" );

	out.println( "<script type='text/javascript'>" );
	session.setAttribute("grdatas", datas);  //세션에 값 저장
	out.println( "location.href='./management.do';" );
	
	out.println( "</script>" );

%>
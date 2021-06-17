<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.Cookies" %>

<%
	response.addCookie(Cookies.createCookie("login_id","테스터"));
	response.addCookie(Cookies.createCookie("login_grade","1234"));
	
	out.println("<script type='text/javascript'>");
	out.println( "alert('로그인 되었습니다');" );
	out.println( "location.href='cookie4.jsp'" );
	out.println("</script>");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
	//String id = request.getParameter("id");
	//String password = request.getParameter("password");
%>
<jsp:useBean id="to" class="pack.MemberTO"/>
<%--<jsp:setProperty name = "to" property = "id" value = "<%=id %>"/>
<jsp:setProperty name = "to" property = "password" value = "<%=password %>"/> --%>
<%--<jsp:setProperty name = "to" property = "id" value = '<%=request.getParameter("id") %>'/>
<jsp:setProperty name = "to" property = "password" value = '<%=request.getParameter("password") %>'/> --%>
<jsp:setProperty name = "to" property = "*"/>
<jsp:getProperty name = "to" property = "id" /><br/>
<jsp:getProperty name = "to" property = "password" /><br/>

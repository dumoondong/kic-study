<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model1.DeptTO" %>
<%@ page import="model1.DeptDAO" %>

<%@ page import = "java.util.ArrayList" %>

<%
	DeptDAO dao = new DeptDAO();
	ArrayList<DeptTO> lists = dao.selectList();
	StringBuilder sbHtml = new StringBuilder();
	
	sbHtml.append("<table>");
	for(DeptTO to : lists){
			sbHtml.append("<tr>");
			sbHtml.append("<td>"+to.getDeptno()+ "</td>");
			sbHtml.append("<td>"+to.getDname()+ "</td>");
			sbHtml.append("<td>"+to.getLoc()+ "</td>");
			sbHtml.append("</tr>");
	}
	sbHtml.append("</table>");
%>
<%=sbHtml %>
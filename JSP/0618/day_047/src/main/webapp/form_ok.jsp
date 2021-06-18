<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%
	//1.경로
	//2.용량제한
	//3.인코딩
	String uploadPath =	"C:/JSP/eclipse-workspace/day_047/src/main/webapp/upload";
	int maxFileSize = 1024 * 1024 * 2;
	String encType = "utf-8";
	MultipartRequest multi
	= new MultipartRequest(request, uploadPath, maxFileSize, encType, new DefaultFileRenamePolicy() );
	out.println("전송 완료<br />");
	
	
	out.println(multi.getFilesystemName("upload1")+"<br />");
	out.println(multi.getOriginalFileName("upload1")+"<br />");
	
	java.io.File file = multi.getFile("upload1");
	out.println(file.length() +"<br />");
	out.println(file.lastModified() +"<br />");
	
	//out.println(request.getParameter("id") + "<br />");  안됨
	out.println(multi.getParameter("id") + "<br />");
	
	out.println(request.getRemoteAddr() + "<br />");
%>
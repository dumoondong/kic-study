<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String data = request.getParameter("data");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	BufferedReader br = null;
	
	try {
		br = new BufferedReader(new FileReader("zipcode"));
		String address = null;
		while((address = br.readLine())!=null) {
			//System.out.println(address);
			String[] addresses = address.split(",");
			if(addresses[3].startsWith(data)) {
				out.println(address);
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("에러:"+e.getMessage());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("에러:"+e.getMessage());
	}finally{
		if(br != null)try {br.close();}catch(IOException e) {}
	}
%>
</body>
</html>
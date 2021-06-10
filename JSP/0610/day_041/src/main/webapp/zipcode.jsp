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
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			const data = document.frm.data.value;
		
			if(data.length <2){
				alert('2자이상 입력');
				return;
			}
			document.frm.submit();
		};
	};
</script>
</head>
<body>
<form action="./zipcode.jsp" method = "post" name="frm">
<input type="text" name="data">
<input type="button" id="btn" value="우편번호검색" />
</form>
 <%@page import="java.io.*"%>
<%
	BufferedReader br = null;
	
	try {
		br = new BufferedReader(new FileReader("./zipcode.csv"));
		String address = null;
		out.println("<br /><hr /><br />");
		out.println("<table border='1' width='800'>");
		while((address = br.readLine())!=null) {
			//System.out.println(address);
			out.println("<tr>");
			String[] addresses = address.split(",");
			if(addresses[3].startsWith(data)) {
				out.println("<td>" +address +"</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		out.println("에러:"+e.getMessage());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		out.println("에러:"+e.getMessage());
	}finally{
		if(br != null)try {br.close();}catch(IOException e) {}
	}
%>
</body>
</html>
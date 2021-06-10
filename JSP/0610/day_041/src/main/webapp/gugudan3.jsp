<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String startdan = request.getParameter("startdan") == null ? "" : request.getParameter("startdan");
	String enddan = request.getParameter("enddan") == null ? "" : request.getParameter("enddan");
%>  
<!-- guguan -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			//alert('test');
			const startdan = document.frm.startdan.value;
			const enddan = document.frm.enddan.value;
			
			if(startdan.trim() == '' || enddan.trim() == ''){
				alert('값을 입력해주세요');
				return;
			}
			
			document.frm.submit();
		};
	};

</script>
</head>
<body>
<form action="gugudan3.jsp" method="post" name="frm">
시작단<input type="text" name="startdan" />
-
끝단<input type="text" name="enddan" />
<input type="button" id="btn" value="구구단 출력"/>
</form>
<%
	if(startdan.equals("") || enddan.equals("")){
	
	}else{
		int iStrartDan = Integer.parseInt(startdan);
		int iEndDan = Integer.parseInt(enddan);
		
		out.println("<br /><hr /><br />");
		out.println("<table border='1' width='800'>");
		for(int i=iStrartDan; i<=iEndDan; i++){
			out.println("<tr>");
			for(int j=0; j<=9; j++){
				if(i==0 && j ==0){
					out.println("<td></td>");
				}else if (i == 0){
					out.println("<td>X" +j + "</td>");
				}else if(j == 0){
					out.println("<td>"+i+"단</td>");
				}else{
					out.println("<td>" + i + " X " +j + " = " + (i*j) + "</td>");
				}
			}
			out.println("</tr>");
		}
		out.println("</table>");
	}
%>
</body>
</html>
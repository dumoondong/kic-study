<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jdbc01.jsp -->
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding( "utf-8" );

	StringBuffer result = new StringBuffer();
	if(request.getParameter( "dong" ) != null) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dong = request.getParameter( "dong" );
		try{
			Context initCtx = new InitialContext();
			Context envCtx = (Context)initCtx.lookup("java:comp/env");
			DataSource dataSource = (DataSource)envCtx.lookup("jdbc/mariadb");
			
			conn = dataSource.getConnection();
			
			String sql = "select * from zipcode where dong like ?";
			pstmt = conn.prepareStatement( sql );
			pstmt.setString( 1, dong + '%' );
			rs = pstmt.executeQuery();
			result.append( "<table>" );
			while( rs.next() ) {
				result.append( "<tr>" );
				result.append( "    <td class='result'>" + rs.getString( "zipcode" ) + "</td>" );
				result.append( "    <td class='result'>" + rs.getString( "sido" ) + "</td>" );
				result.append( "    <td class='result'>" + rs.getString( "gugun" ) + "</td>" );
				result.append( "    <td class='result'>" + rs.getString( "dong" ) + "</td>" );
				result.append( "    <td class='result'>" + ( rs.getString( "ri" )==null ? "" : rs.getString( "ri" ) )+ "</td>" );
				result.append( "    <td class='result'>" + ( rs.getString( "bunji" )==null ? "" : rs.getString( "bunji" ) ) + "</td>" );
				result.append( "</tr>");
			}
			result.append( "</table>" );
			System.out.println("데이터베이스 연결 성공");
		}catch(NamingException e){
			System.out.println("에러" +e.getMessage());
		}catch(SQLException e){
			System.out.println("에러" +e.getMessage());
		}finally{
			if(conn!= null) conn.close();
		}
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table { border: 1px solid black; font-size: 15px; border-collapse: collapse; }
	td.input { width: 600px; padding: 10px; text-align: center; border: 1px solid black; }
	td.result { width: 150px; padding: 10px; border: 1px solid black; }
</style>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById( 'btn' ).onclick= function() {
			const dong = document.getElementById( 'dong' ).value;
			if( dong.length < 2 ) {
				alert( '동이름을 2자 이상 입력하셔야 합니다.' );
				return;
			}
			document.frm.submit();
		};
	};
</script>
</head>
<body>
<form action="jdbc02.jsp" method="post" name="frm">
<table>
<tr>
	<td class="input" align="absmiddle">
		<input type="text" name="dong" id="dong" size="40" placeholder="동이름 입력"/>
		<input type="button" id="btn" value="우편번호검색">
	</td>
</tr>
</table>
</form>
<hr />
<%=result %>
</body>
</html>
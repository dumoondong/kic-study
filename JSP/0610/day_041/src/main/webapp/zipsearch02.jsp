<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding( "utf-8" );
	
	StringBuffer result = new StringBuffer();
	if(request.getParameter( "dong" ) != null) {
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dong = request.getParameter( "dong" );
		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			conn = DriverManager.getConnection( url, user, password );
			
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
		} catch( ClassNotFoundException e ) {
			result.append( "[에러] + " + e.getMessage() );
		} catch(SQLException e) {
			result.append( "[에러] + " + e.getMessage() );
		} finally {
			if( rs != null ) rs.close();
			if( pstmt != null ) pstmt.close();
			if( conn != null ) conn.close();
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
<form action="zipsearch02.jsp" method="post" name="frm">
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

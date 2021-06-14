<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
	request.setCharacterEncoding( "utf-8" );

	String seq = request.getParameter( "seq" );

	String subject = "";
	String writer = "";
	String mail[] = null;
	String content = "";
	String emot = "";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		
		conn = dataSource.getConnection();
		
		String sql = "select subject, writer, mail, content, emot from emot_board1 where seq=?";
		pstmt = conn.prepareStatement( sql );
		pstmt.setString( 1, seq );
		
		rs = pstmt.executeQuery();
		
		if( rs.next() ) {
			subject = rs.getString( "subject" );
			writer = rs.getString( "writer" );
			if( rs.getString( "mail" ).equals("") ) {
				mail = new String[] { "", "" }; 
			} else {
				mail = rs.getString( "mail" ).split( "@" );
			}
			content = rs.getString( "content" );
			emot = rs.getString( "emot" );
		}
		
	} catch( NamingException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_write.css">
<script type="text/javascript">
	window.onload = function() {
		document.getElementById( 'submit1' ).onclick = function() {
			if( document.mfrm.subject.value.trim() == '' ) {
				alert( '제목을 입력하셔야 합니다.' );
				return false;
			}
			if( document.mfrm.password.value.trim() == '' ) {
				alert( '비밀번호를 입력하셔야 합니다.' );
				return false;
			}
			document.mfrm.submit();
		};
	};
</script>
</head>

<body>
<!-- 상단 디자인 -->
<div class="con_title">
	<h3>게시판</h3>
	<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
	<form action="./board_modify1_ok.jsp" method="post" name="mfrm">
	<input type="hidden" name="seq" value="<%=seq %>" />
		<div class="contents_sub">	
			<!--게시판-->
			<div class="board_write">
				<table>
				<tr>
					<th class="top">글쓴이</th>
					<td class="top" colspan="3"><input type="text" name="writer" value="<%=writer %>" class="board_view_input_mail" maxlength="5" readonly/></td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="3"><input type="text" name="subject" value="<%=subject %>" class="board_view_input" /></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td colspan="3"><input type="password" name="password" value="" class="board_view_input_mail"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="3"><textarea name="content" class="board_editor_area"><%=content %></textarea></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td colspan="3"><input type="text" name="mail1" value="<%=mail[0] %>" class="board_view_input_mail"/> @ <input type="text" name="mail2" value="<%=mail[1] %>" class="board_view_input_mail"/></td>
				</tr>
				<tr>
					<th>이모티콘</th>
					<td colspan="3" align="center">
						<table>
						<tr>
							<td>
								<img src="../../images/emoticon/emot01.png" width="25"/><br />
								<input type="radio" name="emot" value="emot01" class="input_radio" <%=emot.equals("01") ? "checked": "" %> />
							</td>
							<td>
								<img src="../../images/emoticon/emot02.png" width="25" /><br />
								<input type="radio" name="emot" value="emot02" class="input_radio" <%=emot.equals("02") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot03.png" width="25" /><br />
								<input type="radio" name="emot" value="emot03" class="input_radio" <%=emot.equals("03") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot04.png" width="25" /><br />
								<input type="radio" name="emot" value="emot04" class="input_radio" <%=emot.equals("04") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot05.png" width="25" /><br />
								<input type="radio" name="emot" value="emot05" class="input_radio" <%=emot.equals("05") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot06.png" width="25" /><br />
								<input type="radio" name="emot" value="emot06" class="input_radio" <%=emot.equals("06") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot07.png" width="25" /><br />
								<input type="radio" name="emot" value="emot07" class="input_radio" <%=emot.equals("07") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot08.png" width="25" /><br />
								<input type="radio" name="emot" value="emot08" class="input_radio" <%=emot.equals("08") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot09.png" width="25" /><br />
								<input type="radio" name="emot" value="emot09" class="input_radio" <%=emot.equals("09") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot10.png" width="25" /><br />
								<input type="radio" name="emot" value="emot10" class="input_radio" <%=emot.equals("10") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot11.png" width="25"/><br />
								<input type="radio" name="emot" value="emot11" class="input_radio" <%=emot.equals("11") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot12.png" width="25" /><br />
								<input type="radio" name="emot" value="emot12" class="input_radio" <%=emot.equals("12") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot13.png" width="25" /><br />
								<input type="radio" name="emot" value="emot13" class="input_radio" <%=emot.equals("13") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot14.png" width="25" /><br />
								<input type="radio" name="emot" value="emot14" class="input_radio" <%=emot.equals("14") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot15.png" width="25" /><br />
								<input type="radio" name="emot" value="emot15" class="input_radio" <%=emot.equals("15") ? "checked": "" %>/>
							</td>
						</tr>
						<tr>
							<td>
								<img src="../../images/emoticon/emot16.png" width="25"/><br />
								<input type="radio" name="emot" value="emot16" class="input_radio" <%=emot.equals("16") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot17.png" width="25" /><br />
								<input type="radio" name="emot" value="emot17" class="input_radio" <%=emot.equals("17") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot18.png" width="25" /><br />
								<input type="radio" name="emot" value="emot18" class="input_radio" <%=emot.equals("18") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot19.png" width="25" /><br />
								<input type="radio" name="emot" value="emot19" class="input_radio" <%=emot.equals("19") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot20.png" width="25" /><br />
								<input type="radio" name="emot" value="emot20" class="input_radio" <%=emot.equals("20") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot21.png" width="25" /><br />
								<input type="radio" name="emot" value="emot21" class="input_radio" <%=emot.equals("21") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot22.png" width="25" /><br />
								<input type="radio" name="emot" value="emot22" class="input_radio" <%=emot.equals("22") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot23.png" width="25" /><br />
								<input type="radio" name="emot" value="emot23" class="input_radio" <%=emot.equals("23") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot24.png" width="25" /><br />
								<input type="radio" name="emot" value="emot24" class="input_radio" <%=emot.equals("24") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot25.png" width="25"/><br />
								<input type="radio" name="emot" value="emot25" class="input_radio" <%=emot.equals("25") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot26.png" width="25" /><br />
								<input type="radio" name="emot" value="emot26" class="input_radio" <%=emot.equals("26") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot27.png" width="25" /><br />
								<input type="radio" name="emot" value="emot27" class="input_radio" <%=emot.equals("27") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot28.png" width="25" /><br />
								<input type="radio" name="emot" value="emot28" class="input_radio" <%=emot.equals("28") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot29.png" width="25" /><br />
								<input type="radio" name="emot" value="emot29" class="input_radio" <%=emot.equals("29") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot30.png" width="25" /><br />
								<input type="radio" name="emot" value="emot30" class="input_radio" <%=emot.equals("30") ? "checked": "" %>/>
							</td>
						</tr>
						<tr>
							<td>
								<img src="../../images/emoticon/emot31.png" width="25"/><br />
								<input type="radio" name="emot" value="emot31" class="input_radio" <%=emot.equals("31") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot32.png" width="25" /><br />
								<input type="radio" name="emot" value="emot32" class="input_radio" <%=emot.equals("32") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot33.png" width="25" /><br />
								<input type="radio" name="emot" value="emot33" class="input_radio" <%=emot.equals("33") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot34.png" width="25" /><br />
								<input type="radio" name="emot" value="emot34" class="input_radio" <%=emot.equals("34") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot35.png" width="25" /><br />
								<input type="radio" name="emot" value="emot35" class="input_radio" <%=emot.equals("35") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot36.png" width="25" /><br />
								<input type="radio" name="emot" value="emot36" class="input_radio" <%=emot.equals("36") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot37.png" width="25" /><br />
								<input type="radio" name="emot" value="emot37" class="input_radio" <%=emot.equals("37") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot38.png" width="25" /><br />
								<input type="radio" name="emot" value="emot38" class="input_radio" <%=emot.equals("38") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot39.png" width="25" /><br />
								<input type="radio" name="emot" value="emot39" class="input_radio" <%=emot.equals("39") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot40.png" width="25"/><br />
								<input type="radio" name="emot" value="emot40" class="input_radio" <%=emot.equals("40") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot41.png" width="25" /><br />
								<input type="radio" name="emot" value="emot41" class="input_radio" <%=emot.equals("41") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot42.png" width="25" /><br />
								<input type="radio" name="emot" value="emot42" class="input_radio" <%=emot.equals("42") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot43.png" width="25" /><br />
								<input type="radio" name="emot" value="emot43" class="input_radio" <%=emot.equals("43") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot44.png" width="25" /><br />
								<input type="radio" name="emot" value="emot44" class="input_radio" <%=emot.equals("44") ? "checked": "" %>/>
							</td>
							<td>
								<img src="../../images/emoticon/emot45.png" width="25" /><br />
								<input type="radio" name="emot" value="emot45" class="input_radio" <%=emot.equals("45") ? "checked": "" %>/>
							</td>
						</tr>
						</table>
					</td>
				</tr>
				</table>
			</div>
			
			<div class="btn_area">
				<div class="align_left">
					<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list1.jsp'" />
					<input type="button" value="보기" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_view1.jsp?seq=<%=seq %>'" />
				</div>
				<div class="align_right">
					<input type="button" id="submit1" value="수정" class="btn_write btn_txt01" style="cursor: pointer;" />
				</div>
			</div>
			<!--//게시판-->
		</div>
	</form>
</div>
<!-- 하단 디자인 -->

</body>
</html>

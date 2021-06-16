<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="model1.simple.BoardTO" %>
<%@ page import="model1.simple.BoardDAO" %>

<%@ page import="java.util.ArrayList" %>

<%
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardTO> datas = dao.boardList();	

	int totalRecord = datas.size();
	
	StringBuilder sbHtml = new StringBuilder();
	
	for(BoardTO to : datas){
		String seq = to.getSeq();
		String subject = to.getSubject();
		String writer = to.getWriter();
		String wdate = to.getWdate();
		String hit = to.getHit();
		int wgap = to.getWgap();
			
		sbHtml.append("<tr>");
		sbHtml.append("	<td>&nbsp;</td>");
		sbHtml.append("	<td>"+ seq +"</td>");
		sbHtml.append( "<td class='left'>" );
		sbHtml.append("		<a href='board_view1.jsp?seq=" + seq + "'>" + subject + "</a>");
		if(wgap == 0){
			sbHtml.append("		&nbsp;<img src='../../images/icon_new.gif' alt='NEW'></td>" );
		}
		sbHtml.append(" <td>"+ writer +"</td>");
		sbHtml.append(" <td>"+ wdate +"</td>");
		sbHtml.append(" <td>"+ hit +"</td>");
		sbHtml.append(" <td>&nbsp;</td>");
		sbHtml.append(" </tr>");
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_list.css">
</head>

<body>
<!-- 상단 디자인 -->
<div class="con_title">
	<h3>게시판</h3>
	<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
	<div class="contents_sub">
		<div class="board_top">
			<div class="bold">총 <span class="txt_orange"><%=totalRecord %></span>건</div>
		</div>

		<!--게시판-->
		<div class="board">
			<table>
			<tr>
				<th width="3%">&nbsp;</th>
				<th width="5%">번호</th>
				<th>제목</th>
				<th width="10%">글쓴이</th>
				<th width="17%">등록일</th>
				<th width="5%">조회</th>
				<th width="3%">&nbsp;</th>
			</tr>
<!-- 시작 -->
<%=sbHtml %>
<!--  끝  -->
			</table>
		</div>	
		<!--//게시판-->

		<div class="align_right">
			<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
		</div>
	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>

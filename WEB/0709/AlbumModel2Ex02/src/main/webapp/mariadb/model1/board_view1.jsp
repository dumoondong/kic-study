<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model1.BoardTO" %>
<%@ page import="model1.BoardDAO" %>
<%@ page import="model1.CommentTO" %>
<%@ page import="model1.CommentDAO" %>

<%@ page import="java.util.ArrayList" %>
<%
	request.setCharacterEncoding( "utf-8" );

	BoardTO bto = new BoardTO();
	bto.setSeq( request.getParameter( "seq" ) );

	BoardDAO dao = new BoardDAO();
	bto = dao.boardView( bto );
	
	String cpage = request.getParameter( "cpage" );
	String seq = bto.getSeq();
	String subject = bto.getSubject();
	String writer = bto.getWriter();
	String mail = bto.getMail();
	String wip = bto.getWip();
	String wdate = bto.getWdate();
	String hit = bto.getHit();
	String content = bto.getContent();
	String filename = bto.getFilename();
	String latitude = bto.getLatitude();
	String longitude = bto.getLongitude();
	
	CommentTO cto = new CommentTO();
	cto.setPseq( request.getParameter( "seq" ) );
	
	CommentDAO cdao = new CommentDAO();
	ArrayList<CommentTO> commentLists = cdao.commentList( cto ); 
	
	StringBuilder sbHtml = new StringBuilder();
	for( CommentTO to : commentLists ) {
		String cseq = to.getSeq();
		String cwriter = to.getWriter();
		String ccontent = to.getContent();
		String cwdate = to.getWdate();
		
		sbHtml.append( "<tr>" );
		sbHtml.append( "	<td class='coment_re' width='20%'>" );
		sbHtml.append( "		<strong>" + cwriter + "</strong> (" + cwdate + ")" );
		sbHtml.append( "		<div class='coment_re_txt'>" + ccontent + "</div>" );
		sbHtml.append( "	</td>");
		sbHtml.append( "</tr>");
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_view.css">
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('submit2').onclick = function() {
			if(document.cfrm.cwriter.value.trim() == "") {
				alert('이름을 입력하셔야 합니다.');
				return false;				
			}
			if(document.cfrm.cpassword.value.trim() == "") {
				alert('비밀번호를 입력하셔야 합니다.');
				return false;				
			}
			if(document.cfrm.ccontent.value.trim() == "") {
				alert('내용을 입력하셔야 합니다.');
				return false;				
			}
			document.cfrm.submit();
		};
	};
	
	document.getElementById('image1').onclick = function() {
		if(document.dfrm.password.value.trim() == "") {
			alert('비밀번호를 입력하셔야 합니다.');
			return false;				
		}
		document.dfrm.submit();
	};
</script>
</head>

<body>
<!-- 상단 디자인 -->
<div class="contents1"> 
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<img style="vertical-align: middle" alt="" src="../../images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
		</p>
	</div>

	<div class="contents_sub">	
	<!--게시판-->
		<div class="board_view">
			<table>
			<tr>
				<th width="10%">제목</th>
				<td width="60%"><%=subject %></td>
				<th width="10%">등록일</th>
				<td width="20%"><%=wdate %></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><%=writer + "(" + wip + "/" + mail + ")" %></td>
				<th>조회</th>
				<td><%=hit %></td>
			</tr>
			<tr>
				<th>위치정보</th>
				<td>
					위도 : (<%=latitude %>) / 경도 : (<%=longitude %>)
				</td>
				<th></th>
				<td></td>
			</tr>		
			<tr>
				<td colspan="4" height="200" valign="top" style="padding:20px; line-height:160%">
					<div id="bbs_file_wrap">
						<div>
							<img src="../../upload/<%=filename %>" width="900" onerror="" /><br />
						</div>
					</div>
					<%=content %>
				</td>
			</tr>			
			</table>
			
			<table>
			<%= sbHtml %>
			</table>

			<form action="comment_write1_ok.jsp" method="post" name="cfrm">
			<input type="hidden" name="cpage" value="<%=cpage %>" />
			<input type="hidden" name="seq" value="<%=seq %>" />
			<table>
			<tr>
				<td width="94%" class="coment_re">
					글쓴이 <input type="text" name="cwriter" maxlength="5" class="coment_input" />&nbsp;&nbsp;
					비밀번호 <input type="password" name="cpassword" class="coment_input pR10" />&nbsp;&nbsp;
				</td>
				<td width="6%" class="bg01"></td>
			</tr>
			<tr>
				<td class="bg01">
					<textarea name="ccontent" cols="" rows="" class="coment_input_text"></textarea>
				</td>
				<td align="right" class="bg01">
					<button type="button" id="submit2" class="btn_re btn_txt01">댓글등록</button>
				</td>
			</tr>
			</table>
			</form>
		</div>
		<div class="btn_area">
			<div class="align_left">			
				<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list1.jsp?cpage=<%=cpage %>'" />
			</div>
			<div class="align_right">
				<input type="button" value="수정" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_modify1.jsp?cpage=<%=cpage %>&seq=<%=seq %>'" />
				<input type="button" value="삭제" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_delete1.jsp?cpage=<%=cpage %>&seq=<%=seq %>'" />
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp?cpage=<%=cpage %>'" />
			</div>
		</div>
		<!--//게시판-->
	</div>
<!-- 하단 디자인 -->
</div>

</body>
</html>

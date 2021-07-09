<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model1.BoardTO" %>
<%@ page import="model1.BoardDAO" %>

<%
	request.setCharacterEncoding( "utf-8" );

	BoardTO to = new BoardTO();
	to.setSeq( request.getParameter( "seq" ) );
	
	BoardDAO dao = new BoardDAO();
	to = dao.boardModify( to );
	
	String cpage = request.getParameter( "cpage" );
	String seq = to.getSeq();
	String subject = to.getSubject();
	String writer = to.getWriter();
	String mail[] = to.getMail().split( "@" );
	if(mail.length <= 1) {
		mail = new String[] { "", "" };
	}
	String content = to.getContent();
	String filename = to.getFilename();
	String latitude = to.getLatitude();
	String longitude = to.getLongitude();
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
		document.getElementById("submit1").onclick = function() {
			if(document.mfrm.password.value.trim() == "") {
				alert("비밀번호를 입력하셔야 합니다.");
				return false;
			}
			if(document.mfrm.subject.value.trim() == "") {
				alert("제목을 입력하셔야 합니다.");
				return false;
			}
			if(document.mfrm.upload.value.trim() != "") {
				const extension = document.mfrm.upload.value.split('.').pop();
				if(extension != 'png' && extension != 'jpg' && extension != 'gif') {
					alert('이미지 파일을 입력하셔야 합니다.');	
					return false;
				}
			}
			document.mfrm.submit();
		};
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
	
	<form action="board_modify1_ok.jsp" method="post" name="mfrm" enctype="multipart/form-data">
		<input type="hidden" name="cpage" value="<%=cpage %>" />
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
					<th>이미지</th>
					<td colspan="3">
						기존 이미지 : <%=filename %><br /><br />
						<input type="file" name="upload" value="" class="board_view_input" /><br /><br />
						위도 : <input type="text" name="latitude" value="<%=latitude %>" class="board_view_input_mail"/> / 
						경도 : <input type="text" name="longitude" value="<%=longitude %>" class="board_view_input_mail"/>
					</td>
				</tr>
				</table>
			</div>
			
			<div class="btn_area">
				<div class="align_left">
					<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list1.jsp?cpage=<%=cpage %>'" />
					<input type="button" value="보기" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_view1.jsp?cpage=<%=cpage %>&seq=<%=seq %>'" />
				</div>
				<div class="align_right">
					<input type="button" value="수정" id="submit1" class="btn_write btn_txt01" style="cursor: pointer;" />
				</div>
			</div>
			<!--//게시판-->
		</div>
	</form>
</div>
<!-- 하단 디자인 -->

</body>
</html>

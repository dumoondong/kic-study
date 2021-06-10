<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="calendar2.jsp" method="post">
<select name="year">
	<option value="2021">2021</option>
	<option value="2022">2022</option>
	<option value="2023">2023</option>
</select>년
<select name="month">
	<option value="1">1</option>
	<option value="2">2</option>
	<option value="3">3</option>
	<option value="4">4</option>
	<option value="5">5</option>
	<option value="6">6</option>
	<option value="7">7</option>
	<option value="8">8</option>
	<option value="9">9</option>
	<option value="10">10</option>
	<option value="11">11</option>
	<option value="12">12</option>
</select>
<input type="submit" value="달력보기" />
</form>
<%
	request.setCharacterEncoding("utf-8");	

	int year = Integer.parseInt(request.getParameter("year"));
	int month = Integer.parseInt(request.getParameter("month"));
     
	int START_DAY_OF_WEEK = 0;
	int END_DAY_OF_WEEK = 0;
	int END_DAY = 0;
     
	Calendar sDay = Calendar.getInstance();
	Calendar eDay = Calendar.getInstance();
     
	sDay.set( year, month-1, 1 );
	eDay.set( year, month, 1-1 );
     
	START_DAY_OF_WEEK = sDay.get( Calendar.DAY_OF_WEEK );
	END_DAY_OF_WEEK = eDay.get( Calendar.DAY_OF_WEEK );
	END_DAY = eDay.get( Calendar.DATE );
     
	out.println( "<table width='800' border='1'>" );
	out.println( "<tr>" );
	out.println( "<td colspan='7'>" + year + "년" + month + "월</td>" );
	out.println( "</tr>" );
	out.println( "<tr>" );
	out.println( "<td>SU</td><td>MO</td><td>TU</td><td>WE</td><td>TH</td><td>FR</td><td>SA</td>" );
	out.println( "</tr>" );
     
	out.println( "<tr>" );
	for( int i=1 ; i<START_DAY_OF_WEEK ; i++ ) {
		out.println( "<td></td>" );
	}
     
	for( int i=1, n=START_DAY_OF_WEEK ; i<=END_DAY ; i++, n++ ) {
		if( n % 7 == 1 ) out.println( "<tr>" );
          
		out.println( "<td><b>" + i + "</b></td>" );
          
		if( n % 7 == 0 ) out.println( "</tr>" );
	}
     
	for( int i=END_DAY_OF_WEEK ; i<=6 ; i++ ) {
		out.println( "<td></td>" );
	}
	
	out.println( "</tr>" );
	out.println( "</table>" );
%>
</body>
</html>
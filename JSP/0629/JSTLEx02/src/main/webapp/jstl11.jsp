<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <c:redirect url="https://www.daum.net" /> --%>
<%--<c:redirect url="https://search.daum.net/search" >
	<c:param name="w" value="tot" />
	<c:param name="q" value="스타워즈" />
</c:redirect>
--%>

<c:redirect url="https://search.naver.com/search.naver" >
	<c:param name="where" value="nextarch" />
	<c:param name="query" value="hobbit" />
	<c:param name="sm" value="top_hty" />
	<c:param name="fbm" value="1" />
	<c:param name="ie" value="utf8" />
</c:redirect>
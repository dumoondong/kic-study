<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="price" value="10000" />
<fmt:formatNumber value="${price }" type="number" var="numberType" />
${numberType }<br />
통화 : <fmt:formatNumber value="${price }" type="currency" currencySymbol="원"/><br />
퍼센트 : <fmt:formatNumber value="${price }" type="percent" groupingUsed="false"/><br />
퍼센트 : <fmt:formatNumber value="${1 }" type="percent" groupingUsed="false"/><br />
퍼센트 : <fmt:formatNumber value="${0.1 }" type="percent" groupingUsed="false"/><br />

<c:set var="now" value="<%=new java.util.Date() %>" />
<fmt:formatDate value="${now }" type="date" dateStyle="full" /><br />
<fmt:formatDate value="${now }" type="date" dateStyle="short" /><br />
<fmt:formatDate value="${now }" type="time" timeStyle="full" /><br />
<fmt:formatDate value="${now }" type="time" timeStyle="short" /><br />
<fmt:formatDate value="${now }" type="time" /><br />

<fmt:formatDate value="${now }" pattern="z a h:mm" /><br />

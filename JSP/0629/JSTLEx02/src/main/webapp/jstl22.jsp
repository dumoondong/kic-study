<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="str1" value="	Hello JSTL, Hello JSTL" />
${ fn:length(str1) }<br />
${ fn:toUpperCase(str1) }<br />
${ fn:toLowerCase(str1) }<br />
${ fn:substring(str1, 3, 6) }<br />
${ fn:trim(str1) }<br />
${ fn:indexOf(str1,"JS") }<br />
 
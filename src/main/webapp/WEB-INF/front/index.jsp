<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${pd_list}" var="list" varStatus="ss">
<c:forEach items="${list}" var="l">
<c:out value="${l.value}"></c:out>
</c:forEach><p>
</c:forEach>

</body>
</html>
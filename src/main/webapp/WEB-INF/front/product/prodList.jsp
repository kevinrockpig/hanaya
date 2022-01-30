<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">  
 input.speedBuy{
 	margin-top: 5px;
    margin-right: 5px;
 }
 
 a{
 	text-decoration: none;
    color:inherit;
 }
</style>
</head>

<body>

<c:forEach items="${pd_list}" var="list" varStatus="ss">
<a href='/hanaya/prods/prodDetail/${list.pd_id}'>
<div>
商品編號: ${list.pd_id}  <${list.pd_status == 0 ? '已下架' : '熱銷中'}><br>
商品名稱: ${list.pd_name}  商品分類: ${list.type_name}<br>
商品介紹: ${list.pd_description}<br>
金額: $${list.pd_price} <br>
已出售 ${list.pd_sales}件<br>
</div></a>
<hr><br><br>
</c:forEach>
</body>
</html>
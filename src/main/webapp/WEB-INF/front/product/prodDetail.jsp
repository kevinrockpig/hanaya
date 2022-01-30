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
</style>

</head>
<body>

<c:forEach items="${pd_info}" var="list" varStatus="ss">
<div><a>
商品編號: ${list.pd_id}  <${list.pd_status == 0 ? '已下架' : '熱銷中'}><br>
商品名稱: ${list.pd_name}  商品分類: ${list.type_name}<br>
商品介紹: ${list.pd_description}<br>
金額: $${list.pd_price} <br>
數量 <input type="button" value="-"/><label> 1 </label><input type="button" value="+"/> 還剩${list.pd_stock - list.pd_sales == 0 ? '已缺貨': list.pd_stock - list.pd_sales}件<br>
<input class="speedBuy" type="button" value="直接購買"/><input type="button" value="加入購物車"/>
</a>
<img src="/img/123.jpg" > 
<img src="/hanaya/f4160c238bf2cd7dfe0531.jpg" > 
<img src="<c:url value="/hanaya/img/123.jpg"/>	" > 

</div>
<hr><br><br>
</c:forEach>
</body>
</html>
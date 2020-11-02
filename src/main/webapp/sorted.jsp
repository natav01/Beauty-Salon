
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<html>

<body>
  <head>
    <link  href="resources/css/style.css" rel="stylesheet"/>
   
</head>

<h1><fmt:message key="label.ourService" /></h1>
<div class = "table">
<table id = "service">
<tr>
<th>Service name</th>
<th>Type name</th>
<th>Price</th>
<th>Duration</th>
<th>Master</th>
</tr>
<c:forEach var = "s" items = "${serviceSorted}">
<tr>
<td>"${s.serviceName}"</td>
<td>"${s.nameOfType}"</td>
<td>"${s.price}"</td>
<td>"${s.duration}"</td>
<td>"${s.masterName}"</td>
</tr>

</c:forEach>

</table>

</div>

</body>
</html>
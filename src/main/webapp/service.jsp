<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>

<body>
  <head>
    <link  href="resources/css/style.css" rel="stylesheet"/>
   
</head>

<h1> Hi</h1>
<div class = "table">
<table>
<tr>
<th>Service name</th>
<th>Type name</th>
<th>Price</th>
<th>Duration</th>
</tr>
<c:forEach var = "s" items = "${service}">
<tr>
<td>"${s.serviceName}"</td>
<td>"${s.nameOfType}"</td>
<td>"${s.price}"</td>
<td>"${s.duration}"</td>
</tr>

</c:forEach>

</table>

</div>

</body>
</html>
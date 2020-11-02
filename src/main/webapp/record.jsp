<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<h1> <fmt:message key="label.recgreet" /></h1>
   <table>
        <tr>
        <td><fmt:message key="label.serviceName" /></td>
        <td ><select name = "Service" > 
<option>
<c:forEach var = "s" items = "${service}">

<option value = "${s.serviceName}"> "${s.serviceName}" </option>

</c:forEach>


 </option>
</select></td>
         </tr>
         </table>
    <form method="get" action="${pageContext.request.contextPath}/api/newRecord">
<input class="button" type="submit" value=<fmt:message key="label.record" />>
        </form>     
<table id = "service">
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
         

</body>
</html>
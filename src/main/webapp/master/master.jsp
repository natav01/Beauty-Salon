
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
    <fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><fmt:message key="label.master" /></h1>
<table>
<tr> <th>Name</th> <th>Surname</th> <th> Phone </th></tr>
<tr><td> <c:out value="${user.firstName}"/> </td> 
<td><c:out value="${user.lastName}"/>  </td>
<td><c:out value="${user.phoneNumber}"/>  </td></tr>
</table>


<form method="get" action="${pageContext.request.contextPath}/api/logout">
         <input class="button" type="submit" value=<fmt:message key="label.logout" />>
         </form>
         <br>
        
</body>
</html>
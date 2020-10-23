<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User page</title>
</head>
    <body>
        <h2>
          <fmt:message key="label.welcome" />,  <c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/> <br/>
        </h2>

<table>
<tr> <th>Name</th> <th>Surname</th> <th> Phone </th></tr>
<tr><td> <c:out value="${user.firstName}"/> </td> 
<td><c:out value="${user.lastName}"/>  </td>
<td><c:out value="${user.phoneNumber}"/>  </td></tr>
</table>
<br>

        <form method="get" action="${pageContext.request.contextPath}/api/logout">
         <input class="button" type="submit" value=<fmt:message key="label.logout" />>
         </form>
         <br>
         <form method="get" action="${pageContext.request.contextPath}/record.jsp">
         <input class="button" type="submit" value=<fmt:message key="label.record" />>
         </form>
         <br>
        <a href="${pageContext.request.contextPath}/index.jsp"><fmt:message key="label.mainpage" /></a>
    </body>
</html>


    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ALL USER</h1>
 <table>
    <c:forEach items="${user}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
             <td>${user.login}</td>
              <td>${user.phoneNumber}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
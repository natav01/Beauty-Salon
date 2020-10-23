
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

 <fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1> Adminnn </h1>

 <form method="get" action="${pageContext.request.contextPath}/api/find"> 
 <input class="button" type="submit" value= All ></form>
 
 
 <form method="get" action="${pageContext.request.contextPath}/api/delete">
 <table>
        <tr>
        <td><fmt:message key="label.username" /></td>
        <td ><input type = "text" name = "name"></td>
         </tr>
        
         </table>
 
         <input class="button" type="submit" value=<fmt:message key="label.delete" />>
         </form>
         <br>
          <form method="get" action="${pageContext.request.contextPath}/api/logout">
         <input class="button" type="submit" value=<fmt:message key="label.logout" />>
         </form>

</body>
</html>
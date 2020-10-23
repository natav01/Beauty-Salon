<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<html>
<head>
    <title><fmt:message key="label.regform" /></title>

</head>
<body>
        <h2>
           <fmt:message key="label.regform" /> <br/>
        </h2>
        <form method="get" action="${pageContext.request.contextPath}/api/registration">
        <table >
        <tr>
        <td><fmt:message key="label.name" /></td>
        <td ><input type = "text" name = "name"></td>
         </tr>
          <tr>
        <td><fmt:message key="label.surname" /></td>
        <td ><input type = "text" name = "surname"></td>
         </tr>
          <tr>
        <td><fmt:message key="label.email" /></td>
        <td ><input type = "text" name = "email"></td>
         </tr>
          <tr>
        <td><fmt:message key="label.username" /></td>
        <td ><input type = "text" name = "username"></td>
         </tr>
          <tr>
        <td><fmt:message key="label.password" /></td>
        <td ><input type = "password" name = "password"></td>
         </tr>
         
           <tr>
        <td><fmt:message key="label.phone" /></td>
        <td ><input type = "text" name = "phone"></td>
         </tr>
        
        </table>
         <input class="button" type="submit" value=<fmt:message key="label.registration" />>
        </form>
         
        
        <ul>
		<li><a href="?sessionLocale=en"><fmt:message key="label.langen" /></a></li>
		<li><a href="?sessionLocale=ua"><fmt:message key="label.langua" /></a></li>
		
	</ul>

        <a href="${pageContext.request.contextPath}/index.jsp"><fmt:message key="label.mainpage" /></a>
</body>
</html>
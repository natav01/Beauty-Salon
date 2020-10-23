
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> <fmt:message key="label.login" /></title>
</head>
<body>
 
        <h1><fmt:message key="label.in" /></h1><br/>
       
        <form method="get" action="${pageContext.request.contextPath}/api/login">
        <table>
        <tr>
        <td><fmt:message key="label.username" /></td>
        <td ><input type = "text" name = "name"></td>
         </tr>
         <tr>
        <td><fmt:message key="label.password" /></td>
        <td ><input type = "password" name = "pass"></td>
         </tr>
         </table>
          
           
            <input class="button" type="submit" value=<fmt:message key="label.login" />>

        </form>
        
        <ul>
		<li><a href="?sessionLocale=en"><fmt:message key="label.langen" /></a></li>
		<li><a href="?sessionLocale=ua"><fmt:message key="label.langua" /></a></li>
		
	</ul>
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp"><fmt:message key="label.mainpage" /></a>

</body>
</html>
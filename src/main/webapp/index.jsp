<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>

<html >
    <body>
        
        <h1>
          <fmt:message key="label.beauty" />
         </h1>
        
       
	<ul>
		<li><a href="?sessionLocale=en"><fmt:message key="label.langen" /></a></li>
		<li><a href="?sessionLocale=ua"><fmt:message key="label.langua" /></a></li>
		
	</ul>
	
    <br/>
        <a href="${pageContext.request.contextPath}/login.jsp"> <fmt:message key="label.login"/></a>
    <br/>
        <a href="${pageContext.request.contextPath}/registration.jsp"> <fmt:message key="label.registration"/></a>
    
<form method="get" action="${pageContext.request.contextPath}/api/ourservice">
       
        
         
           
            <input class="button" type="submit" value=<fmt:message key="label.service" />>

        </form>
    </body>
</html>

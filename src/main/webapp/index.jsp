<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isELIgnored="false" %>
<fmt:setLocale value = "${sessionScope.lang }"/>
<fmt:setBundle basename = "messages"/>

<html >
    <body>
        <head>
    <link  href="resources/css/style.css" rel="stylesheet"/>
   
</head>
<div class="header">
     <h1>
          <fmt:message key="label.beauty" />
         </h1>
         
         <a href="?sessionLocale=en"><fmt:message key="label.langen" /></a>
		<a href="?sessionLocale=ua"><fmt:message key="label.langua" /></a>
         
        
</div>

<div class="navbar">
     
        <a href="${pageContext.request.contextPath}/login.jsp"> <fmt:message key="label.login"/></a>
   
        <a href="${pageContext.request.contextPath}/registration.jsp"> <fmt:message key="label.registration"/></a>
</div>
        <div class = "main" style="background-image: url('resources/image/main.jpg'); height: 100%;">
       
	
   
    
<form method="get" action="${pageContext.request.contextPath}/api/ourservice">
       
        
         
           
            <input class="button" type="submit" value=<fmt:message key="label.service" />>

        </form>
        </div>
        
       
	<div class="info">
     <h1> <fmt:message key="label.wel"/> </h1>
</div>
  <div class="footer">
    <p><fmt:message key="label.address"/> </p>
     <p><fmt:message key="label.telephone"/> </p>
</div>
    </body>
</html>

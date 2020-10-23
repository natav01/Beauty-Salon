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
<h1> <fmt:message key="label.recgreet" /></h1>
   <table>
        <tr>
        <td><fmt:message key="label.type" /></td>
        <td ><select name = "Service" > 
<option>
<option value = "Манікюр">  Манікюр</option>
<option value = "Педикюр"> Педикюр 
 </option>
</select></td>
         </tr>
         </table>

</body>
</html>
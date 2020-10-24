
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import = "java.util.*, ua.training.model.entity.User, 
ua.training.model.service.UserService" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> ALL USER</h1>
<%

String spageid = request.getParameter("page");
int pageid = Integer.parseInt(spageid);
int total = 3;
if (pageid ==1) {}
else {
	pageid = pageid-1;
	pageid = pageid*total+1;
}
 UserService userService = new UserService() ;
List<User> user = userService.find(pageid, total);
out.print("<table>");
out.print("<tr><th>Id</th><th>Name</th><th>Surname</th>");
for (User u: user){
	out.print("<tr><td>"+u.getId()+"</td><td>"+u.getFirstName()+"</td><td>"+u.getLastName()+"</td></tr>");
}
out.print("</table>");
%>


<a href = "alluser.jsp?page=1">1</a>
<a href = "alluser.jsp?page=2">2</a>



</body>
</html>
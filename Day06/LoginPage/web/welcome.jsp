<%-- 
    Document   : welcome
    Created on : May 1, 2019, 8:04:50 PM
    Author     : ghostbob
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<c:if test="${user==null}">
    <c:redirect url="/index.jsp"/>
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome, ${user.email}!</h1>
        <div>Cookie says your email is: ${cookie["email"].value}</div>
    </body>
</html>

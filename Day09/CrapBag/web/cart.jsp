<%-- 
    Document   : cart
    Created on : May 8, 2019, 8:55:48 PM
    Author     : ghostbob
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your cart!</h1>
        <c:forEach var="thing" items="${cart}">
            ${thing.id}: ${thing.description} -- ${thing.price}<br>
        </c:forEach>
        <br>
        <div>
            <strong>Total: ${total}</strong>
        </div>
        <br>
        <div>
            <a href="/CrapBag/">Go Shopping!</a>
        </div>
    </body>
</html>

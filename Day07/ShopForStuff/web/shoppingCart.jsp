<%-- 
    Document   : shoppingCart
    Created on : May 6, 2019, 6:40:22 PM
    Author     : ghostbob
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopForStuff Cart</title>
    </head>
    <body>
        <h1>Your cart!</h1>
        <c:forEach var="item" items="${cart.items}">
            ${item.id}: ${item.name} -- ${item.price}<br>
        </c:forEach>
        Total: ${cart.total}
        <div>
            <a href="index.jsp">Go Shopping!</a>
        </div>
    </body>
</html>

<%-- 
    Document   : index
    Created on : May 8, 2019, 4:40:02 PM
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
        <h1>Welcome to my store!</h1>
        <table style="width:50%">
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Price</th>
            </tr>
            <c:forEach var="item" items="${items}">
                <tr>
                    <td>${item.id}</td>
                    <td>${item.description}</td>
                    <td>$${item.price}</td>
                    <td>
                        <form action="NewServlet" method="post">
                            <input type="hidden" name="addToCart" value="${item.id}">
                            <input type="submit" name="buyNow" value="Buy Now">
                        </form></td>
                </tr>
            </c:forEach>
        </table>
        <div>
            <br><br>
            <a href="cart.jsp">See Cart!</a>
        </div>
    </body>
</html>

<%-- 
    Document   : index
    Created on : May 1, 2019, 8:00:08 PM
    Author     : ghostbob
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<c:if test="${cookie.containsKey('email')}">--%>
    <%--<c:redirect url="/NewServlet"/>--%>
<%--</c:if>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="NewServlet" method="post">
            <input type="text" name="email"><br>
            <input type="password" name="password"><br>
            <input type="submit" name="Log In">
        </form>
        <form action="NewServlet" method="post">
            <input type="hidden" name="shopping" value="eraser">
            <input type="submit" name="Buy an Eraser">
        </form>
        <form action="NewServlet" method="post">
            <input type="hidden" name="shopping" value="pencil">
            <input type="submit" name="Buy a Pencil">
        </form>
    </body>
</html>

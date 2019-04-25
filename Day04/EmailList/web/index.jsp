<%-- 
    Document   : index
    Created on : Apr 24, 2019, 5:33:46 PM
    Author     : ghostbob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="newsletterservlet" method="post">
            <input type="text" name="email"> <br>
            <input type="submit" value="Join me!">
        </form>
    </body>
</html>

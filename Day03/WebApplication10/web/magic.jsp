<%-- 
    Document   : magic
    Created on : Apr 22, 2019, 8:20:40 PM
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
        <h1>Hello, I am magic!</h1>
        <div>
            The date is <%= request.getAttribute("theDate") %>
        </div>
        <div>
            First Name: ${user.firstName} <br>
            Last Name: ${user.lastName} <br>
            Email: ${user.email} <br>
            Favorite Color: ${user.favoriteColor} <br>
            Favorite Food: ${user.favoriteFood} <br>
        </div>
    </body>
</html>

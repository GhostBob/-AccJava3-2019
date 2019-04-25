<%-- 
    Document   : thanks
    Created on : Apr 24, 2019, 6:24:46 PM
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
        <h1>Thank you!</h1>
        <div>
            First Name: ${firstname} <br>
            Last Name: ${lastname} <br>
            Email: <%= request.getAttribute("email") %> <br>
        </div>
        <form action="NewServlet" method="get">
            <input type="submit" value="Go Back">
        </form>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            ${errors}
        </div>
        <h1>Join my email list!</h1>
        <form action="NewServlet" method="post">
            <input type="hidden" name="form" value="subscribe">
            First Name: <input type="text" name="firstname" value="${firstname}"><br>
            Last Name: <input type="text" name="lastname" value="${lastname}"><br>
            Email: <input type="text" name="email" value="${email}"><br>
            <input type="submit" value="Sign me up!">
        </form>
            <br><br>
        <form action="NewServlet" method="post">
            <input type="hidden" name="form" value="somethingelse">
            Favorite Food: <input type="text" name="food" value="${food}"><br>
            <input type="submit" value="Food?!">
        </form>
    </body>
</html>

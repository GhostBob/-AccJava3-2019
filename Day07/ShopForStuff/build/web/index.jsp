<%-- 
    Document   : index
    Created on : May 6, 2019, 6:04:35 PM
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
        <table style="width:100%">
            <tr>
                <th>Product ID</th>
                <th>Description</th> 
                <th></th>
            </tr>
            <tr>
                <td>001</td>
                <td>#2 Pencil</td>
                <td>        
                    <form action="NewServlet" method="post">
                        <!--<input type="hidden" name="shopping" value="eraser">-->
                        <input type="submit" name="pencil" value="Buy Now">
                    </form></td>
            </tr>
            <tr>
                <td>002</td>
                <td>Pencil Eraser</td>
                <td>
                    <form action="NewServlet" method="post">
                        <!--<input type="hidden" name="shopping" value="eraser">-->
                        <input type="submit" name="eraser" value="Buy Now">
                    </form></td>
                </td>
            </tr>
            <tr>
                <td>003</td>
                <td>Toothpick</td>
                <td>
                    <form action="NewServlet" method="post">
                        <!--<input type="hidden" name="shopping" value="eraser">-->
                        <input type="submit" name="toothpick" value="Buy Now">
                    </form></td>
                </td>
            </tr>
        </table>
        <a href="shoppingCart.jsp">Go to Shopping Cart</a>
    </body>
</html>

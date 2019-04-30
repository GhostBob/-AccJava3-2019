<%-- 
    Document   : el-demo
    Created on : Apr 29, 2019, 6:24:00 PM
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
        <h1>Hello EL!</h1>
        <div>
            ${name}
        </div>
        <div>
            ${myList[0]}<br>
            ${myList[1]}<br>
            ${myList[2]}<br>
            ${myList[3]}<br>
        </div>
        <div>
            ${myMap["age"]}<br>
            ${myMap["height"]}<br>
            ${myMap["gender"]}<br>
            ${myMap["weight"]}<br>
        </div>
        <div>
            ${user.firstName}<br>
            ${user.lastName}<br>
        </div>
        <div>
            ${myMap["age"]+2}<br>
            ${"2"-1}<br>
            ${"1"+"1"}<br>
            ${5*12}<br>
            ${12/3}<br>
            ${22%4}<br>
            ${true==false}<br>
            ${1==1}<br>
            ${1!=2}<br>
            ${30 < 50}<br>
            ${30 >= 50}<br>
            ${1==1 && 2!=3}<br>
            ${1==1 || 2==3}<br>
            ${empty foo}<br>
            ${x ? "yes x" : "no x"}<br>
            ${myMap["weight"] == null}<br>
        </div>
        <div>
            ${map}<br>
            ${map["colors"]}<br>
            ${map["colors"][0]}<br>
            ${map["age"]}<br>
            ${map["name"]}<br>
            X: ${map["origin"][0]}, Y: ${map["origin"][1]}<br>
            ${map["address"]}<br>
            ${map["address"]["street"]}<br>
            ${map["address"]["city"]}, ${map["address"]["state"]} ${map["address"]["zip"]}<br>
        </div>
    </body>
</html>

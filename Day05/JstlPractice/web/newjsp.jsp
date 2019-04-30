<%-- 
    Document   : newjsp
    Created on : Apr 29, 2019, 8:06:12 PM
    Author     : ghostbob
--%>


<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="color" items="${colors}">
            ${color}<br>
        </c:forEach>
        <c:out value="${colors[7]}" default="no color"/><br>
        <%-- ${color[7] != null ? colors[7] : "no color"} --%>
        <ul>
            <c:forTokens var="productCode" items="${productCodes}" 
                         delims="," >
                <li>${productCode}</li>
                </c:forTokens>
        </ul>
        <c:forEach var="color" items="${colors}" begin="1" 
                   end="9" step="1" varStatus="status">
            ${status.index}: ${color} First: ${status.first} 
            Last: ${status.last}<br>
        </c:forEach>

        <c:if test="${colors[1]=='yellow'}">
            <div>
                This will happen happen.
            </div>
        </c:if>
        <c:choose>
            <c:when test="${false}">
                This is an if
            </c:when>
            <c:when test="${false}">
                This is an else-if
            </c:when>
            <c:otherwise>
                This is an else
            </c:otherwise>
        </c:choose>
                
        <a href="<c:url value='/index.jsp'/>">Click here</a>
    </body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%-- JSP COMMENT TAG --%>
<!-- HTML COMMENT TAG -->

<%-- JSP DIRECTIVE TAG, Affects the whole @page --%>
<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%@page import="java.util.Random" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- JSP SCRIPTLET TAG --%>
<% 
    int x=3;
    System.out.println("Am I still here?");
    Random random = new Random();
    
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    String name = random.nextBoolean() == true ? "Bob" : "Susan";
    String siteLink = random.nextBoolean() == true ? "http://www.google.com" : "http://www.amazon.com";
%>
<%-- JSP DECLARATION TAG, to declare variables and/or methods, better at top of file --%>
<%! 
    public static void foo() { 
        System.out.println("Hello!"); 
    }
    public static void bar() { 
        System.out.println("Bar!"); 
    }
%>

<%-- grab the file at runtime, less efficient, updated in real time --%>
<%-- <c:import url="header.jsp" /> --%>
<jsp:include page="header.jsp" />

<%-- Bake the file in, NOT done at runtime, more efficient, but requires redeploy --%>
<!-- For your general case -->
<%-- <%@include file="header.jsp" %> --%>

    <body>
        <%-- JSP EXPRESSION TAG, to display the string value of an expression --%>
        <%= "Hello, world!" %>
        <% foo(); %>
        
        <h1>Hello World!</h1>
        
        <div>
            Copyright <%= currentYear %> <%= name %> &amp; Associates
        </div>
        <br>
        
        <a href="<%= siteLink %>"> Click this link! </a>
    
        <c:import url="footer.html" />
    </body>
</html>

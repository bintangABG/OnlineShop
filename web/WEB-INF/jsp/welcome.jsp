<%-- 
    Document   : welcome
    Created on : Dec 14, 2017, 11:26:55 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <div class="container">
            

            <h1>${pesan}</h1>
            
            
            
        </div>
            
        <jsp:include page="footer.jsp"/>
            
    </body>
</html>

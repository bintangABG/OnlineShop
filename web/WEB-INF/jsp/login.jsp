<%-- 
    Document   : login
    Created on : Oct 18, 2017, 2:48:11 PM
    Author     : zulfahmi
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    </head>
    <jsp:include page="head.jsp"/> 
        <div class="container">
            <div class="card">

                <div class="container">
                    <h2> Login Form</h2>
                    <form action="${pageContext.request.contextPath}/login/check" modelAttribute="loginBean" method="POST">

                        <div class="form-group">
                            <label path="username">Username</label>
                            <input path="username" class="form-control" id="username" placeholder="Username" name="username">
                        </div>
                        <div class="form-group">
                            <label path="password">Password</label>
                            <input type="password" path="password" class="form-control" id="password" placeholder="Password" name="password">
                        </div>
                        
                        <button type="submit" value="Submit" class="btn btn-default">Submit</button>
                    </form>
                </div>

            </div>
        </div>

    </div>
</body>
</html>

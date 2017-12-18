<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Registration</title>    
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
    </head>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <jsp:include page="head.jsp"/> 
        <div class="container">
            <div class="card">

                <div class="container">
                    <h2> Registration Form</h2>
                    <form action="register/save" modelAttribute="registerBean" method="POST">
                        <div class="form-group">
                            <label path="firstname">First Name</label>
                            <input path="firstname" class="form-control" id="firstname" placeholder="FirtName" name="firstname">
                        </div>
                        <div class="form-group">
                            <label path="lastname">Last Name</label>
                            <input path="lastname" class="form-control" id="lastname" placeholder="LastName" name="lastname">
                        </div>
                        <div class="form-group">
                            <label path="address">Address</label>
                            <input path="address" class="form-control" id="address" placeholder="Address" name="address">
                        </div>
                        <div class="form-group">
                            <label path="phone">Phone</label>
                            <input path="phone" class="form-control" id="phone" placeholder="Phone" name="phone">
                        </div>
                        <div class="form-group">
                            <label path="email">Email</label>
                            <input path="email" class="form-control" id="email" placeholder="Email" name="email">
                        </div>
                        <div class="form-group">
                            <label path="username">Username</label>
                            <input path="username" class="form-control" id="username" placeholder="Username" name="username">
                        </div>
                        <div class="form-group">
                            <label path="password">Password</label>
                            <input path="password" class="form-control" id="password" placeholder="Password" name="password">
                        </div>
                        
                        <button type="submit" value="Submit" class="btn btn-default">Submit</button>
                    </form>
                </div>

            </div>
        </div>

    </body>
</html>

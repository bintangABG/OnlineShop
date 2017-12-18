<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    
    <body>


    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet"/>


    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="${pageContext.request.contextPath}">OLSHOP</a>
            </div>
            <ul class="nav navbar-nav">
                <li ><a href="${pageContext.request.contextPath}">Home</a></li>

                <li><a href="${pageContext.request.contextPath}/product/all">Produk</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/cart/show"><span class="glyphicon glyphicon-shopping-cart"></span>Cart : ${cart.carts.size()}</a></li>
                <li><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div>
    </nav>



    <div class="jumbotron" style="background-image:url(http://fullmeltfusion.com/wp-content/uploads/2017/06/Shop-Button.gif)">
        <h1 align="center"></h1> 
        <h1 align="center"></h1>      

    </div>
    </body>
</html>

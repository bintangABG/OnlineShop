<%-- 
    Document   : product
    Created on : Dec 13, 2017, 3:00:33 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet"/>
        <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">
        <title>Data Produk</title>
        
        <style>
            #customers {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            #customers td, #customers th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #customers tr:nth-child(even){background-color: #f2f2f2;}

            #customers tr:hover {background-color: #ddd;}

            #customers th {
                bpadding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #6495ed;
                color: white;
            }
            </style>
        
    </head>
    <body>
        <jsp:include page="head.jsp"/> 
        <h1>Data Product</h1>
        
        <table id="customers">
            <tr>
                <th>Nama Produk</th>
                <th>Harga</th>
                <th>Gambar</th>
                <th>Aksi</th>

                <c:forEach var="d" items="${products}">
                </tr>
                <tr>
                    <td>${d.namaproduct}</td>
                    <td>${d.harga}</td>
                    <td><image src="<c:url value="/resources/image/${d.gambar}" />"/> </td>
                    <td> 
                       <c:if test="${empty sessionScope.user}">
                            <li><a href="${pageContext.request.contextPath}/login"><button class="btn btn-primary">Add to cart</button></a></li>
                       
        
                            </c:if>
                        <c:if test="${not empty sessionScope.user}">
                          <a href="${pageContext.request.contextPath}/cart/add/${d.id}" ><button class="btn btn-primary">Add to cart</button> </a>
                          
                        </c:if> 
                    </td>
                </tr>
            </c:forEach>
        </table>
        <jsp:include page="footer.jsp"/> 
    </body>
</html>

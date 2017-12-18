<%-- 
    Document   : carts
    Created on : Dec 18, 2017, 9:09:41 AM
    Author     : user
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                padding-top: 12px;
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
    <th>ID</th>
    <th>Nama</th>
    <th>Harga</th>
    <th>Aksi</th>
    
     <c:forEach var="d" items="${cart.carts}">
     </tr>
     <tr>
         <td>${d.key}</td>
          <td>${d.value.namaproduct}</td>
          <td>${d.value.harga}</td>
          <td><a href="${pageContext.request.contextPath}/cart/${d.value.id}/${d.key}"> Hapus </a></td>
          
              </tr>
            </c:forEach>
        </table>
        <jsp:include page="footer.jsp"/> 
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 15/02/2022
  Time: 1:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Viewing</title>
</head>
<body>
<h1>Infomation of product</h1>
<p>
    <a href="/ProductServlet">Back to list product</a>
</p>
<table>
    <tr>
        <td>Id:</td>
        <td>${product.getId()}</td>
    </tr>
    <tr>
        <td>Product:</td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Price:</td>
        <td>${product.getPrice()}</td>
    </tr>
    <tr>
        <td>Description:</td>
        <td>${product.getDesciption()}</td>
    </tr>
    <tr>
        <td>Factory:</td>
        <td>${product.getFactory()}</td>
    </tr>
</table>

</body>
</html>

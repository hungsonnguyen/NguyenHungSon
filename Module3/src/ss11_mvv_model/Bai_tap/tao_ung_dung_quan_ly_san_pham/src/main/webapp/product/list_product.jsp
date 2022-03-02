<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 15/02/2022
  Time: 1:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
</head>
<body>
<p>
    <a href="/ProductServlet?action=create">Create new product</a>
</p>
<table border="1" id="example" class="display compact" style="width:60%">
    <thead>
    <tr>
        <td style="text-align: center">ID product</td>
        <td style="text-align: center">Product</td>
        <td style="text-align: center">Price</td>
        <td style="text-align: center">Description</td>
        <td style="text-align: center">Factory</td>
        <td style="text-align: center">Edit</td>
        <td style="text-align: center">Delete</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td style="text-align: center" width="10%">${product.getId()}</td>
            <td style="text-align: center"><a href="/ProductServlet?action=view&id=${product.getId()}">${product.getName() }</a></td>
            <td style="text-align: center">${product.getPrice()}</td>
            <td style="text-align: center">${product.getDesciption()}</td>
            <td style="text-align: center">${product.getFactory()}</td>
            <td style="text-align: center"><a href="/ProductServlet?action=edit&id=${product.getId()}">Edit</a></td>
            <td style="text-align: center"><a href="/ProductServlet?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function() {
        $('#example').DataTable();
    } );
</script>
</html>

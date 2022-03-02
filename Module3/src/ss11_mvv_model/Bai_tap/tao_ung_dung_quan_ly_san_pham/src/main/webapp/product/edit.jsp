<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 16/02/2022
  Time: 2:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editing</title>
</head>
<body>
<h1>Edit</h1>
<a href="/ProductServlet">Back to product list</a>
<form method="post" action="/ProductServlet?action=edit">
    <fieldset>
        <legend>Edit product</legend>
<table>
    <tr>
        <td>Id:</td>
        <td><input type="text" name="id" id="id" value="${product.getId()}"></td>
    </tr>
    <tr>
    <tr>
        <td>Name:</td>
        <td><input type="text" name="name" id="name" value="${product.getName()}"></td>
    </tr>
    <tr>
        <td>Price:</td>
        <td><input type="text" name="price" id="price" value="${product.getPrice()}"></td>
    </tr>
    <tr>
        <td>Description:</td>
        <td><input type="text" name="description" id="description" value="${product.getDesciption()}"></td>
    </tr>
    <tr>
        <td>Factory:</td>
        <td><input type="text" name="factory" id="factory" value="${product.getFactory()}"></td>
    </tr>
<tr><input type="submit" value="Update"></tr>
</table>
    </fieldset>
</form>
</body>
</html>

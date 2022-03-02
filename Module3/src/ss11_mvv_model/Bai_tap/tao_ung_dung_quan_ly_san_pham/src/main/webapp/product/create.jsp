<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
    <style>
        .message {
            color: green;
        }
    </style>
</head>
<body>
<h1>Create new customer</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<a href="/ProductServlet"> Back to list product</a>
<fieldset>
    <legend>Product inforamation</legend>
    <table>
        <tr>
            <td>
                <labe>Id</labe>
            </td>
            <td><input type="text" name="name" id="id"></td>
        </tr>
        <tr>
            <td>
                <labe>Name</labe>
            </td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>
                <labe>Price</labe>
            </td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
        <tr>
            <td>
                <labe>Desciption</labe>
            </td>
            <td><input type="text" name="description" id="description"></td>
        </tr>
        <tr>
            <td>
                <labe>Factory</labe>
            </td>
            <td><input type="text" name="factory" id="factory"></td>
        </tr>
<tr>
    <td><input type="submit" value="Add product"></td>
</tr>

    </table>
</fieldset>
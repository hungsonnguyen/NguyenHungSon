<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 28/02/2022
  Time: 11:08 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate">
    <div style="text-align: center">
        <h3>Word:</h3>
        <input type="text" placeholder="Enter your word..." name="english">
        <input type="submit" value="Translate">
    </div>
</form>
<div style="text-align: center">
    <h3>Vietnamese:</h3>
    <h3>${vietnamses}</h3>
</div>
</body>
</html>

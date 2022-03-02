<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2/21/2022
  Time: 08:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <label>Username</label>
    <input name="username" value="${username}">
    <label>Password</label>
    <input name="password" type="password" value="${password}">
    <input type="radio" name="save"> Lưu tài khoản
    <button type="submit">Login</button>
</form>
</body>
</html>

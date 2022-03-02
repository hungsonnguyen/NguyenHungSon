<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 1/25/2022
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<%--  Cách 1--%>
<%--  <form method="get" action="result.jsp">--%>

<form method="post" action="sum_servlet">
    Number one: <input type="text" name="numberOne">
    Number two: <input type="text" name="numberTwo">
    <button type="submit">Add</button>
  </form>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 28/02/2022
  Time: 10:16 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert" >
    <div>
        <h3>USD</h3>
        <input type="text" placeholder="Enter Usd" name="usd">
    </div>
    <div>
        <h3>Rate</h3>
        <input type="text" value="23000"  placeholder="Enter rate" name="rate">
    </div>
    <input type="submit" value="Convert">
</form>

<div>
    <h3>Result VND</h3>
    <input type="text" name="usd" value="${result}">
</div>

</body>
</html>

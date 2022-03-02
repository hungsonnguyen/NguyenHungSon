<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: KILL YOU
  Date: 2/28/2022
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${studentList}">
        <tr >
            <td>${student.id}</td>
            <td>${student.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

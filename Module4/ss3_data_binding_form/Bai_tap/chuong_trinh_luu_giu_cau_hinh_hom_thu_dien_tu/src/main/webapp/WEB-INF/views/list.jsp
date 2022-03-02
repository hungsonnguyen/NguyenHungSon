<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 02/03/2022
  Time: 3:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${message}</h3>

<table border="1">
    <c:forEach var="mail" items="${mailList}">
        <tr>
            <td>Language: ${mail.language}</td>
        </tr>
        <tr>
            <td>Page Size: ${mail.paperSize}</td>
        </tr>
        <tr>
            <td>Spam: ${mail.spam}</td>
        </tr>
        <tr>
            <td>Signature: ${mail.signature}</td>
        </tr>
    </c:forEach>

    <%--        private String language;
        private Integer paperSize;
        private Boolean spam;
        private String signature;--%>


</table>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>

<form:form action="/save" modelAttribute="mail">
    <fieldset>
        <legend><h3>Settings</h3></legend>
        <table>
            <tr>
                <td><form:label path="language"/>Language</td>
                <td><form:select path="language" items="${languageList}"/></td>
            </tr>
            <tr>
                <td><form:label path="paperSize"/>Page Size:</td>
                <td>Show <form:select path="paperSize" items="${pageSize}"/> emails per page</td>
            </tr>
            <tr>
                <td><form:label path="spam"/>Spams filter</td>
                <td><form:checkbox path="spam" value="Enable spam filter"/> Enable spam filter</td>
            </tr>
            <tr>
                <td><form:label path="signature"/>Signature</td>
                <td><form:textarea path="signature"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
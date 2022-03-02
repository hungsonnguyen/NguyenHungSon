<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 14/02/2022
  Time: 2:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <table border="1">
    <h2>Danh sách khách hàng</h2>
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach items="${customer }" var="customer">
      <tr>
        <td><c:out value="${customer.getName}"></c:out></td>
        <td><c:out value="${customer.getDateOfBirth}"></c:out></td>
        <td><c:out value="${customer.getAddress}"></c:out></td>
        <td><c:out value="${customer.getLinkImage}"></c:out></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>

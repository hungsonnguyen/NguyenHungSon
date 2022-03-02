<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 14/02/2022
  Time: 1:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <th></th>
  <h2>Product Discount Calculator</h2>
  <form method="post" action="/displayDiscount">
    <label>Product Desciption: </label><br/>
    <input type="text" name="description" placeholder="Desciption" /><br/>
    <label>List price: </label><br/>
    <input type="text" name="price" placeholder="Price" value="0"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="discount_percent" placeholder="Discount Percent" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Discount"/>
  </form>
  </body>
</html>

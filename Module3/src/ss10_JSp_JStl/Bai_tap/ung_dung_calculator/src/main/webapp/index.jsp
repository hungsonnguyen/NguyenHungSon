<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 14/02/2022
  Time: 4:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculate">
<fieldset>
  <legend>Calculator</legend>
  <table>
    <tr>
      <td>Firt operand:</td>
      <td><input name="first_operand" type="text"></td>
    </tr>
    <tr>
      <td>Operator:</td>
      <td>
        <select name="operator">
          <option value = "+">Addition</option>
          <option value = "-">Substraction</option>
          <option value = "*">Multiplication</option>
          <option value = "/">Division</option>
        </select>
      </td>
    </tr>
      <tr>
          <td>Second operand</td>
          <td><input name="second_operand" type="text"></td>
      </tr>
    <tr>
      <td><input type="submit" value="Calculate"></td>
    </tr>
  </table>
</fieldset>
  </form>
  </body>
</html>

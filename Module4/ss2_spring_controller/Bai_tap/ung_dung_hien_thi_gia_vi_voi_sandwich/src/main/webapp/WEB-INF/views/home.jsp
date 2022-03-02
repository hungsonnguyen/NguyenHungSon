<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 01/03/2022
  Time: 10:49 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form action="/save" method="post">
    <div style="text-align: center">
        <h3>Sandwich Condiments</h3>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Lettuce" name="condiment">
            <label class="form-check-label" for="inlineCheckbox1">Lettuce</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Tomato" name="condiment">
            <label class="form-check-label" for="inlineCheckbox2">Tomato</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Mustard" name="condiment">
            <label class="form-check-label" for="inlineCheckbox3">Mustard</label>
        </div>
        <div class="form-check form-check-inline">
            <input class="form-check-input" type="checkbox" id="inlineCheckbox4" value="Sprouts" name="condiment">
            <label class="form-check-label" for="inlineCheckbox3">Sprouts</label>
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </div>
</form>
<table border="1">
    <tr>
        <th>
            <h3>Sandwich with topping:</h3>
        </th>
    </tr>
    <c:forEach var="select" items="${list}">
        <tr>
            <td>${select}</td>
        </tr>
    </c:forEach>
</table>

</body>


<script>
    $(document).ready(function () {
        $('#example').DataTable();
    });
</script>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>
</html>

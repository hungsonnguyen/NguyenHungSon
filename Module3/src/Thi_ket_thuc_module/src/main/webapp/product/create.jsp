<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 24/02/2022
  Time: 9:41 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/product?action=create" method="post">
                <label><h3>Add new product</h3></label>
                <div class="form-group">
                    <label for="name-product">Name</label>
                    <input type="text" class="form-control" id="name-product" name="name-product">
                </div>
                <div class="form-group">
                    <label for="product-price">Price</label>
                    <input type="text" class="form-control" id="product-price" name="product-price">
                </div>
                <div class="form-group">
                    <label for="quanity-product">Quanity</label>
                    <input type="text" class="form-control" id="quanity-product" name="quanity-product">
                </div>

                <div class="form-group">
                    <label for="name-description">Description</label>
                    <input type="text" class="form-control" id="name-description" name="name-product">
                </div>

                <div class="form-group">
                    <label for="colorProduct">Color</label>
                    <select class="form-control" id="colorProduct" name="colorProduct">
                        <c:forEach var="type" items="${colorProductList}">
                            <option value="${type.getColorId()}">${type.getColorName()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="category">Category</label>
                    <select class="form-control" id="category" name="category">
                        <c:forEach var="type" items="${categoryList}">
                            <option value="${type.getCategoryId()}">${type.getCategoryName()}</option>
                        </c:forEach>
                    </select>
                </div>


                <button type="submit" class="btn btn-primary">Create</button>
                <a href="/product" class="btn btn-primary">Back</a>
            </form>
        </div>
    </div>
</div>


<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>

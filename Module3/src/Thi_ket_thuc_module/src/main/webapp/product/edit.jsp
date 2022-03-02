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
            <form action="/product?action=edit" method="post">
                <a class="btn btn-success" href="/product">Back to list Product</a>
                <div class="form-group">
                    <label for="id-product">ID</label>
                    <input readonly class="form-control" id="id-product" name="id-product" value="${product.getProductId()}">
                </div>
                <div class="form-group">
                    <label for="name-product">Name</label>
                    <input type="text" class="form-control" id="name-product" name="name-product" value="${product.getProductName()}">
                </div>
                <div class="form-group">
                    <label for="price-product">Price</label>
                    <input type="text" class="form-control" id="price-product" name="price-product" value="${product.getProduct_price()}">
                </div>
                <div class="form-group">
                    <label for="quantity">Quantity</label>
                    <input type="text" class="form-control" id="quantity" name="quantity" value="${product.getProductQuanity()}">
                </div>

                <div class="form-group">
                    <label for="name-description">Description</label>
                    <input type="text" class="form-control" id="name-description" name="name-description" value="${product.getProductDescription()}">
                </div>

                <div class="form-group">
                    <label for="color">Color</label>
                    <select class="form-control" id="color" name="colorType">
                        <c:forEach var="type" items="${colorProductList}">
                            <option value="${type.getColorId()}">${type.getColorName()}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="category">Category</label>
                    <select class="form-control" id="category" name="categoryType">
                        <c:forEach var="type1" items="${categoryList}">
                            <option value="${type1.getCategoryId()}">${type1.getCategoryName()}</option>
                        </c:forEach>
                    </select>
                </div>


                <button type="submit" class="btn btn-primary">Save change</button>

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

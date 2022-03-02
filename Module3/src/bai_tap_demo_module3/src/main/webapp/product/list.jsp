<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 22/02/2022
  Time: 3:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
</head>
<body>

<div>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th scope="row">Product name</th>--%>
<%--            <th scope="row">Price</th>--%>
<%--            <th scope="row">Category</th>--%>
<%--            <th scope="row">Color</th>--%>
<%--            <th scope="row"><a class="btn btn-success" href="/product?action=create">Create new Product</a></th>--%>

<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td>--%>
<%--                <input type="text" class="form-control" id="product-name" name="product-name">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="text" class="form-control" id="product-price" name="product-price">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="text" class="form-control" id="product-category" name="product-category">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <input type="text" class="form-control" id="product-color" name="product-color">--%>
<%--            </td>--%>
<%--            <td>--%>
<%--                <form action="/product?action=search" method="post">--%>
<%--                    <input type="text" class="form-control" name="search" id="search">--%>
<%--                    <button class="btn btn-success" type="submit" >Search Name</button>--%>
<%--                </form>--%>
<%--            </td>--%>
<%--        </tr>--%>

<%--    </table>--%>
    <form action="/product?action=search" method="post">
        <a class="btn btn-success" href="/product?action=create">Add new customer</a>
        <input type="text" name="search" id="search">
        <button class="btn btn-success" type="submit" >Search Name</button>
    </form>

</div>
<table>
    <tr></tr>
</table>
<table id="product-table" class="table table-striped p-2">

    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Product Name</th>
        <th scope="col">Price</th>
        <th scope="col">Quantity</th>
        <th scope="col">Color</th>
        <th scope="col">Category</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td >${product.getProductId()}</td>
            <td >${product.getProductName()}</td>
            <td >${product.getProduct_price()}</td>
            <td >${product.getProductQuanity()}</td>
            <td >${product.getColorName()}</td>
            <td >${product.getCategoryName()}</td>
            <td>
                <button class="btn btn-warning"><a href="/product?action=edit&id=${product.getProductId()}">Edit</a></button>
                <button onclick="deleteCustomer('${product.getProductId()}','${product.getProductName()}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="name-product"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden id="form-delete" method="post" action="/product">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-product">
</form>



<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>


<script>
    function deleteCustomer(id, name) {
        document.getElementById("id-product").value = id;
        document.getElementById("name-product").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>

<script>
    $(document).ready(function() {
        $('#product-table').DataTable();
    } );
</script>



</body>
</html>
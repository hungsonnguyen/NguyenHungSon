<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/02/2022
  Time: 11:57 SA
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
<a class="btn btn-success" href="/customer?action=create">Add new customer</a>
<div>
    <form action="/customer?action=search" method="post">
        <input type="text" name="search" id="search">
        <button class="btn btn-success" type="submit" >Search Name</button>
    </form>

</div>

<table id="customer_table" class="table table-striped p-2">

    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Code</th>
        <th scope="col">Name</th>
        <th scope="col">Birthday</th>
        <th scope="col">Gender</th>
        <th scope="col">Customer Type</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td >${customer.getCustomer_id()}</td>
            <td >${customer.getCustomer_code()}</td>
            <td >${customer.getCustomer_name()}</td>
            <td >${customer.getCustomer_birthday()}</td>
            <td >${customer.getCustomer_gender() ? 'Nam':'Nữ'}</td>
            <td >${customer.getCustomer_type_name()}</td>
            <td>
                <button class="btn btn-warning"><a href="/customer?action=edit&id=${customer.getCustomer_id()}">Edit</a></button>
                <button onclick="deleteCustomer('${customer.getCustomer_id()}','${customer.getCustomer_name()}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
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
                Are you sure delete <span class="text-danger" id="name-customer"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden id="form-delete" method="post" action="/customer">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-customer">
</form>



<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>


<script>
    function deleteCustomer(id, name) {
        document.getElementById("id-customer").value = id;
        document.getElementById("name-customer").innerText = name;
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
        $('#customer_table').DataTable();
    } );
</script>



</body>
</html>

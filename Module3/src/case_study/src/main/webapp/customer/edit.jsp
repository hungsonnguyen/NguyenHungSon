<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 21/02/2022
  Time: 12:35 CH
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
      <form action="/customer?action=edit" method="post">
        <div class="form-group">
          <input type="hidden" class="form-control" id="id-customer" name="id-customer" value="${customer.getCustomer_id()}">
        </div>
        <div class="form-group">
          <label for="name-customer">Name</label>
          <input type="text" class="form-control" id="name-customer" name="name-customer" value="${customer.getCustomer_name()}">
        </div>
        <div class="form-group">
          <label for="code-customer">Code</label>
          <input type="text" class="form-control" id="code-customer" name="code-customer" value="${customer.getCustomer_code()}">
        </div>
        <div class="form-group">
          <label for="birthday">Birthday</label>
          <input type="date" class="form-control" id="birthday" name="birthday" value="${customer.getCustomer_birthday()}">
        </div>
        <div class="form-group">
          <label for="gender">Gender</label>
          <select class="form-control" id="gender" name="gender" required >
            <option  value="${customer.getCustomer_gender()}">Chọn...</option>
            <option value="true" >Nam</option>
            <option value="false" >Nữ</option>
          </select>
        </div>
        <div class="form-group">
          <label for="id-card-customer" >Id Card </label>
          <input class="form-control" id="id-card-customer" name="id-card-customer" value="${customer.getCustomer_id_card()}">
        </div>
        <div class="form-group">
          <label for="phone-customer">Phone</label>
          <input class="form-control" id="phone-customer" name="phone-customer" value="${customer.getCustomer_phone()}">
        </div><div class="form-group">
        <label for="email">Email</label>
        <input class="form-control" id="email" name="email-customer" value="${customer.getCustomer_email()}">
      </div>
        <div class="form-group">
          <label for="category">CustomerType</label>
          <select class="form-control" id="category" name="idCustomerType">
            <c:forEach var="type" items="${customerTypeList}">
              <option value="${type.getCustomerTypeId()}">${type.getCustomerTypeName()}</option>
            </c:forEach>
          </select>
        </div>
        <div class="form-group">
          <label for="address-customer">Address </label>
          <input class="form-control" id="address-customer" name="address-customer" value="${customer.getCustomer_address()}">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
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
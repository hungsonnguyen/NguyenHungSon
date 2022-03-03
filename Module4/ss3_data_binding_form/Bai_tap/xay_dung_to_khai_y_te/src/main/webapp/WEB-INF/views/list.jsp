<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 02/03/2022
  Time: 4:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<c:forEach var="form" items="${formList}">


<div class="row g-3" style="margin: 50px 5% 0px 5%">
    <div class="col-md-12">

        <label for="inputName" class="form-label">Họ và tên(Ghi chữ HOA) <span style="color: red">(*)</span></label>
        <input  type="text" class="form-control" id="inputName" value="${form.name}" />
    </div>
    <div class="col-md-4">
        <label for="inputDateOfBirth" class="form-label">Năm sinh <span style="color: red">(*)</span></label>
        <input  type="date" class="form-control" id="inputDateOfBirth" value="${form.yearOfBirth}"/>
    </div>
    <div class="col-md-4">
        <label for="inputGender" class="form-label">Giới tính <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputGender" value="${form.gender}"/>
    </div>
    <div class="col-md-4">
        <label for="inputTraditional" class="form-label">Quốc tịch<span style="color: red">(*)</span></label>
        <input type="password" class="form-control" id="inputTraditional" value="${form.nationality}"/>
    </div>
    <div class="col-md-12">
        <label for="inputCMND" class="form-label">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp lệ khác <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputCMND" value="${form.idCard}"/>
    </div>
    <div><h5>Thông tin đi lại <span style="color: red">(*)</span></h5></div>
<div class="col-md-12">
    <label for="idCard" class="form-label">Thông tin phương tiện <span style="color: red">(*)</span></label>
    <input type="text" class="form-control" id="idCard" value="${form.idCard}"/>
</div>
    <div class="col-md-6">
        <label for="inputvehicleNumber" class="form-label">Số hiệu phương tiện <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputvehicleNumber" value="${form.vehicleNumber}" />
    </div>
    <div class="col-md-6">
        <label for="inputVehicleSeat" class="form-label">Số ghế <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputVehicleSeat" value="${form.vehicleSeat}"/>
    </div>
    <div class="col-md-6">
        <label for="inputStartDate" class="form-label">Ngày khởi hành <span style="color: red">(*)</span></label>
        <input type="date" class="form-control" id="inputStartDate" value="${form.startDate}"/>
    </div>
    <div class="col-md-6">
        <label for="inputEndtDate" class="form-label">Ngày kết thúc <span style="color: red">(*)</span></label>
        <input type="date" class="form-control" id="inputEndtDate" value="${form.endDate}"/>
    </div>
    <div class="col-md-12">
        <label for="keKhai" class="form-label">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="keKhai" value="${form.location14Day}"/>
    </div>
    <div class="col-md-12"><h5>Địa chỉ liên lạc</h5></div>
    <div class="col-md-4">
        <label for="inputCity" class="form-label">Tỉnh / thành <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputCity" value="${form.city}"/>
    </div>
    <div class="col-md-4">
        <label for="inputDistrict" class="form-label">Quận / huyện <span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputDistrict" value="${form.commune}"/>
    </div>
    <div class="col-md-4">
        <label for="inputCommune" class="form-label">Phường / Xã<span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="inputCommune" value="${form.district}"/>
    </div>

    <div class="col-md-12">
        <label path="address" for="address" class="form-label">Địa chỉ nơi ở <span style="color: red">(*)</span></label>
        <input path="address" type="text" class="form-control" id="address" value="${form.address}"/>
    </div>
    <div class="col-md-6">
        <label for="phoneNumber" class="form-label">Điện thoại<span style="color: red">(*)</span></label>
        <input type="text" class="form-control" id="phoneNumber" value="${form.phone}"/>
    </div>
    <div class="col-md-6">
        <label path="email" for="email" class="form-label">Email<span style="color: red">(*)</span></label>
        <input path="email" type="text" class="form-control" id="email" value="${form.email}"/>
    </div>


    <div class="col-12">
        <button type="submit" class="btn btn-primary">Back</button>
    </div>
</div>
</c:forEach>
</body>
</html>

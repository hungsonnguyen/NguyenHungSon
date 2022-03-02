<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 02/03/2022
  Time: 4:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form:form class="row g-3" style="margin: 50px 5% 0px 5%" modelAttribute="form" method="post" action="/send">
    <div class="col-md-12">

        <form:label path="name" for="inputName" class="form-label">Họ và tên(Ghi chữ HOA) <span style="color: red">(*)</span></form:label>
        <form:input path="name" type="text" class="form-control" id="inputName"/>
    </div>
    <div class="col-md-4">
        <form:label path="yearOfBirth" for="inputDateOfBirth" class="form-label">Năm sinh <span style="color: red">(*)</span></form:label>
        <form:input path="yearOfBirth" type="date" class="form-control" id="inputDateOfBirth"/>
    </div>
    <div class="col-md-4">
        <form:label path="gender" for="inputGender" class="form-label">Giới tính <span style="color: red">(*)</span></form:label>
        <form:input path="gender" type="text" class="form-control" id="inputGender"/>
    </div>
    <div class="col-md-4">
        <form:label path="nationality" for="inputTraditional" class="form-label">Quốc tịch<span style="color: red">(*)</span></form:label>
        <form:input path="nationality" type="password" class="form-control" id="inputTraditional"/>
    </div>
    <div class="col-md-12">
        <form:label path="idCard" for="inputCMND" class="form-label">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp lệ khác <span style="color: red">(*)</span></form:label>
        <form:input path="idCard" type="text" class="form-control" id="inputCMND"/>
    </div>
    <div><h5>Thông tin đi lại <span style="color: red">(*)</span></h5></div>
    <div>
        <div class="form-check form-check-inline">
            <form:radiobutton path="vehicle" class="form-check-input" name="inlineRadioOptions" id="inlineRadio1" value="Tàu bay"/>
            <label class="form-check-label" for="inlineRadio1">Tàu bay</label>
        </div>
        <div class="form-check form-check-inline">
            <form:radiobutton path="vehicle" class="form-check-input" name="inlineRadioOptions" id="inlineRadio2" value="Tàu thuyền"/>

<%--            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="Tàu thuyền">--%>
            <label class="form-check-label" for="inlineRadio2">Tàu thuyền</label>
        </div>
        <div class="form-check form-check-inline">
            <form:radiobutton path="vehicle" class="form-check-input" name="inlineRadioOptions" id="inlineRadio3" value="Ô tô"/>

<%--            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="Ô tô">--%>
            <label class="form-check-label" for="inlineRadio3">Ô tô</label>
        </div>
        <div class="form-check form-check-inline">
            <form:radiobutton path="vehicle" class="form-check-input" name="inlineRadioOptions" id="inlineRadio4" value="Khác (Ghi rõ)"/>

<%--            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio4" value="Khác (Ghi rõ)">--%>
            <label class="form-check-label" for="inlineRadio4">Khác (Ghi rõ)</label>
        </div>
    </div>
    <div class="col-md-6">
        <form:label path="vehicleNumber" for="inputvehicleNumber" class="form-label">Số hiệu phương tiện <span style="color: red">(*)</span></form:label>
        <form:input path="vehicleNumber" type="text" class="form-control" id="inputvehicleNumber"/>
    </div>
    <div class="col-md-6">
        <form:label path="vehicleSeat" for="inputVehicleSeat" class="form-label">Số ghế <span style="color: red">(*)</span></form:label>
        <form:input path="vehicleSeat" type="text" class="form-control" id="inputVehicleSeat"/>
    </div>
    <div class="col-md-6">
        <form:label path="startDate" for="inputStartDate" class="form-label">Ngày khởi hành <span style="color: red">(*)</span></form:label>
        <form:input path="startDate" type="date" class="form-control" id="inputStartDate"/>
    </div>
    <div class="col-md-6">
        <form:label path="endDate" for="inputEndtDate" class="form-label">Ngày kết thúc <span style="color: red">(*)</span></form:label>
        <form:input path="endDate" type="date" class="form-control" id="inputEndtDate"/>
    </div>
    <div class="col-md-12">
        <form:label path="location14Day" for="keKhai" class="form-label">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? <span style="color: red">(*)</span></form:label>
        <form:input path="location14Day" type="text" class="form-control" id="keKhai"/>
    </div>
    <div class="col-md-12"><h5>Địa chỉ liên lạc</h5></div>
    <div class="col-md-4">
        <form:label path="city" for="inputCity" class="form-label">Tỉnh / thành <span style="color: red">(*)</span></form:label>
        <form:input path="city" type="text" class="form-control" id="inputCity"/>
    </div>
    <div class="col-md-4">
        <form:label path="district" for="inputDistrict" class="form-label">Quận / huyện <span style="color: red">(*)</span></form:label>
        <form:input path="district" type="text" class="form-control" id="inputDistrict"/>
    </div>
    <div class="col-md-4">
        <form:label path="commune" for="inputCommune" class="form-label">Phường / Xã<span style="color: red">(*)</span></form:label>
        <form:input path="commune" type="text" class="form-control" id="inputCommune"/>
    </div>

    <div class="col-md-12">
        <form:label path="address" for="address" class="form-label">Địa chỉ nơi ở <span style="color: red">(*)</span></form:label>
        <form:input path="address" type="text" class="form-control" id="address"/>
    </div>
    <div class="col-md-6">
        <form:label path="phone" for="phoneNumber" class="form-label">Điện thoại<span style="color: red">(*)</span></form:label>
        <form:input path="phone" type="text" class="form-control" id="phoneNumber"/>
    </div>
    <div class="col-md-6">
        <form:label path="email" for="email" class="form-label">Email<span style="color: red">(*)</span></form:label>
        <form:input path="email" type="text" class="form-control" id="email"/>
    </div>


    <div class="col-12">
        <button type="submit" class="btn btn-primary">GỬI TỜ KHAI</button>
    </div>
</form:form>
</body>
</html>

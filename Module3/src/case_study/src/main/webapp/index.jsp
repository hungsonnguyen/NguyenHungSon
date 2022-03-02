<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 18/02/2022
  Time: 8:22 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
  <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
  <body>
  <div>
    <nav class="navbar navbar-light bg-light">
      <a class="navbar-brand" href="https://danang.codegym.vn/">
        <img src="https://yt3.ggpht.com/ytc/AKedOLQOho6u1Y0kZhXPaeBtm-SahMKiLaeYnpSSh_M=s900-c-k-c0x00ffffff-no-rj" width="60" height="60" alt="">
      </a>
    </nav>
    <h1>Nguyen Hung Son</h1>
  </div>
  <div>
    <nav class="navbar navbar-expand-md navbar-light bg-light ">
           <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Employee <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="/customer">Customer <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Service <span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="#">Contract <span class="sr-only">(current)</span></a>
          </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
          <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
      </div>
    </nav>
  </div>
  </body>



  <script src="/assert/jquery/jquery-3.5.1.min.js"></script>
  <script src="/assert/bootstrap413/js/popper.min.js"></script>
  <script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
  <script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
  <script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
  <script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>

  <script>
    $(document).ready(function() {
      $('#example').DataTable();
    } );
  </script>
</html>

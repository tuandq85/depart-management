<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>department list</title>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
   <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container col-12 d-flex flex-column align-items-center justify-content-center ">
	  <div class="col-6 d-flex justify-content-start p-0">
	  	<h3 class="mt-5 mb-5" >Danh sách phòng ban</h3>  
	  </div>   
	  <table class="table table-striped col-6">
	    <thead>
	      <tr>
	        <th>Mã Phòng </th>
	        <th>Tên Phòng</th>
	        <th>Trưởng Phòng</th>
	        <th>Trạng thái</th>   
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach items="${departmentList}" var="department">
			<tr>
		        <td>${department.maphong}</td>
		        <td>${department.tenphong}</td>
		        <td>${department.truongphong}</td>
		        <td>
		        	<button type="button" class="btn btn-danger">delete</button>
		        	<button  type="button" class="btn btn-primary">update</button>
		        </td> 
	      	</tr>
		  </c:forEach>
	    </tbody>
	  </table>
	</div>
</body>
</html>
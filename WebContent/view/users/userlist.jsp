<%@page import="com.practice.model.UserModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User List </title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container col-12 d-flex flex-column align-items-center justify-content-center " >
	  <h3 style="margin-top: 50px; margin-bottom: 20px">LIST USER</h3>     
	  <table class="table table-striped col-8">
	    <thead>
	      <tr>
	        <th>ID</th>
	        <th>FullName</th>
	        <th>Age </th>
	        <th >Address</th>
	        <th>Trạng thái</th>   
	      </tr>
	    </thead>
	    <tbody>
		    <c:forEach items="${userList}" var="userList">
				<tr>
					<td>${userList.id}</td>
					<td>${userlist.fullname}</td>
					<td>${userList.age}</td>
					<td>${userList.address}</td>
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
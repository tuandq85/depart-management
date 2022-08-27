<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User detail page.</title>
</head>
<body>
	<%
		String id = request.getAttribute("id").toString();
		String fullName = request.getAttribute("fullName").toString();
		String age = request.getAttribute("age").toString();
		String address = request.getAttribute("address").toString();
	%>

	<h1>user page.</h1><br/>
	<label>ID: </label><input type="text" value="<%=id%>"><br/>
	<label>Full name: </label><input type="text" value="<%=fullName%>"><br/>
	<label>Age: </label><input type="number" value="<%=age%>"><br/>
	<label>Address</label><input type="text" value="<%=address%>"><br/>
</body>
</html>
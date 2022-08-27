<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	// Declaration variable from request.
	String username = request.getParameter("username");
	String email= request.getParameter("email");
	String password= request.getParameter("password");
%>
 	<br/>
	<label>User name :</label><%=username%>
	<br/>
	<label>email :</label><%=email%>
	<br/>
	<label>password :</label><%=password%>
	<br/>
	<button type="button" class="btn btn-danger">delete</button>
	<button  type="button" class="btn btn-primary">update</button>
</body>
</html>
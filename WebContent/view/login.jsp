<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Login form</h1><br/>
	<form action="/login-info" method="post">
		<label>Username: </label> <input name="username" placeholder="input user name"><br/>
		<label>password: </label> <input name="password" type="password"><br/>
		<input type="submit" value="Submit here">
	</form>
</body>
</html>
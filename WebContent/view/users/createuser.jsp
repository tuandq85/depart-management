<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>createuser</title>
</head>
<body>

	<h1>Create user page.</h1><br/>
	<form action="/users/register" method="post">
		<label>Full name: </label><input type="text" name="fullName"><br/>
		<label>Age: </label><input type="number" name="age"><br/>
		<label>Address</label><input type="text" name="address"><br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>
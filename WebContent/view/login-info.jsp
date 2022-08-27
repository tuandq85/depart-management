<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = String.valueOf(request.getSession().getAttribute("usr"));
	%>
	<H1>Login info page.</H1><br/>
	<label><%= username %></label>
</body>
</html>
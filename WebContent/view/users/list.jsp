<%@page import="java.util.List"%>
<%@page import="com.practice.model.UserModel"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>List users page</title>
	</head>
	<body>
		<%
			List<UserModel> users = (List<UserModel>)request.getAttribute("users");
		%>
		<H1>List users</H1><br/>
		<table>
			<thead>
				<th>ID</th>
				<th>Full name</th>
				<th>Age</th>
				<th>Address</th>
			</thead>
			<tbody>
			<%
				for(UserModel user: users){
			%>
				<tr>
					<td><%= user.getId() %></td>
					<td><%= user.getFullName() %></td>
					<td><%= user.getAge() %></td>
					<td><%= user.getAddress() %></td>
				</tr>
			<%
				}
			%>
				
			</tbody>
		</table>
		<br/><br/>
		<button onclick="gotoRegister();">Go to register page</button>
	</body>
	<script type="text/javascript">
		function gotoRegister(){
			window.location.href = "/users/register-page";
		}
	</script>
</html>
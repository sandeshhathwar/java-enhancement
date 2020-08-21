<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<body>
	<form action="loginRegister" method="post">
		<table
			style="background-color: lightgreen; margin-left: 200px; margin-top: 150px;">
			<tr>
				<td><h3 style="color: darkblue;">Registration Page!!!</h3></td>
				<td></td>

			</tr>

			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1"></td>
			</tr>
			<tr>
				<td>Confirm Password :</td>
				<td><input type="password" name="password2"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="register"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
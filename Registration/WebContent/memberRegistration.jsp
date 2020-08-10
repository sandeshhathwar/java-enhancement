<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
h1 {
	text-align: center;
}

p {
	text-align: center;
}

div {
	text-align: center;
}
</style>
<title>Register</title>
</head>
<body>
	<h3>Register to proceed</h3>
	<form method="post" action="Register">
		<table>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="Uname"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="Pasword"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="Email"></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="number" name="Phone"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>
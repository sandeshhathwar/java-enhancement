<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
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
<title>Company Name</title>
</head>
<body>
	<h1>Welcome to Company name</h1>
	<p>Login or register to continue</p>
	<div>
		<form method="get" action="LoginCheck">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="login"></td>
				</tr>
			</table>
		</form>
<!-- 		<form method="post" action="Register"> -->

<!-- 			<table> -->
<!-- 				<tr> -->
<!-- 					<td><input type="submit" value="Register"></td> -->
<!-- 				</tr> -->
<!-- 			</table> -->
<!-- 		</form> -->
	</div>
</body>
</html>
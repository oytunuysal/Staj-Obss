<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="create-contact-servlet" method="POST">
		<h1>Create page form</h1>
		Please enter your name: <input type="text" name="name" id="name" maxlength = "15">
		Please enter your gsm: <input type="text" name="gsm" id="gsm" maxlength = "15">
		<br> <input type="submit" value="Submit">
	</form>
	<a href="menu.jsp">Back to menu</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="search-contact" method="POST">
		<h1>Search Contact Page</h1>
		Please enter your name: <input type="text" name="name" id="name" maxlength = "15">
		<br> <input type="submit" value="Submit" >
	</form>
	<a href="menu.jsp">Back to menu</a>
</body>
</html>
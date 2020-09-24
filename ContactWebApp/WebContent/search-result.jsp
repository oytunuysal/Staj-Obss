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
	<h1>Search Results</h1>
	<c:forEach items="${contacts}" var="contact">
		<form action="edit-contact" method="GET">
			NAME:
			<c:out value="${contact.getName()}">
			</c:out>
			GSM:
			<c:out value="${contact.getGsm()}">
			</c:out>
			<input type="hidden" id="name" name="name" value=${contact.getName()} >
			<input type="hidden" id="gsm" name="gsm" value=${contact.getGsm()}>


			<input type="submit" value="Submit">
		</form>
	</c:forEach>

	<a href="menu.jsp">Back to menu</a>
</body>
</html>
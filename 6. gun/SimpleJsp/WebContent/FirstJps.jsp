<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Enter something: <input type="text" name="something" /> <br><br>

<%@ page import="java.util.Date" %>  
Today is: <%= new Date() %>  
	<%
	String javaString = "Super cool java code";
	String something=request.getParameter("something"); 
	for(int i = 0; i<2; i++){
		%> 
		<h2>(<%= something %>)</h2>
		<%
	}
	
	%>
	<h2>(<%= javaString %>)</h2>
	
	<h2> Lame html code </h2>
</body>
</html>
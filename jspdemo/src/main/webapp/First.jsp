<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
	<%
	String name = request.getParameter("name");
	out.println("Welcome " + name);
	%><br><br>

	<%!int a, b, c;%>
	<%
	a = Integer.parseInt(request.getParameter("num"));
	b = Integer.parseInt(request.getParameter("num2"));
	c = a + b;
	out.println("output is" + c);
	%><br><br>


	Name :<%=name%>
</body>
</html>
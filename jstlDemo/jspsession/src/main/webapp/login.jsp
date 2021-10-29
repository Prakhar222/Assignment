<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import=" java.util.* "%>
	<%
	String username = request.getParameter("u_name");
	if (username.equals("admin")) {
		session.setAttribute("u_name", username);
		response.sendRedirect("home.jsp");
	} else {
		out.print("Invalid Username");
	}
	%>
</body>
</html>
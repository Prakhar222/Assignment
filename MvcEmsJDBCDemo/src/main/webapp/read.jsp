<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Read</title>
</head>
<body>
	<h2>Spring MVC Create, Read, Update and Delete (CRUD) Example</h2>
	<p>
		<strong>Student List is Here | <a href="create.jsp">Click
				for Create</a></strong>
	</p>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Address</th>
			<th>Department</th>
			<th>Designation</th>


		</tr>
		<c:forEach var="employee" items="${listEmployee}">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td>${employee.address}</td>
				<td>${employee.department}</td>
				<td>${employee.designation}</td>


				<td><a href="update/<c:out value='${employee.id}'/>">Update</a>
<%-- 					| <a href="delete/<c:out value='${student.id}'/>">Delete</a></td> --%>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
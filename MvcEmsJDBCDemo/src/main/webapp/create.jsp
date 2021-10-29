<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Create</title>
</head>
<body>
	<h2>Spring MVC Create|<a href="./read">Click for Read</a></h2>
	<form action="create" method="post">
		<pre>
   
		
	id: <input type="text" name="id" />
	
	name: <input type="text" name="name" />
	
	salary: <input type="text" name="salary" />
	
	department: <input type="text" name="department" />
	
	designation: <input type="text" name="desiganation" />
	
	address: <input type="text" name="address" />

	<input type="submit" value="Create" />
	
	
	
</pre>
	</form>
	${msg}
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page import="java.util.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'Welcome to jstl'}" />
	<c:set var="number" scope="session" value="${600}" />
	<c:out value="${number}" />
	<c:if test="${number<=1000 }">
		<p>
			number is
			<c:out value="${number}" />
		</p>
	</c:if>
	<c:choose>
		<c:when test="${number<=500}">
Number is less than 500
</c:when>
		<c:when test="${number>=500 }">
Number is greater than 500
</c:when>
		<c:otherwise>
Invalid
</c:otherwise>
	</c:choose>


	<c:remove var="number" />
	<p>
		After Remove number if:
		<c:out value="${number}" />
		<c:set var="name" value="hello prakhar" />
	<p>
		The name is:
		<c:out value="${name }" />
	</p>
	<br>
	<c:if test="${fn:containsIgnoreCase(name,'prakhar')}">
		<p>Prakhar is found</p>
	</c:if>





</body>
</html>
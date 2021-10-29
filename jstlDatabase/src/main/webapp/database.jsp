<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/sql" prefix="sql"%>
<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/employee" user="root" password="root" />
<html>
<head>
<title>Query Example</title>
</head>
<body>
<sql:query var="users" dataSource="${employee}">
select* from empNew1;
</sql:query>
<table border=1>
<c:forEach var="row" items="${users.rows}">
<tr>
<td><c:out value="${row.empName}" /></td>
<td><c:out value="${row.empId}" /></td>

</tr>
</c:forEach>
</table>
</body>
</html>
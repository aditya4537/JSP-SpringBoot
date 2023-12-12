<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${mobile}</h1>
	<table border="3" style="width: 50%">
		<tr>
			<td>IMEI</td>
			<td>Name</td>
			<td>Company</td>
			<td>Camera MegaPixel</td>
		</tr>
		
		<c:forEach var="mob" items="${mobile}">
		<tr>
			<td>${mob.imei}</td>
			<td>${mob.name}</td>
			<td>${mob.company}</td>
			<td>${mob.campix}</td>
		</tr>
		</c:forEach>
		
		
	</table>
</body>
</html>
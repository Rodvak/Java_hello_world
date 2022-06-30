<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Dojos & Ninjas</title>
</head>
<body>
	<div class="container mt-5 bg-light text-dark p-5 border border-4 border-secondary">
	<h1><c:out value="${dojo.name}"></c:out></h1>
	<table class="table table-light table-striped table-borderless mt-5">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ninja" items="${dojo.ninjas}">
					<tr>
						<td><c:out value="${ninja.firstName}"></c:out></td>
						<td><c:out value="${ninja.lastname}"></c:out></td>
						<td><c:out value="${ninja.age}"></c:out></td>						
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-outline-dark" href="/dojos">Home</a>
	</div>
</body>
</html>
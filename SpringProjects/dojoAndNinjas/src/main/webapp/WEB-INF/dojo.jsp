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
<title>Dojo</title>
</head>
<body>
	<div class="container mt-5 bg-light border border-5 border-secondary p-5">
		<h1>New Dojo</h1>
		<form:form action="/dojos/new" method="post" modelAttribute="dojo">
			<div class="mb-3">
				<form:label class="form-label" path="name">Name</form:label>
				<form:errors class="link-warning" path="name" />
				<form:input class="form-control" path="name" />
			</div>
			<input type="submit" value="Create" class="btn btn-outline-dark" />
		</form:form>
		<br />
			<a class="btn btn-outline-dark" href="/ninjas"> Add a Ninja</a>
	</div>
	
	
	<div class="container mt-5 bg-light text-dark p-5 border border-4 border-secondary">
	<h1>Dojos</h1>
	<table class="table table-light table-striped table-borderless mt-5">
			<thead>
				<tr>
					<th>Dojo Location</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dojo" items="${allDojos}">
					<tr>
						<td> <a class="text-dark" href="/dojos/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>					
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
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
<title>Ninja</title>
</head>
<body>
	<div class="container mt-5 bg-light border border-4 border-secondary p-5">
		<h1>New Ninja</h1>
		<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
			<div class="mb-3">
				<form:label class="form-label" path="firstName">Name</form:label>
				<form:errors class="link-warning" path="firstName" />
				<form:input class="form-control" path="firstName" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="lastname">Last Name</form:label>
				<form:errors class="link-warning" path="lastname" />
				<form:input class="form-control" path="lastname" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="Age">Age</form:label>
				<form:errors class="link-warning" path="Age" />
				<form:input class="form-control" path="Age" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="dojo">Dojo</form:label>
				<form:errors class="link-warning" path="dojo" />
				<form:select class="form-select" path="dojo">
					<c:forEach items="${allDojos}" var="dojo"> 
					
						<<form:option value="${dojo.id}">${dojo.name}</form:option>
					</c:forEach>
				</form:select>		
			</div>
			<input type="submit" value="Create" class="btn btn-outline-dark" />
		</form:form>
		<br />
		<a class="btn btn-outline-dark" href="/dojos">Home</a>
	</div>
</body>
</html>
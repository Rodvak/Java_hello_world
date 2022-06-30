<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>The Book</title>
</head>
<body>
	<div
		class="container bg-light bg-gradient mt-5 p-4 border border-5 border-secondary text-secondary font-monospace text-secondary">
		<h1>
			<c:out value="${book.title}"></c:out>
		</h1>
		<br />
		<h2>
			<c:out value="${book.user.getUserName()}"></c:out>
			read ${book.title} by ${book.author}.
		</h2>
		<br />
		<h3>Here are ${book.user.getUserName()}'s thoughts:</h3>
		<h4>
			<c:out value="${book.thoughts}"></c:out>
		</h4>
		<br />
		<c:if test="${book.user == loggedUser}">
			<a class="btn btn-outline-secondary" href="/books/${book.id}/edit">Edit</a><br /><br />
			<form action="/delete/${book.id}" method="post">
				<input type="hidden" name="_method" value="delete"> <input
					class="btn btn-outline-secondary" type="submit" value="Delete">
			</form>
		</c:if>
	 <br /> <a class="btn btn-outline-secondary" href="/home">Home</a>
	</div>
</body>
</html>
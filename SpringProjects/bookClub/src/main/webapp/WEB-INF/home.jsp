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
<title>Dash-board</title>
</head>
<body>
	<div
		class="container bg-light bg-gradient mt-5 p-4 border border-5 border-secondary text-secondary font-monospace text-secondary">
		<h1>Welcome, <c:out value="${loggedUser.userName}"></c:out>.</h1>
		<table
			class="table table-light table-striped table-borderless mt-5 font-monospace text-secondary">
			<thead>
				<tr>
					<th>Title</th>
					<th>Author</th>
					<th>Owner</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="book" items="${allBooks}">
					<tr>
						<td><a class="link-secondary" href="/books/${book.id}"><c:out
									value="${book.title}"></c:out></a></td>
						<td><c:out value="${book.author}"></c:out></td>
						<td><c:out value="${book.user.getUserName()}"></c:out></td>
						<td><c:if test="${book.user == loggedUser}">
								<a class="text-secondary" href="/books/${book.id}/edit">Edit</a>
								<form action="/delete/${book.id}" method="post">
									<input type="hidden" name="_method" value="delete"> 
									<input class=" btn btn-link link-secondary" type="submit" value="Delete">
								</form>
							</c:if></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-outline-secondary" href="/logout">Logout</a> <br />
		<br /> <a class="btn btn-outline-secondary" href="/create">Add a
			book</a>
	</div>

</body>
</html>



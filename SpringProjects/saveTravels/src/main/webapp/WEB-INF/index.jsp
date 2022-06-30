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
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1 class="mt-5">Save travels</h1>
		<table class="table table-dark table-striped table-borderless mt-5">
			<thead>
				<tr>
					<th>Expense</th>
					<th>Vendor</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="expense" items="${allExpenses}">
					<tr>
						<td><a class="text-warning" href="/expenses/show/${expense.id}"><c:out value="${expense.expenseName}"></c:out></a></td>
						<td><c:out value="${expense.vendor}"></c:out></td>
						<td><c:out value="${expense.amount}"></c:out></td>
						<td><a class="link-light" href="/expenses/edit/${expense.id}">Edit</a>
							
							<form action="/expenses/${expense.id}" method="post">
								<input type="hidden" name="_method" value="delete"> 
								<input class="btn-close btn-close-white" type="submit" value="">
							</form></td>						
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div
		class="container col-sm-4 bg-dark mt-5 p-3 border border-dark text-white">
		<h1>Add An Expense</h1>
		<form:form action="/expenses" method="post" modelAttribute="expense">
			<div class="mb-3">
				<form:label class="form-label" path="expenseName">Expense Name</form:label>
				<form:errors class="link-warning" path="expenseName" />
				<form:input class="form-control" path="expenseName" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="vendor">Vendor</form:label>
				<form:errors class="link-warning" path="vendor" />
				<form:input class="form-control" path="vendor" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="amount">Amount</form:label>
				<form:errors class="link-warning" path="amount" />
				<form:input class="form-control" path="amount" placeholder="$0.00" />
			</div>
			<div class="mb-3">
				<form:label class="form-label" path="description">Description</form:label>
				<form:errors class="link-warning" path="description" />
				<form:input class="form-control" type="description"
					path="description" />
			</div>
			<input type="submit" value="Submit" class="btn btn-outline-light" />
		</form:form>
	</div>
</body>
</html>
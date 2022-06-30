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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Show Expense</title>
</head>
<body>
<div class="container col-sm-3 bg-dark bg-gradient mt-5 p-4 border border-dark text-white">
	<h1>Expense Details</h1>
	<br />
	<h2>Expense Name: <c:out value="${expense.expenseName}"></c:out></h2>
	<h2>Expense Description: <c:out value="${expense.description}"></c:out></h2>
	<h2>Vendor: <c:out value="${expense.vendor}"></c:out></h2>
	<h2>Account Spent: <c:out value="${expense.amount}"></c:out></h2>
	<a class="btn btn-outline-light" href="/">Go Back</a>
</div>
</body>
</html>
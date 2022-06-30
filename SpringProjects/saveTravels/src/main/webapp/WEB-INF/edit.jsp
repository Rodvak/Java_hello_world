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
<title>Edit Expense</title>
</head>
<body>
	<div class="container col-sm-4 bg-dark mt-5 p-3 border border-dark text-white">
	<h1>Add An Expense</h1>
<form:form action="/expenses/${expense.id}" method="put" modelAttribute="expense">
    <div class="mb-3">
        <form:label class="form-label" path="expenseName">Expense Name</form:label>
        <form:errors path="expenseName"/>
        <form:input class="form-control" path="expenseName"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:input class="form-control" path="vendor"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input class="form-control" path="amount" placeholder="$0.00"/>
    </div>
    <div class="mb-3">
        <form:label class="form-label" path="description">Description</form:label>
        <form:errors path="description"/>     
        <form:input class="form-control" type="description" path="description"/>
    </div>    
    <input type="submit" value="Submit" class="btn btn-outline-light"/>
    <a class="btn btn-outline-light" href="/">Go Back</a>
</form:form>    
	</div>

</body>
</html>